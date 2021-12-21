package ru.vsu.fedosova_p_o.third;

import ru.vsu.fedosova_p_o.ShadowController;
import ru.vsu.fedosova_p_o.draw.IDrawer;
import ru.vsu.fedosova_p_o.math.Vector3;
import ru.vsu.fedosova_p_o.model.IModel;
import ru.vsu.fedosova_p_o.model.Line3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Scene {
    private List<IModel> models = new ArrayList<>();
    private Color backgroundColor;
    private ShadowController shadowController;

    public Scene(Color backgroundColor, ShadowController shadowController) {
        this.backgroundColor = backgroundColor;
        this.shadowController = shadowController;
    }

    public List<IModel> getModels() {
        return models;
    }

    public void drawWorld(ICamera camera, IDrawer drawer) {
        Color oldColor = drawer.getGraphics().getColor();
        List<IModel> allModels = new ArrayList<>(models);
        for(IModel model : models) {
            if(!(model instanceof Line3D)) {
                allModels.add(shadowController.makeShadow(model));
            }
        }
        drawer.clear(backgroundColor);
        for(IModel model : allModels) {
            List<PolyLine3D> allLines = new LinkedList<>();
            drawer.getGraphics().setColor(model.getColor());
            for(PolyLine3D polyLine3D : model.getLines()) {
                List<Vector3> newPoints = new LinkedList<>();
                for(Vector3 vector3 : polyLine3D.getPoints()) {
                    newPoints.add(camera.coordinateTransformation(vector3));
                }
                allLines.add(new PolyLine3D(newPoints, polyLine3D.isClosed()));
            }
            drawer.draw(allLines);
        }
        drawer.getGraphics().setColor(oldColor);
    }
}

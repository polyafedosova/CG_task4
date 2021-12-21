package ru.vsu.fedosova_p_o;

import ru.vsu.fedosova_p_o.math.Vector3;
import ru.vsu.fedosova_p_o.model.IModel;
import ru.vsu.fedosova_p_o.third.PolyLine3D;

import java.util.*;

public class ShadowController {

    private LightSource lightSource;
    private Flatness flatness;

    public ShadowController(LightSource lightSource, Flatness flatness) {
        this.lightSource = lightSource;
        this.flatness = flatness;
    }

    public Shadow makeShadow(IModel model) {
        List<Vector3> shadowPoints = new LinkedList<>();
        for (PolyLine3D polyLine3D : model.getLines()) {
            for (Vector3 point : polyLine3D.getPoints()) {
                float m = point.getX() - lightSource.getX();
                float n = point.getY() - lightSource.getY();
                float p = point.getZ() - lightSource.getZ();

                float t = (flatness.getA() * lightSource.getX() + flatness.getB() * lightSource.getY() + flatness.getC() * lightSource.getZ() - flatness.getD()) /
                        (flatness.getA() * m + flatness.getB() * n + flatness.getC() * p);

                float x = m * t - lightSource.getX();
                float y = n * t - lightSource.getY();
                float z = p * t - lightSource.getZ();
                shadowPoints.add(new Vector3(x, y, z));
            }
        }

        ConvexHull convexHull = new ConvexHull(shadowPoints);
        return new Shadow(convexHull.getHull());
    }


    public LightSource getLightSource() {
        return lightSource;
    }

    public void setLightSource(LightSource lightSource) {
        this.lightSource = lightSource;
    }

    public Flatness getFlatness() {
        return flatness;
    }

    public void setFlatness(Flatness flatness) {
        this.flatness = flatness;
    }



}

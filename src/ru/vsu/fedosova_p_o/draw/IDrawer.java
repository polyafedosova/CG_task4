package ru.vsu.fedosova_p_o.draw;

import ru.vsu.fedosova_p_o.Shadow;
import ru.vsu.fedosova_p_o.third.PolyLine3D;

import java.awt.*;
import java.util.List;

public interface IDrawer {

    Graphics getGraphics();
    void draw(List<PolyLine3D> lines);
    void clear(Color color);
    void drawShadow(Shadow shadow);
}

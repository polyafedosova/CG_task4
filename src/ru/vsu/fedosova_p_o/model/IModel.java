package ru.vsu.fedosova_p_o.model;

import ru.vsu.fedosova_p_o.third.PolyLine3D;

import java.awt.*;
import java.util.List;

public interface IModel {

    Color getColor();
    List<PolyLine3D> getLines();
}

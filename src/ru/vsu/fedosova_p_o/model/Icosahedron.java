package ru.vsu.fedosova_p_o.model;

import ru.vsu.fedosova_p_o.math.Vector3;
import ru.vsu.fedosova_p_o.third.PolyLine3D;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Icosahedron implements IModel {

    private Vector3 centre;
    private float radius;
    private Color color;

    public Icosahedron(Vector3 centre, float radius, Color color) {
        this.centre = centre;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public List<PolyLine3D> getLines() {
        LinkedList<PolyLine3D> lines = new LinkedList<>();
        float side = radius * 4 / (float) (Math.sqrt(10 + 2 * Math.sqrt(5)));
        float r = side / (float) (2 * Math.sin(Math.PI / 5));
        float difZ = (float) Math.sqrt(Math.pow(radius, 2) - Math.pow(r, 2));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() + radius),
                new Vector3(centre.getX() + r, centre.getY(), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() + radius),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() + radius),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() + radius),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() + radius),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r, centre.getY(), centre.getZ() + difZ)), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() - radius),
                new Vector3(centre.getX() - r, centre.getY(), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() - radius),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() - radius),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() - radius),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX(), centre.getY(), centre.getZ() - radius),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r, centre.getY(), centre.getZ() - difZ)), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() - r, centre.getY(), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() - r, centre.getY(), centre.getZ() - difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r, centre.getY(), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() + r, centre.getY(), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() + r, centre.getY(), centre.getZ() + difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r, centre.getY(), centre.getZ() + difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 2 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 2 / 5), centre.getZ() - difZ)), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3(centre.getX() - r * (float) Math.cos(2 * Math.PI * 1 / 5), centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5), centre.getZ() - difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 3 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 3 / 5), centre.getZ() + difZ),
                new Vector3(centre.getX() + r * (float) Math.cos(2 * Math.PI * 4 / 5), centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5), centre.getZ() + difZ)), true));




        return lines;
    }
}


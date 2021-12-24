package ru.vsu.fedosova_p_o.model;

import ru.vsu.fedosova_p_o.math.Vector3;
import ru.vsu.fedosova_p_o.third.PolyLine3D;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Dodecahedron implements IModel {

    private Vector3 centre;
    private float radius;
    private Color color;

    public Dodecahedron(Vector3 centre, float radius, Color color) {
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

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (1 + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5) - Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) - Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 4 / 5) + Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5) - 1) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5) - 1) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + 1 - Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 1 / 5) - Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 1 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 1 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 2 / 5) - 1) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + 1 - Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) - Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + 1) / 3, centre.getY() + r * (float) Math.sin(2 * Math.PI * 1 / 5) / 3, centre.getZ() + (radius + 2 * difZ) / 3)), true));



        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 2 / 5) - 1) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) - Math.cos(2 * Math.PI * 1 / 5) - 1) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 4 / 5) + Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 4 / 5) + Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() - (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5) - 1) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + 1 - Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) ( Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3)), true));

        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) ( Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + 1 - Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5) - Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 1 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3)), true));


        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 1 / 5) - Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5) - Math.sin(2 * Math.PI * 1 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() + r * (float) (Math.cos(2 * Math.PI * 4 / 5) + 1 - Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() + r * (float) (Math.sin(2 * Math.PI * 4 / 5) - Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() + difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 2 / 5) - 1) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - difZ / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3)), true));


        lines.add(new PolyLine3D(Arrays.asList(
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 1 / 5)) / 3, centre.getY() - r * (float) Math.sin(2 * Math.PI * 1 / 5) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 1 / 5) + Math.cos(2 * Math.PI * 2 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 1 / 5) + Math.sin(2 * Math.PI * 2 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 2 / 5) + Math.cos(2 * Math.PI * 3 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 2 / 5) + Math.sin(2 * Math.PI * 3 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (Math.cos(2 * Math.PI * 3 / 5) + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) (Math.sin(2 * Math.PI * 3 / 5) + Math.sin(2 * Math.PI * 4 / 5)) / 3, centre.getZ() - (radius + 2 * difZ) / 3),
                new Vector3(centre.getX() - r * (float) (1 + Math.cos(2 * Math.PI * 4 / 5)) / 3, centre.getY() - r * (float) Math.sin(2 * Math.PI * 4 / 5) / 3, centre.getZ() - (radius + 2 * difZ) / 3)), true));

        return lines;
    }
}

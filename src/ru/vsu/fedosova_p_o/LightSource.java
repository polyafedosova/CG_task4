package ru.vsu.fedosova_p_o;

import ru.vsu.fedosova_p_o.math.Vector3;

public class LightSource {
    private Vector3 coordinates;

    public LightSource(Vector3 coordinates) {
        this.coordinates = coordinates;
    }

    public float getX() {
        return coordinates.getX();
    }

    public float getY() {
        return coordinates.getY();
    }

    public float getZ() {
        return coordinates.getZ();
    }

}


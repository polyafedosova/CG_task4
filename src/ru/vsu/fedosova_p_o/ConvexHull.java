package ru.vsu.fedosova_p_o;


import ru.vsu.fedosova_p_o.math.Vector3;

import java.util.ArrayList;

import java.util.List;

public class ConvexHull {
    private Vector3[] pointArray;
    private final int N;
    private int D[];

    public ConvexHull(List<Vector3> pList) {
        this.pointArray = new Vector3[pList.size()];
        N = pList.size();
        int k = 0;
        for (Vector3 p : pList) {
            pointArray[k++] = p;
        }
        D = new int[2 * N];
    }

    public List<Vector3> getHull() {
        float minY = pointArray[0].getY();
        int j = 0;
        for (int i = 1; i < N; i++) {
            if (pointArray[i].getY() < minY) {
                minY = pointArray[i].getY();
                j = i;
            }
        }
        swap(0, j);

        for (int i = 1; i < N; i++) {
            pointArray[i].setArCos(angle(i));
        }

        sort(pointArray);

        int bot = N - 1;
        int top = N;
        D[top++] = 0;
        D[top++] = 1;
        int i;

        for (i = 2; i < N; i++) {
            if (isLeft(pointArray[D[top - 2]], pointArray[D[top - 1]],
                    pointArray[i]) != 0)
                break;
            D[top - 1] = i;
        }

        D[bot--] = i;
        D[top++] = i;

        int t;
        if (isLeft(pointArray[D[N]], pointArray[D[N + 1]], pointArray[D[N + 2]]) < 0) {

            t = D[N];
            D[N] = D[N + 1];
            D[N + 1] = t;
        }

        for (i++; i < N; i++) {

            if (isLeft(pointArray[D[top - 2]], pointArray[D[top - 1]],
                    pointArray[i]) > 0
                    && isLeft(pointArray[D[bot + 1]], pointArray[D[bot + 2]],
                    pointArray[i]) > 0) {
                continue;
            }


            while (isLeft(pointArray[D[top - 2]], pointArray[D[top - 1]],
                    pointArray[i]) <= 0) {
                top--;
            }
            D[top++] = i;


            while (isLeft(pointArray[D[bot + 1]], pointArray[D[bot + 2]],
                    pointArray[i]) <= 0) {
                bot++;
            }
            D[bot--] = i;
        }


        List<Vector3> resultPoints = new ArrayList<>();
        int index = 0;
        for (i = bot + 1; i < top - 1; i++) {
            resultPoints.add(index++, pointArray[D[i]]);
        }
        return resultPoints;
    }


    private float isLeft(Vector3 o, Vector3 a, Vector3 b) {
        float aoX = a.getX() - o.getX();
        float aoY = a.getY() - o.getY();
        float baX = b.getX() - a.getX();
        float baY = b.getY() - a.getY();

        return aoX * baY - aoY * baX;
    }

    private void swap(int i, int j) {
        Vector3 tempPoint = new Vector3(pointArray[j].getX(), pointArray[j].getY(), pointArray[j].getZ());
        tempPoint.setArCos(pointArray[j].getArCos());

        pointArray[j].setX(pointArray[i].getX());
        pointArray[j].setY(pointArray[i].getY());
        pointArray[j].setArCos(pointArray[i].getArCos());

        pointArray[i].setX(tempPoint.getX());
        pointArray[i].setY(tempPoint.getY());
        pointArray[i].setArCos(tempPoint.getArCos());
    }

    private double angle(int i) {
        double j, k, m, h;
        j = pointArray[i].getX() - pointArray[0].getX();
        k = pointArray[i].getY() - pointArray[0].getY();
        m = Math.sqrt(j * j + k * k);
        if (k < 0)
            j = (-1) * Math.abs(j);
        h = Math.acos(j / m);
        return h;
    }

    public void sort(Vector3[] sortableArray) {
        quickSort(sortableArray, 0, sortableArray.length);
    }

    private int partition(Vector3[] sortableArray, int leftBorder, int rightBorder) {
        int l = leftBorder;
        int r = rightBorder - 1;
        double x = sortableArray[(l + r) / 2].getArCos();
        while (l <= r) {
            while (sortableArray[l].getArCos() < x) {
                l++;
            }
            while (sortableArray[r].getArCos() > x) {
                r--;
            }
            if (l <= r) {
                swap(sortableArray, r, l);

                l++;
                r--;
            }
        }
        if (l == rightBorder) {
            l--;
        }

        return l;
    }

    private void quickSort(Vector3[] sortableArray, int leftBorder, int rightBorder) {
        if (leftBorder < rightBorder - 1) {
            int xIndex = partition(sortableArray, leftBorder, rightBorder);
            quickSort(sortableArray, leftBorder, xIndex);
            quickSort(sortableArray, xIndex, rightBorder);
        }
    }

    private void swap(Vector3[] sortableArray, int firstVariable, int secondVariable) {
        Vector3 tempTwo = sortableArray[firstVariable];
        sortableArray[firstVariable] = sortableArray[secondVariable];
        sortableArray[secondVariable] = tempTwo;
    }

}

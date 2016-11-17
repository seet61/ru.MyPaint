package ru.MyPaint;

/**
 * Created by dmitry.arefyev on 17.11.2016.
 */
public class Shape {
    private int x0, y0;

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public Shape(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public void move(int dx, int dy) {
        x0 += dx;
        y0 += dx;
    }
}

package ru.MyPaint;

/**
 * Created by dmitry.arefyev on 17.11.2016.
 */
public class Shape {
    //private int x0, y0;
    private int []c = new int[2];

    public int getX0() {
        return c[0];
    }

    public int getY0() {
        return c[1];
    }

    public void setX0(int x) {
        this.c[0] = x;
    }

    public void setY0(int y) {
        this.c[2] = y;
    }

    public Shape(int x0, int y0) {
        //this.x0 = x0;
        //this.y0 = y0;
        setX0(x0);
        setY0(y0);
    }

    public void move(int dx, int dy) {
        //x0 += dx;
        //y0 += dy;
        setX0(getX0() + dx);
        setY0(getY0() + dy);
    }
}

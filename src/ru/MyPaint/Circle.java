package ru.MyPaint;

import static java.lang.Math.PI;

/**
 * Created by dmitry.arefyev on 17.11.2016.
 */
public class Circle extends Shape{
    private int r;

    public Circle(int x0, int y0, int r) {
        super(x0, y0);
        this.r = r;
    }

    public double area() {
        return PI * this.r * this.r;
    }

    public void print() {
        System.out.println("Circle: r=" + this.r + ", x0=" + this.getX0() + ", y0=" + this.getY0());
    }
}

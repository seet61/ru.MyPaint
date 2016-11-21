package ru.MyPaint;

/**
 * Created by dmitry.arefyev on 17.11.2016.
 */
public class Rect extends Shape{
    private int a, b;

    public Rect(int a, int b, int x0, int y0) {
        super(x0,y0);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (double)a*b;
    }

    @Override
    public void print() {
        System.out.println("Rectangle: a=" + a + ", b=" + b + ", x0=" + getX0() + ", y0=" + getY0());
    }
}

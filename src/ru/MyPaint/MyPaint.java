package ru.MyPaint;
/**
 * Наследование
 * Created by dmitry.arefyev on 17.11.2016.
 */
public class MyPaint {
    public static void main(String[] args) {
        Rect r = new Rect(3, 5, 1, 1);
        r.print();
        r.move(-1, 0);
        r.print();
        Circle c = new Circle(2, 2, 5);
        System.out.println(c.area());
        c.print();
    }
}

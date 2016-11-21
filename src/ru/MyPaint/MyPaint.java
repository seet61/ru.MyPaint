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

        Shape mas[] = new Shape[]{r, c, new Rect(1, 9, 2, 7)};
        paintAll(mas);
    }

    private static void paintAll(Shape[] mas) {
        /*for (Shape h : mas) {
            System.out.println();
            if (h instanceof Rect) {
                Rect r = (Rect) h;
                r.print();
            }
            else if (h instanceof Circle) {
                Circle c = (Circle) h;
                c.print();
            }
        }*/
        //Полиморфный метод, которые вызывает метод из класса, если он не определен, то из суперкласса
        for (Shape h: mas) h.print();
    }
}

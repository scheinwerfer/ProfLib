package CSharp.LabsVar5.LabTwo;

import java.util.Scanner;

public class LabaTwo {

    private double radius;
    private double lengthOfCircle;

    public LabaTwo() {
        getSetRadius();
        calcLengthOfCircle();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getSetRadius() {
        System.out.print("Введите значение радиуса: ");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        setRadius(radius);
        System.out.println("Радиус = "+getRadius());
    }

    public void calcLengthOfCircle() {
        lengthOfCircle = 2 * Math.PI * radius;
        System.out.println("Длина окружности = "+ lengthOfCircle);
    }

    public static void main(String[] args) {
        LabaTwo start = new LabaTwo();
    }
}

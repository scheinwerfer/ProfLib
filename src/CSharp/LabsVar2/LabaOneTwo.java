package CSharp.LabsVar2;

import java.util.Scanner;

public class LabaOneTwo {

    private double a;
    private int n;

    public LabaOneTwo() {
        initNumbers();
        calc();
    }

    public void initNumbers() {
        System.out.print("Введите число А: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        System.out.print("Введите число N: ");
        Scanner in2 = new Scanner(System.in);
        n = in2.nextInt();
    }

    public void calc() {
        System.out.println(Math.pow(a,n));
    }

    public static void main(String[] args) {
        LabaOneTwo start = new LabaOneTwo();
    }
}

package Tries;

import java.util.Scanner;

public class Var7Zad1 {

    private int a;
    private int b;
    private int c;

    public Var7Zad1() {
        initValues();
        logic();
    }

    public void initValues() {
        System.out.print("Введите А:");
        Scanner in1 = new Scanner(System.in);
        a = in1.nextInt();

        System.out.print("Введите B:");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();

        System.out.print("Введите C:");
        Scanner in3 = new Scanner(System.in);
        c = in3.nextInt();
    }

    public void logic() {
        if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a -= a*2;
            b -= b*2;
            c -= c*2;
        }

        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        new Var7Zad1();
    }
}

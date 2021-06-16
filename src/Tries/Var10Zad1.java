package Tries;

import java.util.Scanner;

public class Var10Zad1 {
    private double x;

    public Var10Zad1() {
        System.out.print("Введите Х: ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();

        logic();
    }

    public void logic() {
        if (x < 10) {
            System.out.println(Math.pow(x,2));
        } else if (x >= 10 && x < 110) {
            System.out.println(Math.pow(x,3));
        } else if (x > 110) {
            System.out.println(Math.pow(x,1.0/3));
        }

    }

    public static void main(String[] args) {
        new Var10Zad1();
    }
}


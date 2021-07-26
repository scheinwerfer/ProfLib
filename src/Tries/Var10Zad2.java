package Tries;

import java.util.Scanner;

public class Var10Zad2 {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean bool;
    private String first;
    private String second;

    public Var10Zad2() {
        System.out.print("Введите х1: ");
        Scanner in = new Scanner(System.in);
        x1 = in.nextInt();

        System.out.print("Введите y1: ");
        Scanner in2 = new Scanner(System.in);
        y1 = in2.nextInt();

        System.out.print("Введите х2: ");
        Scanner in3 = new Scanner(System.in);
        x2 = in3.nextInt();

        System.out.print("Введите y2: ");
        Scanner in4 = new Scanner(System.in);
        y2 = in4.nextInt();

        logic();
    }

    public void logic() {
        if ( (x1+y1-1) % 2 == 0) {
            first = "white";
        } else {
            first = "black";
        }

        if ( (x2+y2-1) % 2 == 0) {
            second = "white";
        } else {
            second = "black";
        }

        if (first.equals(second)) {
            bool = true;
        }

        System.out.println(bool);
    }

    public static void main(String[] args) {
        new Var10Zad2();
    }
}
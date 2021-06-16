package Tries;

import java.util.Scanner;

public class Var9Zad3 {
    private int a;
    private int b;
    private int sum;

    public Var9Zad3(){
        System.out.print("Введите число А: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.print("Введите число В: ");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();

        logic();
    }

    public void logic() {
        if (a >= b) {
            System.out.println("Error");
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new Var9Zad3();
    }
}

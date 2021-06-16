package Tries;

import java.util.Scanner;

public class Var10Zad3 {
    private int num;

    public Var10Zad3() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        logic();
    }

    private void logic() {
        if (Integer.toString(num).length() == 2) {
            System.out.print("двухзначное ");
        } else {
            System.out.print("трехзначное ");
        }

        if (num % 2 == 0) {
            System.out.print("четное");
        } else {
            System.out.print("нечетное");
        }
    }

    public static void main(String[] args) {
        new Var10Zad3();
    }
}

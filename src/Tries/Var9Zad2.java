package Tries;

import java.util.Scanner;

public class Var9Zad2 {
    private int num;

    public Var9Zad2() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        logic();
    }

    public void logic() {
        if (Integer.toString(num).length() == 3) {
            char c1 = Integer.toString(num).charAt(0);
            char c2 = Integer.toString(num).charAt(1);
            char c3 = Integer.toString(num).charAt(2);
            int y = Character.getNumericValue(c3);

            switch (c1) {
                case '1' -> System.out.print("сто ");
                case '2' -> System.out.print("двести ");
                case '3' -> System.out.print("триста ");
                case '4' -> System.out.print("четыреста ");
                case '5' -> System.out.print("пятьсот ");
                case '6' -> System.out.print("шестьсот ");
                case '7' -> System.out.print("семьсот ");
                case '8' -> System.out.print("восемьсот ");
                case '9' -> System.out.print("девятьсот ");
            }

            switch (c2) {
                case '1':
                    if (y == 0) {
                        System.out.print("десять");
                    } else if (y == 1) {
                        System.out.print("одинадцать");
                    } else if (y == 2) {
                        System.out.print("двенадцать");
                    } else if (y == 3) {
                        System.out.print("тринадцать");
                    } else if (y == 4) {
                        System.out.print("четырнадцать");
                    } else if (y == 5) {
                        System.out.print("пятнадцать");
                    } else if (y == 6) {
                        System.out.print("шестнадцать");
                    } else if (y == 7) {
                        System.out.print("семнадцать");
                    } else if (y == 8) {
                        System.out.print("восемнадцать");
                    } else {
                        System.out.print("девятнадцать");
                    } break;
                case '2':
                    System.out.print("двадцать ");
                    break;
                case '3':
                    System.out.print("тридцать ");
                    break;
                case '4':
                    System.out.print("сорок ");
                    break;
                case '5':
                    System.out.print("пятьдесят ");
                    break;
                case '6':
                    System.out.print("шестьдесят ");
                    break;
                case '7':
                    System.out.print("семьдесят ");
                    break;
                case '8':
                    System.out.print("восемдесят ");
                    break;
                case '9':
                    System.out.print("девяносто ");
                    break;
            }

            switch (c3) {
                case '1' -> System.out.print("один");
                case '2' -> System.out.print("два");
                case '3' -> System.out.print("три");
                case '4' -> System.out.print("четыре");
                case '5' -> System.out.print("пять");
                case '6' -> System.out.print("шесть");
                case '7' -> System.out.print("семь");
                case '8' -> System.out.print("восемь");
                case '9' -> System.out.print("девять");
            }
        }
    }

    public static void main(String[] args) {
        new Var9Zad2();
    }
}

package CSharp.LabsVar5.LabOne;

import java.util.Scanner;

public class LabaOneTwo {

    private int num;

    public LabaOneTwo() {
        initNumber();
        month();
    }

    public void initNumber() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
    }

    public void month() {
        switch (num) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }
    }

    public static void main(String[] args) {
        LabaOneTwo start = new LabaOneTwo();
    }
}

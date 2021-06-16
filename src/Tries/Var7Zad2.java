package Tries;

import java.util.Scanner;

public class Var7Zad2 {
    private int k;

    public Var7Zad2() {
        logic();
    }

    public void logic() {
        System.out.print("Введите оценку: ");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();

        switch (k) {
            case 1 -> System.out.println("Плохо");
            case 2 -> System.out.println("неудовлетворительно");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");
            default -> System.out.println("Ошибка");
        }
    }

    public static void main(String[] args) {
        new Var7Zad2();
    }
}

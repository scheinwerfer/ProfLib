package Tries;

import java.util.Scanner;

public class Yulia {

    private String name;

    public Yulia() {
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();

        logic();
    }

    private void logic() {
        if (name.equals("Юлия")) {
            System.out.println("Петушиное имя");
        } else if (name.equals("Владислав")) {
            System.out.println("Охуенное имя");
        } else {
            System.out.println("Нормальное имя");
        }
    }

    public static void main(String[] args) {
        new Yulia();
    }
}

import java.util.Scanner;

public class Var4Zad2 {

    private int n;
    private double a;
    private double b;

    public Var4Zad2() {
        initVariables();
        operations();
    }

    public void initVariables() {
        System.out.print("Введите число А: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        System.out.print("Введите число B: ");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextDouble();

        System.out.print("Выберите действие: ");
        Scanner in3 = new Scanner(System.in);
        n = in3.nextInt();
    }

    public void operations() {
        double result;
        switch (n) {
            case 1 -> {
                System.out.println("Выбранно действие - сложение");
                result = a + b;
                System.out.println(result);
            }
            case 2 -> {
                System.out.println("Выбранно действие - вычитание");
                result = a - b;
                System.out.println(result);
            }
            case 3 -> {
                System.out.println("Выбранно действие - умножение");
                result = a * b;
                System.out.println(result);
            }
            case 4 -> {
                System.out.println("Выбранно действие - деление");
                result = a / b;
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        new Var4Zad2();
    }
}

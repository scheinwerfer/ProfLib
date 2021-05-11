import java.util.Scanner;

public class Var4Zad1 {

    private int a;
    private int b;
    private int c;

    public Var4Zad1() {
        initVariables();
        logic();
    }

    public void initVariables() {
        System.out.print("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.print("Введите второе число: ");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();

        System.out.print("Введите третье число: ");
        Scanner in3 = new Scanner(System.in);
        c = in3.nextInt();
    }

    public void logic() {
        if (b > a && c > b) {
            System.out.println("Среднее = "+b);
        }
        else if (a > b && a < c) {
            System.out.println("Среднее = "+a);
        }
        else {
            System.out.println("Среднее = "+c);
        }
    }

    public static void main(String[] args) {
        Var4Zad1 start = new Var4Zad1();
    }
}

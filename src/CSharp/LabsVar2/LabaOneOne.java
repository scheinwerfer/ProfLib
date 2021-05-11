package CSharp.LabsVar2;

import java.util.Scanner;

public class LabaOneOne {

    private int a;
    private int b;
    private int sum;

    public LabaOneOne() {
        initNumbers();
        logic();
    }

    public void initNumbers() {
        System.out.print("Введите число А: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.print("Введите число В: ");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();
    }

    public void logic() {
        if (a != b) {
            sum = a + b;
            a = sum;
            b = sum;
        }
        else {
            a = 0;
            b = 0;
        }
        System.out.println("Число А = "+a+"\nЧисло В = "+b);
    }

    public static void main(String[] args) {
        LabaOneOne start = new LabaOneOne();
    }
}

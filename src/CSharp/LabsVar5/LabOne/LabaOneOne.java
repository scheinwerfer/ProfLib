package CSharp.LabsVar5.LabOne;

import java.util.Scanner;

public class LabaOneOne {

    private int num1;
    private int num2;
    private int num3;

    public LabaOneOne() {
        initNumbers();
        logic();
    }

    public void initNumbers() {
        System.out.print("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        Scanner in2 = new Scanner(System.in);
        num2 = in2.nextInt();

        System.out.print("Введите третье число: ");
        Scanner in3 = new Scanner(System.in);
        num3 = in3.nextInt();
    }

    public void logic() {
        if ((num1 > num3) && (num2 > num3)) {
            System.out.println("Наибольшие числа: "+num1+" "+num2);
        }
        else if ((num1 > num2) && (num3 > num2)) {
            System.out.println("Наибольшие числа: "+num1+" "+num3);
        }
        else {
            System.out.println("Наибольшие числа: "+num2+" "+num3);
        }
    }

    public static void main(String[] args) {
        LabaOneOne start = new LabaOneOne();
    }
}

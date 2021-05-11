package CSharp.LabsVar5.LabOne;

import java.util.Scanner;

public class LabaOneThree {

    private double num;

    public LabaOneThree() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        num = in.nextDouble();

        System.out.print("Факториал "+(int)num+" = "+factorial(num));
    }

    public double factorial(double num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        LabaOneThree start = new LabaOneThree();
    }
}

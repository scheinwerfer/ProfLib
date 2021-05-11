package CSharp;

import java.util.Scanner;

public class Var3Zad2 {

    private int num;
    private double weight;

    public Var3Zad2() {
        initVariables();
        calcWeight();
    }

    public void initVariables() {
        System.out.print("Введите единицу массы: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        System.out.print("Введите массу: ");
        Scanner in2 = new Scanner(System.in);
        weight = in2.nextInt();
    }

    public void calcWeight() {
        switch (num) {
            case 1:
                System.out.println("Выбрана ед. измерения - кг");
                System.out.println("Масса = "+weight+" кг");
                break;
            case 2:
                System.out.println("Выбрана ед. измерения - мг");
                System.out.println("Масса = "+weight/1_000_000+" кг");
                break;
            case 3:
                System.out.println("Выбрана ед. измерения - гр");
                System.out.println("Масса = "+weight/1_000+" кг");
                break;
            case 4:
                System.out.println("Выбрана ед. измерения - т");
                System.out.println("Масса = "+weight*1_000+" кг");
                break;
            case 5:
                System.out.println("Выбрана ед. измерения - цт");
                System.out.println("Масса = "+(weight*100)+" кг");
                break;
        }
    }

    public static void main(String[] args) {
        Var3Zad2 start = new Var3Zad2();
    }
}

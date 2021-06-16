package Tries;

import java.util.ArrayList;
import java.util.Scanner;

public class Var7zad3 {
    private int n;
    private double sum;
    private ArrayList<Integer> list = new ArrayList<>();

    public Var7zad3() {
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        logic();
    }

    public void logic() {
        for (int i = 0, j = 1; i < n; i++, j++) {
            list.add(j);
            int f = list.get(i);
            sum += Math.pow((n+f),2);
        }
        sum += Math.pow(n,2);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Var7zad3();
    }
}

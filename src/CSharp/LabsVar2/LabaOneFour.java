package CSharp.LabsVar2;

import java.util.Scanner;

public class LabaOneFour {

    private int n;
    private int k = 0;

    public LabaOneFour() {
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        calc();
    }

    public void calc() {
        for (int i = 0; i < n; i++) {
            if (Math.pow(k,2) <= n) {
                k++;
            }
            else {
                System.out.println("Наименьшее число К = "+(--k));
                break;
            }
        }
    }

    public static void main(String[] args) {
        LabaOneFour start = new LabaOneFour();
    }
}

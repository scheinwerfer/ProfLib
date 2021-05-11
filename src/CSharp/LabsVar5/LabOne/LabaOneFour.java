package CSharp.LabsVar5.LabOne;

import java.util.Scanner;

public class LabaOneFour {

    private boolean bl;
    private int num;

    public LabaOneFour() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        calcNumber();
    }

    public void calcNumber() {
        for (int i = 0, numX = 0; i < num; i++, numX++) {
            if (Math.pow(3,numX) == num) {
                bl = true;
                break;
            }
        }
        System.out.println(bl);
    }

    public static void main(String[] args) {
        LabaOneFour start = new LabaOneFour();
    }
}

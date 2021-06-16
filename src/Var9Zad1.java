import java.util.Scanner;

public class Var9Zad1 {
    private int num1;
    private int num2;
    private int num3;

    public Var9Zad1() {
        inNumbers();
        System.out.println(logic());
    }

    public void inNumbers() {
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

    public String logic() {
        int resultOfPositive = 0;
        int resultOfNegative = 0;
        String str;

        if (num1 < 0) {
            resultOfNegative++;
        } else {
            resultOfPositive++;
        }

        if (num2 < 0) {
            resultOfNegative++;
        } else {
            resultOfPositive++;
        }

        if (num3 < 0) {
            resultOfNegative++;
        } else {
            resultOfPositive++;
        }
        str = "Кол-во положительных: "+resultOfPositive+"\nКол-во отрицательных: "+resultOfNegative;
        return str;
    }

    public static void main(String[] args) {
        new Var9Zad1();
    }
}

import java.util.Scanner;

public class Var3Zad3 {

    private int n;

    public Var3Zad3() {
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        calc();
    }

    public void calc() {
        for (int i = 0; i < n; i++) {
            if (Math.pow(i,2) > n) {
                System.out.println("К = "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Var3Zad3 start = new Var3Zad3();
    }
}

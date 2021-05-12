import java.util.Scanner;

public class Rectangle {
    private Scanner lengthOfFirstSide;
    private int lengthOfSecondSide;
    private int lengthOfThirdSide;
    private int lengthOfFourthSide;

    public Rectangle() {
        System.out.print("Введите значение первой стороны: ");
        Scanner in1 = new Scanner(System.in);

        inValues(in1,0,0,0);


        System.out.println("Площадь = " + square(in1.nextInt(),5));
    }

    public Scanner getLengthOfFirstSide() {
        return lengthOfFirstSide;
    }

    public void setLengthOfFirstSide(Scanner lengthOfFirstSide) {
        this.lengthOfFirstSide = lengthOfFirstSide;
    }

    public int getLengthOfSecondSide() {
        return lengthOfSecondSide;
    }

    public void setLengthOfSecondSide(int lengthOfSecondSide) {
        this.lengthOfSecondSide = lengthOfSecondSide;
    }

    public int getLengthOfThirdSide() {
        return lengthOfThirdSide;
    }

    public void setLengthOfThirdSide(int lengthOfThirdSide) {
        this.lengthOfThirdSide = lengthOfThirdSide;
    }

    public int getLengthOfFourthSide() {
        return lengthOfFourthSide;
    }

    public void setLengthOfFourthSide(int lengthOfFourthSide) {
        this.lengthOfFourthSide = lengthOfFourthSide;
    }

    public void inValues(Scanner firstValue, int secondValue, int thirdValue, int fourthValue) {
        setLengthOfFirstSide(firstValue);
        setLengthOfSecondSide(secondValue);
        setLengthOfThirdSide(thirdValue);
        setLengthOfFourthSide(fourthValue);
    }

    public String outValues() {
        return "Длина сторон: 1 ст - "+getLengthOfFirstSide()+"; 2 ст - " +getLengthOfSecondSide()+"; 3 ст - "+getLengthOfThirdSide()+"; 4 ст - "+getLengthOfFourthSide();
    }

    public int square(int firSide, int secSide) {
        return firSide * secSide;
    }

    public static void main(String[] args) {
        Rectangle e = new Rectangle();
    }
}

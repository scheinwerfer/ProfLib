package Tries;

public class StarShip extends Rockets  {
    @Override
    public void fly() {
        System.out.println("Ракета летит");
    }

    @Override
    public void verticalFly() {
        System.out.println("Ракета летит вертикально");
    }
}

public class Var4Zad4 {

    String name = "Vlad";
    String name2 = "Nikita";

    public String returnName(String name) {
        return name.toUpperCase();
    }

    public void logic() {
        if (returnName(name).equals("VLAD")) {
            System.out.println("name is Vlad");
        }
        else if (returnName(name2).equals("NIKITA")) {
            System.out.println("name is Nikita");
        }
        else {
            System.out.println("Введите имя in UpperCase");
        }
    }

    public static void main(String[] args) {
        Var4Zad4 e = new Var4Zad4();
        e.logic();
    }
}

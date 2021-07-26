package Tries;

import javax.swing.*;

public class Number extends JFrame {

    public Number() {
        setTitle("Number");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocation(500,300);
        add(new LogicOfNumber());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Number();
    }
}

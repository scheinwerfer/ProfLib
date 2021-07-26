package Tries;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicOfNumber extends JPanel implements ActionListener {

    private JTextField txt = new JTextField(13);
    private JButton btn = new JButton("Запуск");

    public LogicOfNumber() {
        add(txt);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            logic();
        }
    }

    private void logic() {
        List<Character> number = new ArrayList<>();
        for (int i = 0; i < txt.getText().length(); i++) {
            number.add(i, txt.getText().charAt(i));
        }
        number.add(' ');
        if (number.get(0) != '+') {
            Collections.rotate(number, 1);
            number.set(0, '+');
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.size(); i++) {
            sb.append(number.get(i));
        }
        txt.setText(String.valueOf(sb));
    }
}

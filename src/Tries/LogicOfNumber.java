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
        //Запись символов в список
        for (int i = 0; i < txt.getText().length(); i++) {
            number.add(i, txt.getText().charAt(i));
        }
        //Добавление пустого элемента, чтобы rotate нормально сдвигал элементы вправо
        number.add(' ');
        if (number.get(0) != '+') {
            //Сдвиг элементов вправо на 1 позицию
            Collections.rotate(number, 1);
            number.set(0, '+');
        }
        //Запись элементов в строку, потому что String.valueOf(number) выдает хуету
        //[3,7,5]
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.size(); i++) {
            sb.append(number.get(i));
        }
        txt.setText(String.valueOf(sb));
    }
}

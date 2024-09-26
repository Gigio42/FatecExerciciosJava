package aula08;

import javax.swing.*;
import java.awt.*;

public class Frame01 extends JFrame {

    private JButton btOriginal;
    private Botao btPersonalizado;

    public Frame01() {
        setTitle("Usando a herança");
        setBounds(0,0,300,200);
        setLayout(new FlowLayout());
        btOriginal = new JButton("Botão Original");
        btPersonalizado = new Botao("Botão Personalizado");
        add(btOriginal);
        add(btPersonalizado);
    }

    public static void main (String[] args) {
        Frame01 f = new Frame01();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

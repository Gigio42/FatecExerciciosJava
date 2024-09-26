package aula08;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto) {
        setText(texto);
        setBackground(Color.blue);
        setForeground(Color.WHITE);
    }
}

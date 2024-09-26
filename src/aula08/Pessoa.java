package aula08;

import javax.swing.*;
import java.io.Serializable;

public class Pessoa implements Serializable {

    int id;
    String nome;

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }

    public void digitar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        nome = JOptionPane.showInputDialog("Nome: ");
    }
}

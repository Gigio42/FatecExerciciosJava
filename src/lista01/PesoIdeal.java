package lista01;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        String alturaStr = JOptionPane.showInputDialog("Digite a altura:");

        if (alturaStr == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double altura = Double.parseDouble(alturaStr);
        double pesoIdeal = (72.7 * altura) - 58;

        JOptionPane.showMessageDialog(null, "Peso ideal: " + pesoIdeal);
        System.exit(0);
    }
}
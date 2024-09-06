package lista01;

import javax.swing.*;

public class Media {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String n2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String n3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        if (n1 == null || n2 == null || n3 == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double c = Double.parseDouble(n3);
        double media = (a + b + c) / 3;

        JOptionPane.showMessageDialog(null, "Média: " + media);
        System.exit(0);
    }
}

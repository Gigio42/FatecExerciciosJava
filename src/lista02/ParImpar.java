package lista02;

import javax.swing.*;

public class ParImpar {

    public static void main (String[] args) {
        String s = JOptionPane.showInputDialog("Número: ");

        if (s == null) {
            System.out.println("Digite um número.");
            return;
        }

        int n = Integer.parseInt(s);

        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar");
        }

        System.exit(0);
    }
}

package lista02;

import javax.swing.*;

public class SomaOuMult {

    public static void main (String[] args) {
        String n1 = JOptionPane.showInputDialog("Valor A: ");
        String n2 = JOptionPane.showInputDialog("Valor B: ");

        if (n1 == null || n2 == null) {
            System.out.println("Insira valores corretos pelo amor de Deus.");
            return;
        }

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);

        JOptionPane.showMessageDialog(null, "Resultado: " + (a == b ? (a + b) : (a * b)));

        System.exit(0);
    }
}



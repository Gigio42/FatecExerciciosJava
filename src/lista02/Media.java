package lista02;

import javax.swing.*;

public class Media {

    public static void main (String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Num1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Num2: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Num3: "));

        if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
            JOptionPane.showMessageDialog(null, "Média: " + ( (n1 + n2 + n3) / 3));
        }
        else {
            JOptionPane.showMessageDialog(null, "A média não pode ser calculada.");
        }

        System.exit(0);
    }


}

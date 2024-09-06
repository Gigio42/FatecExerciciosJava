package lista01;

import javax.swing.*;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Celsius:");

        if (s == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double c = Double.parseDouble(s);
        double f = c * 9 / 5 + 32;

        JOptionPane.showMessageDialog(null, "Fahrenheit: " + f);

        System.exit(0);
    }
}

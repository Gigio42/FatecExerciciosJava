package lista01;

import javax.swing.*;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Fahrenheit:");

        if (s == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double f = Double.parseDouble(s);
        double c = (f - 32) * 5 / 9;

        JOptionPane.showMessageDialog(null, "Celsius: " + c);
        System.exit(0);
    }
}

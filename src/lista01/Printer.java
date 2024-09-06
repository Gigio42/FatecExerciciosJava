package lista01;

import javax.swing.*;

public class Printer {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite um número:");
        String n2 = JOptionPane.showInputDialog("Digite outro número:");

        if (n1 != null && n2 != null) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);

            int soma = a + b;
            int sub = a - b;
            int mult = a * b;
            float div = (float) a / b;

            JOptionPane.showMessageDialog(null, "Soma: " + soma + "\n" + "Subtração: " + sub + "\n" + "Multiplicação: " + mult + "\n" + "Divisão: " + div);
            System.exit(0);
        } else {
            System.out.println("Você não digitou um número.");
        }
    }
}

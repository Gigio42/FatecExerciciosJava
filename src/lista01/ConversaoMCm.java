package lista01;

import javax.swing.*;

public class ConversaoMCm {
    public static void main(String[] args) {
        String metrosStr = JOptionPane.showInputDialog("Digite o valor em metros:");

        if (metrosStr == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double metros = Double.parseDouble(metrosStr);
        double centimetros = metros * 100;

        JOptionPane.showMessageDialog(null, metros + "m = " + centimetros + "cm.");
        System.exit(0);
    }
}
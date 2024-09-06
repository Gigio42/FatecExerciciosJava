package lista01;

import javax.swing.*;

public class AreaQuadrado {
    public static void main(String[] args) {
        String lStr = JOptionPane.showInputDialog("Digite o lado do quadrado:");

        if (lStr == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        float l = Float.parseFloat(lStr);
        float area = l * l;
        float dobroArea = area * 2;

        JOptionPane.showMessageDialog(null, "Área: " + String.format("%.2f", area) + "\n" + "Dobro da área: " + String.format("%.2f", dobroArea));
        System.exit(0);
    }
}
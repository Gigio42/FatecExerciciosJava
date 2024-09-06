package lista01;

import javax.swing.*;

public class AreaCircunferencia {
    public static void main(String[] args) {
        String r1 = JOptionPane.showInputDialog("Digite o raio da circunferência:");

        if (r1 == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double r = Double.parseDouble(r1);
        double area = Math.PI * r * r;

        JOptionPane.showMessageDialog(null, "Área: " + String.format("%.2f", area));
        System.exit(0);
    }
}

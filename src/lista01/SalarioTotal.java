package lista01;

import javax.swing.*;

public class SalarioTotal {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Salário por hora:");
        String h = JOptionPane.showInputDialog("Horas trabalhadas no mês:");

        if (s == null || h == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double salario = Double.parseDouble(s);
        double horas = Double.parseDouble(h);
        double salarioTotal = salario * horas;

        JOptionPane.showMessageDialog(null, "Salário total: " + salarioTotal);
        System.exit(0);
    }
}

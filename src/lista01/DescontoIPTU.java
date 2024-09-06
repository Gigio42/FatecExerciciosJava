package lista01;

import javax.swing.*;

public class DescontoIPTU {
    public static void main(String[] args) {
        String iptuStr = JOptionPane.showInputDialog("Digite o valor do IPTU:");

        if (iptuStr == null) {
            System.out.println("Você não digitou um número.");
            return;
        }

        double iptu = Double.parseDouble(iptuStr);
        double desconto = iptu * 0.05;
        double iptuComDesconto = iptu - desconto;

        String msg = String.format("IPTU: %.2f\nDesconto: %.2f\nIPTU com desconto: %.2f", iptu, desconto, iptuComDesconto);
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
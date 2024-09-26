package aula08;

import javax.swing.*;

public class Vendedor extends Funcionario{

    public double comissao;

    public void mostrar() {
        super.mostrar();
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário total: " + (salario + comissao));
        //System.out.println(codigo);
    }

    public void digitar() {
        super.digitar();
        comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão: "));
    }

}

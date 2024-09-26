package aula08;

import javax.swing.*;

public class Funcionario extends PessoaFisica {

    private int codigo;
    protected double salario;

    public void mostrar() {
        super.mostrar();
        System.out.println("Salário: " + salario);
    }

    public void digitar() {
        super.digitar();
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
    }
}

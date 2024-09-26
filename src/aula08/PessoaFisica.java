package aula08;

import javax.swing.*;

public class PessoaFisica extends Pessoa {

    public String rg, cpf;

    public void mostrar() {
        super.mostrar();
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }

    public void digitar() {
        super.digitar();
        rg = JOptionPane.showInputDialog("RG: ");
        cpf = JOptionPane.showInputDialog("CPF: ");
    }
}

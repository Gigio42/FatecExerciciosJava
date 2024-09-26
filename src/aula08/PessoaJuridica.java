package aula08;

public class PessoaJuridica extends Pessoa {
    public String cnpj, inscricao;

    public void mostrar() {
        super.mostrar();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição: " + inscricao);
    }

    public void digitar() {
        super.digitar();
        cnpj = javax.swing.JOptionPane.showInputDialog("CNPJ: ");
        inscricao = javax.swing.JOptionPane.showInputDialog("Inscrição: ");
    }
}

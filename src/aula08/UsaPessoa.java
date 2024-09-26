package aula08;

public class UsaPessoa {

    public static void main (String[] args) {

        //Não funciona pois Pessoa é uma classe abstrata
        Pessoa p1 = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Funcionario f = new Funcionario();

        f.digitar();
        f.mostrar();

        //p1.id = 1;
        //p1.nome = "Fulano";

//        pf.id = 2;
//        pf.nome = "Ciclano";
//        pf.cpf = "123.456.789-00";
//        pf.rg = "123456789";
//
//        pj.id = 3;
//        pj.nome = "Deutrano";
//        pj.cnpj = "12.345.678/0001-90";
//        pj.inscricao = "123456789";
//
//        //System.out.println("Pessoa: " + p1.id + " - " + p1.nome);
//
//        System.out.println("Pessoa Física: " + pf.id + " - " + pf.nome + " - " + pf.cpf + " - " + pf.rg);
//
//        System.out.println("Pessoa Jurídica: " + pj.id + " - " + pj.nome + " - " + pj.cnpj + " - " + pj.inscricao);
    }
}

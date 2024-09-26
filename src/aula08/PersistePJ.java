package aula08;

public class PersistePJ {
    public static void main(String[] args) {
        PessoaJuridicaPersistente pj = new PessoaJuridicaPersistente();
        pj.cnpj = "12345678901234";
        pj.id = 1;
        pj.inscricao = "123456";
        pj.nome = "Empresa";

        System.out.println(pj.gravar());

        PessoaJuridica p = PessoaJuridicaPersistente.ler("12345678901234");
        pj.mostrar();;
    }
}

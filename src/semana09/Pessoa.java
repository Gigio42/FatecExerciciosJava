package semana09;

public class Pessoa {

    public int cpf;
    public String nome;
    public Pessoa conjuge;

    public void mostrar() {
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);

        if (conjuge == null) {
            System.out.println("Pessoa sem conjuge");
            return;
        }

        System.out.println("Conjuge: " + conjuge.nome);
    }

    public Pessoa(int cpf, String nome, Pessoa conjuge) {
        this.cpf = cpf;
        this.nome = nome;
        this.conjuge = conjuge;
    }

    public Pessoa() {

    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }
}

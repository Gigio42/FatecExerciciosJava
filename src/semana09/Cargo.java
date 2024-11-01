package semana09;

public class Cargo {

    public int id;
    public String nome;
    public Funcionario[] funcionario;

    public Cargo() {
    }

    public Cargo(int id, String nome, Funcionario[] funcionario) {
        this.id = id;
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void mostrar() {
        System.out.println("Cargo: " + id);
        System.out.println("Nome: " + nome);

        if (funcionario == null) {
            System.out.println("Cargo sem funcionário");
            return;
        }

        for (Funcionario f : funcionario) {
            f.mostrar();
            System.out.println();
        }
    }
}

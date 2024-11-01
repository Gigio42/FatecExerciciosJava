package semana09;

public class Funcionario {
    public int id;
    public String nome;
    public Mesa mesa;
    public Cargo cargo;

    public Funcionario(int id, Cargo cargo, String nome) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(int id, String nome, Mesa mesa, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.mesa = mesa;
        this.cargo = cargo;
    }

    public Funcionario(int id, String nome, Mesa mesa) {
        this.id = id;
        this.nome = nome;
        this.mesa = mesa;
    }

    public void mostrar() {
        System.out.println("Funcionário: " + id);
        System.out.println("Funcionário: " + nome);

        if (mesa == null) {
            System.out.println("Funcionário sem mesa");
            return;
        }

        System.out.println("Mesa: " + mesa.id);
        System.out.println("Material: " + mesa.material);
        System.out.println("Descrição: " + mesa.descricao);

        if (cargo == null) {
            System.out.println("Funcionário sem cargo");
            return;
        }

        System.out.println("Cargo: " + cargo.id);
        System.out.println("Nome: " + cargo.nome);
    }
}

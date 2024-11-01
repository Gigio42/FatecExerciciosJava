package semana09;

public class UsaFuncionario {

    public static void main(String[] args) {

        Cargo cargo1 = new Cargo();
        cargo1.id = 1;
        cargo1.nome = "Programador";


        Mesa mesa1 = new Mesa();
        mesa1.id = 1;
        mesa1.material = "Madeira";
        mesa1.descricao = "Mesa de madeira";

        Funcionario funcionario1 = new Funcionario(1, "João", null);
        Funcionario funcionario2 = new Funcionario(2, "Maria", mesa1);
        Funcionario funcionario3 = new Funcionario(3, "José", mesa1, cargo1);

        funcionario1.mostrar();
        System.out.println();
        funcionario2.mostrar();
        System.out.println();
        funcionario3.mostrar();
    }
}

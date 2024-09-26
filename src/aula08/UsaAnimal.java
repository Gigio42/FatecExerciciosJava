package aula08;

public class UsaAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.raca = "Poodle";
        System.out.println(a.getClass());

        Vendedor v = new Vendedor();
        v.salario = 1000;
    }
}

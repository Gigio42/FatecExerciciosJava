package semana09;

public class UsaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        p1.setCpf(1);
        p1.setNome("João");
        p1.setConjuge(p2);

        p2.setCpf(2);
        p2.setNome("Maria");
        p2.setConjuge(p1);

        p3.setCpf(3);
        p3.setNome("José");
        p3.setConjuge(p4);

        p4.setCpf(4);
        p4.setNome("Ana");
        p4.setConjuge(p3);

        p5.setCpf(5);
        p5.setNome("Pedro");

        p1.mostrar();
        System.out.println();
        p2.mostrar();
        System.out.println();
        p3.mostrar();
        System.out.println();
        p4.mostrar();
        System.out.println();
        p5.mostrar();
    }
}

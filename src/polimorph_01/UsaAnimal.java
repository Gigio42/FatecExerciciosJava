package polimorph_01;

public class UsaAnimal {

    public static void main(String[] args) {

//        Gato g = new Gato();
//        g.comer();
//        Ave a = new Ave();
//        a.comer();
//        ...

        Animal a = null;

        a = new Cobra();
        a.comer();
    }
}

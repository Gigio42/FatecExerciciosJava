package semana11;

public class Animal implements Fisio {
    @Override
    public void comer() {
        System.out.println("Animal Comendo");
    }

    @Override
    public void beber() {
        System.out.println("Animal Bebendo");
    }

    @Override
    public void dormir() {
        System.out.println("Animal Dormindo");
    }
}

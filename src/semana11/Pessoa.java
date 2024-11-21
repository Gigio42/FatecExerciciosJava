package semana11;

public class Pessoa implements Fisio {
    @Override
    public void comer() {
        System.out.println("Pessoa Comendo");
    }

    @Override
    public void beber() {
        System.out.println("Pessoa Bebendo");
    }

    @Override
    public void dormir() {
        System.out.println("Pessoa Dormindo");
    }
}

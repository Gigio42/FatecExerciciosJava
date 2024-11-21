package semana11;

public class ET implements Fisio{
    @Override
    public void comer() {
        System.out.println("ET Comendo");
    }

    @Override
    public void beber() {
        System.out.println("ET Bebendo água");
    }

    @Override
    public void dormir() {
        System.out.println("ET Dormindo");
    }
}

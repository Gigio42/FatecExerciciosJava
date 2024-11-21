package semana11;

public abstract class Motor {

    public abstract void ligara();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();

    public void mostrar() {
        System.out.println("Mostrando motor");
    }
}

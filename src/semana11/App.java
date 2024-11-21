package semana11;

public class App {
    public static void main(String[] args) {
        Fisio f = new Pessoa();
        Vida.viver(f);

        Fisio f2 = new Animal();
        Vida.viver(f2);

        Fisio f3 = new ET();
        Vida.viver(f3);
    }
}

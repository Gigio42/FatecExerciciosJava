package semana11;

import java.lang.reflect.Field;

public abstract class Animal2 {

    public abstract void comer();
    public abstract void beber();

    public void crescer() {
        System.out.println("Crescendo");
    }

    public final void registrarLog() {
        System.out.println("Registrando log...");
    }

    public  void mostrarCampos(Animal2 a) {
        Class<?> c = a.getClass();
        for(Field field : c.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }
}

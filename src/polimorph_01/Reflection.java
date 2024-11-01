package polimorph_01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

//    public static String getAtributo(Object obj, String atributo) {
//        try {
//            Field field = obj.getClass().getDeclaredField(atributo);
//
//        }
//        catch (Exception e) {
//            return "falha ao ler o atributo " + e;
//        }
//    }

    public static void listarMetodos(String classe) {
        try {
            Class<?> c = Class.forName(classe);
            System.out.println("Metodos:");
            Method[] m = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m);
            }

        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontra " + classe);
        }
    }
}

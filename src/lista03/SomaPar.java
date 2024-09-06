package lista03;

public class SomaPar {

    public static void main (String args[]) {

        int soma = 0;

        for (int i = 0; i < 500; i++) {

            if (i % 2 == 0) {
                soma += i;
                System.out.println("soma: " + soma);
            }
        }

        System.out.println("Soma de números pares: " + soma);
    }
}

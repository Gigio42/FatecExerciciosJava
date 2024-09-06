package lista02;

import javax.swing.*;

public class MediaEResultFinal {
    public static void main (String[] args) {
        final int MENOR_NOTA = 0;
        final int MAIOR_NOTA = 10;

        int n1 = 1;
        int n2 = 3;

        if ((n1 < MENOR_NOTA || n1 > MAIOR_NOTA) && (n2 < MENOR_NOTA || n2 > MAIOR_NOTA)) {
            int media = (n1 + n2) / 2;
            switch (media) {

            }
        } else {
            System.out.println("Valor inválido");
        }

    }
}

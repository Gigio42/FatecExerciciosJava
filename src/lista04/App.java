package lista04;

import java.lang.reflect.Array;
import java.util.List;

public class App {
    public static void main(String[] Args) {

        Teste teste = new Teste();

        //Sem retorno
        teste.separarLetras("abacate");
        teste.mostrarTabuda(8);

        //Com retorno
        int pares = teste.contarPares(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("\nNúmero de pares da lista: " + pares);

        int soma = teste.somarArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("\nSoma do array: " + soma);

        //+2 com retorno?
        boolean cpfValido = teste.validarCPF("123.456.789/09");
        System.out.println("\nCPF válido: " + cpfValido);
        boolean cpfInvalido = teste.validarCPF("12345678900");
        System.out.println("CPF inválido: " + cpfInvalido);

        double media = teste.calcularMedia(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("\nMédia do array: " + media);
    }
}

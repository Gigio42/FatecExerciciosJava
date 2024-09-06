package lista04;

import java.util.List;

public class Teste {

    public void separarLetras(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + " ");
        }
        System.out.println("\n");
    }

    public void mostrarTabuda(int num) {

        final int LIMITE_SUPERIOR = 10;
        final int LIMITE_INFERIOR = 1;

        if( num >= LIMITE_INFERIOR && num <= LIMITE_SUPERIOR) {
            for (int i = 1; i <= 10; i++) {
                System.out.println( num + " x " + i + " = " + (num * i));
            }
        }
        else {
            System.out.println("Número Inválido");
        }
    }

    public int contarPares(List<Integer> lista) {

        int contador = 0;
        for (int i : lista) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int somarArray(int[] arr) {

        int soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma;
    }

    public boolean validarCPF (String cpf) {
        if(cpf.length() != 14) return false;

        for (int i = 0; i < cpf.length(); i++) {
            if (i == 3 || i == 7) {
                if (cpf.charAt(i) != '.') return false;
            } else if (i == 11) {
                if (cpf.charAt(i) != '/') return false;
            } else {
                if (!Character.isDigit(cpf.charAt(i))) return false;
            }
        }
        return true;
    }

    public double calcularMedia(double[] arr) {
        double soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma / arr.length;
    }
}

package lista03;

public class Soma10 {
    public static void main (String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma =0;

        for (int i = 0; i < 10; i++) {
            soma += nums[i];
        }

        System.out.println("Somatório: " + soma);
        System.out.println("Media: " + soma / 10);
    }
}

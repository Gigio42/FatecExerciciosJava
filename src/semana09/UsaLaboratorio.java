package semana09;

public class UsaLaboratorio {

    public static void main(String[] args) {

        Laboratorio lab = new Laboratorio();

        lab.numero = 1;
        lab.lamp1.ligado = true;
        lab.lamp1.potencia = 100;

        lab.lamp2.ligado = false;
        lab.lamp2.potencia = 200;

        lab.lamp3.ligado = true;
        lab.lamp3.potencia = 300;

        System.out.println("Laboratório: " + lab.numero);
        System.out.println("Lâmpada 1: " + lab.lamp1.ligado + " - " + lab.lamp1.potencia);
        System.out.println("Lâmpada 2: " + lab.lamp2.ligado + " - " + lab.lamp2.potencia);
        System.out.println("Lâmpada 3: " + lab.lamp3.ligado + " - " + lab.lamp3.potencia);
    }
}

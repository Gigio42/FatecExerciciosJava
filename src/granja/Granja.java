package granja;

public class Granja {

	public static void main(String[] args) {
		Galinha g1 = new Galinha(1, "Branca", 500, 5.23f, 10);
		Galinha g2 = new Galinha(2, "Preta", 600, 6.23f, 6 * 365);
		//Galinha fora do padrão
		//Galinha g3 = new Galinha(3, "Vermelha", 700, 7.23f, 30);
		Galinha g4 = new Galinha(4, "Amarela", 800, 8.23f, 11 * 365);
		//Galinha fora do padrão
		//Galinha g5 = new Galinha(5, "Preta", 900, 9.23f, 13 * 365);
		//Galinha fora do padrão
		Galinha g6 = new Galinha(6, null, 1000, 10.23f, 15 * 365);

		System.out.println("Produção diária de ovos: " + Galinha.calcularProducaoDiariaDeOvos(g1));
		System.out.println("Expectativa total de ovos: " + Galinha.calcularExpectativaTotalDeOvos(g1));

		System.out.println("Produção diária de ovos: " + Galinha.calcularProducaoDiariaDeOvos(g2));
		System.out.println("Expectativa total de ovos: " + Galinha.calcularExpectativaTotalDeOvos(g2));

		System.out.println("Produção diária de ovos: " + Galinha.calcularProducaoDiariaDeOvos(g4));
		System.out.println("Expectativa total de ovos: " + Galinha.calcularExpectativaTotalDeOvos(g4));

	}

}

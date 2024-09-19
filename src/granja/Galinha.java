package granja;

public class Galinha {

    private int id;
    private String cor;
    private float peso, preco;
    private int qtdeDias;

    private final int PRODUCAO_DIARIA_OVOS_CICLO_ATE_5_ANOS = 2;
    private final int PRODUCAO_DIARIA_OVOS_CICLO_5_10_ANOS = 1;
    private final float PRODUCAO_DIARIA_OVOS_CICLO_APOS_10_ANOS = 0.5f;

    private final int IDADE_MAXIMA = 12 * 365;
    private final int IDADE_MINIMA = 1;

    final static int DIAS_EM_UM_ANO = 365;
    final static int CINCO_ANOS = 5 * DIAS_EM_UM_ANO;
    final static int DEZ_ANOS = 10 * DIAS_EM_UM_ANO;


    public static float calcularProducaoDiariaDeOvos(Galinha g) {

        float producaoDiaria = 0;

        if (g.qtdeDias <= CINCO_ANOS) {
            producaoDiaria = g.PRODUCAO_DIARIA_OVOS_CICLO_ATE_5_ANOS;
        } else if (g.qtdeDias > CINCO_ANOS && g.qtdeDias <= DEZ_ANOS) {
            producaoDiaria = g.PRODUCAO_DIARIA_OVOS_CICLO_5_10_ANOS;
        } else {
            producaoDiaria = g.PRODUCAO_DIARIA_OVOS_CICLO_APOS_10_ANOS;
        }

        return producaoDiaria;
    }

    public static float calcularExpectativaTotalDeOvos(Galinha g) {

        float totalOvos = 0;

        if (g.qtdeDias <= CINCO_ANOS) {
            totalOvos = g.qtdeDias * g.PRODUCAO_DIARIA_OVOS_CICLO_ATE_5_ANOS;

        } else {
            totalOvos += CINCO_ANOS * g.PRODUCAO_DIARIA_OVOS_CICLO_ATE_5_ANOS;

            if (g.qtdeDias <= DEZ_ANOS) {
                totalOvos += (g.qtdeDias - CINCO_ANOS) * g.PRODUCAO_DIARIA_OVOS_CICLO_5_10_ANOS;
            } else {
                totalOvos += (DEZ_ANOS - CINCO_ANOS) * g.PRODUCAO_DIARIA_OVOS_CICLO_5_10_ANOS;
                totalOvos += (g.qtdeDias - DEZ_ANOS) * g.PRODUCAO_DIARIA_OVOS_CICLO_APOS_10_ANOS;
            }
        }

        return totalOvos;
    }

    public Galinha(int id, String cor, float peso, float preco, int qtdeDias) {

        if (cor == null || cor.isEmpty()) {
            throw new IllegalArgumentException("Cor é obrigatória.");
        }
        if (qtdeDias < IDADE_MINIMA || qtdeDias > IDADE_MAXIMA) {
            throw new IllegalArgumentException("A idade deve estar entre 1 e 12 anos.");
        }

        this.id = id;
        setCor(cor);
        this.peso = peso;
        this.preco = preco;
        setQtdeDias(qtdeDias);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {

        if (cor.equals("Branca") || cor.equals("Amarela") || cor.equals("Preta")) {
            this.cor = cor;
        } else {
            System.out.println("Cor inválida");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {

        if (qtdeDias >= IDADE_MINIMA && qtdeDias <= IDADE_MAXIMA) {
            this.qtdeDias = qtdeDias;
        } else {
            System.out.println("A idade deve estar entre 1 e 12 anos");
        }
    }

    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n")
                .append("Cor: ").append(cor).append("\n")
                .append("Peso: ").append(peso).append("\n")
                .append("Preço: ").append(preco).append("\n")
                .append("Quantidade de Dias: ").append(qtdeDias).append("\n");
        System.out.println(sb.toString());
    }

    public String toString() {
        return "[" + id + ";" + cor + ";" + peso + ";" + preco + ";" + qtdeDias + "]";
    }

}

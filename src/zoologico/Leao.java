package zoologico;

public class Leao extends Felino {

    private float consumoDiario;

    public Leao(String nome) {
        super(nome);
    }

    public float getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(float consumoDiario) {
        this.consumoDiario = consumoDiario;
    }
}

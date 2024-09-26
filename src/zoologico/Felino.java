package zoologico;

public class Felino extends Animal {

    private String corPredominante;

    public Felino(String nome) {
        super(nome);
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }
}

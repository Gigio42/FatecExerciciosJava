package zoologico;

public class Leopardo extends Felino {

    private int velocidade;

    public Leopardo(String nome) {
        super(nome);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}

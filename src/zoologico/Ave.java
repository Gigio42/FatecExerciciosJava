package zoologico;

public class Ave extends Animal {

    private boolean voa;

    public Ave(String nome) {
        super(nome);
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
}

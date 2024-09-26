package zoologico;

public class Galinha extends Ave {

    protected int preco;

    public Galinha(String nome) {
        super(nome);
    }

    public int getOvosPorDia() {
        return ovosPorDia;
    }

    public void setOvosPorDia(int ovosPorDia) {
        this.ovosPorDia = ovosPorDia;
    }
}

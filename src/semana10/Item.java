package semana10;

public class Item {

    public String NomeProduto;
    public int quantidade;
    public double preco;

    public void mostrar() {
        System.out.println("Nome do produto: " + NomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
}

package semana10;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemInterno {

    public int numero;
    public List<ItemPedido> itens = new ArrayList<ItemPedido>();

    public void adicionarItem(
            String nomeProduto, int quantidade, double preco
    ) {
        ItemPedido item = new ItemPedido();
        item.nomeProduto = nomeProduto;
        item.quantidade = quantidade;
        item.preco = preco;
        itens.add(item);
    }

    public void listarItens() {
        for (ItemPedido item : itens) {
            item.mostrar();
        }
    }
    private class ItemPedido {
        public String nomeProduto;
        public int quantidade;
        public double preco;

        public void mostrar() {
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço: " + preco);
        }
    }

    public static void main (String[] args) {
        PedidoItemInterno p = new PedidoItemInterno();
        p.adicionarItem("Arroz", 2, 10.0);
        p.adicionarItem("Feijão", 3, 5.0);
        p.listarItens();
    }
}

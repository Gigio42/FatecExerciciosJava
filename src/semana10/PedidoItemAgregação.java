package semana10;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemAgregação {

    public int numero;
    public List<Item> itens = new ArrayList<Item>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            item.mostrar();
        }
    }

    public static void main (String[] args) {

        Item i1 = new Item();
        i1.NomeProduto = "Arroz";
        i1.quantidade = 2;
        i1.preco = 10.0;

        Item i2 = new Item();
        i2.NomeProduto = "Feijão";
        i2.quantidade = 3;
        i2.preco = 5.0;

        PedidoItemAgregação p = new PedidoItemAgregação();
        p.adicionarItem(i1);
        p.adicionarItem(i2);
        p.listarItens();

    }
}

package banco;

public class ProdutoInserirTeste {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        dao.produto.setId(6);
        dao.produto.setNome("Acerola");
        dao.produto.setPreco(5.00);
        dao.produto.setEstoque(100);
        System.out.println(dao.Inserir());

    }
}

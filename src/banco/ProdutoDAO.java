package banco;

import java.sql.SQLException;

public class ProdutoDAO implements DAO {

    public Produto produto;
    public BD bd;
    private String sql, men;

    public ProdutoDAO() {
        produto = new Produto();
        bd = new BD();
    }

    @Override
    public String Inserir() {
        sql = "INSERT INTO produtos (id, nome, preco, estoque) VALUES (?, ?, ?, ?)";
        bd.getConnection();
        try {
            bd.st = bd.con.prepareStatement(sql);
            bd.st.setInt(1, produto.getId());
            bd.st.setString(2, produto.getNome());
            bd.st.setDouble(3, produto.getPreco());
            bd.st.setInt(4, produto.getEstoque());
            bd.st.executeUpdate();
            men = "Inserido com sucesso!";
        }
        catch(SQLException e) {
            men = "Falha na inclusão: " + e;
        }
        finally {
            bd.close();
        }

        return men;
    }

    @Override
    public String Excluir() {
        return null;
    }

    @Override
    public String Alterar() {
        return null;
    }
}

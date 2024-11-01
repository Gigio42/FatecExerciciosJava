package banco;

import java.sql.SQLException;

public class ProdutoConsultar {

    public static void main(String[] args) {

        BD bd = new BD();
        if(bd.getConnection()) {
            String sql = "SELECT * FROM produtos";

            try {

                bd.st = bd.con.prepareStatement(sql);
                bd.rs = bd.st.executeQuery();

                while (bd.rs.next()) {
                    System.out.println("ID: " + bd.rs.getInt(1));
                    System.out.println("Nome: " + bd.rs.getString(2));
                    System.out.println("Preço: " + bd.rs.getDouble(3));
                    System.out.println("Estoque: " + bd.rs.getInt(4));
                    System.out.println("\n");
                }

                sql = "SELECT SUM(preco) AS total FROM produtos";
                bd.st = bd.con.prepareStatement(sql);
                bd.rs = bd.st.executeQuery();
                bd.rs.next();
                System.out.println("TOTAL: " + bd.rs.getInt("total"));

                sql = "SELECT MAX(estoque) AS total FROM produtos";
                bd.st = bd.con.prepareStatement(sql);
                bd.rs = bd.st.executeQuery();
                bd.rs.next();
                System.out.println("Maior do estoque: " + bd.rs.getInt("total"));



            } catch (SQLException e) {
                System.out.println("Erro" + e);
            }
            finally {
                bd.close();
            }
        }
        else {
            System.out.println("Falha ao conectar!");
        }



    }
}

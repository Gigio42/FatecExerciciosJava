package banco;

import java.sql.*;

public class BD {

    public Connection con = null;
    public PreparedStatement st = null;
    public ResultSet rs = null;

    public final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public final String DATABASE = "poo";
    public final String URL = "jdbc:sqlserver://localhost:1433;databasename="+ DATABASE + ";encrypt=true;trustServerCertificate=true";
    public final String LOGIN = "sa";
    public final String SENHA = "JubarteMagrathiana42!";

    

    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            System.out.println("Driver carregado!");
            con = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou!");
            return true;

        }
        catch(ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");
            return false;
        } catch (SQLException e) {
            System.out.println("Falha na conexão: " + e);
            return false;
        }

    }

    public void close() {

        try {
            if(rs != null) rs.close();

        } catch (SQLException e) { }
        try {
            if(st != null) st.close();
        } catch (SQLException e) { }
        try {
            if(con != null) {
                System.out.println("Desconectou...");
                con.close();
            }
        } catch (SQLException e) { }

    }

    public static void main(String[] args) {

        BD bd = new BD();
        bd.getConnection();
        bd.close();
    }
}

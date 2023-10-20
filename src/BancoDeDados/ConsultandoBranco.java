package BancoDeDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class ConsultandoBranco {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            Connection cn = ConectaBanco.getConexao();
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = ((java.sql.Statement) st).executeQuery(
                    "SELECT * FROM Alunos");
            while (rs.next()) {
                String nome = rs.getString("alunosNome");
                String telefone = rs.getString("alunosTelefone");
                double alunosNota = rs.getDouble("alunosNota");

                System.out.println("Nome: " + nome + " Telefone: " + telefone);
            }
            ConectaBanco.fechaConexao(cn, null, rs);
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}

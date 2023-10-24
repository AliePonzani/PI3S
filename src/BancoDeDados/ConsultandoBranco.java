package BancoDeDados;

import java.sql.*;

public class ConsultandoBranco {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            Connection cn = ConectaBanco.getConexao();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Alunos");
            while (rs.next()) {
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                double nota = rs.getDouble("nota");

                System.out.println("Nome: " + nome + " Telefone: " + telefone + " Nota do aluno: " + nota);
            }
            ConectaBanco.fechaConexao(cn, null, rs);
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}

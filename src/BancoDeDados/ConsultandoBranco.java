package BancoDeDados;

import java.sql.*;

public class ConsultandoBranco {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        try {
            ConectaMySQL conexao = new ConectaMySQL();
            Connection cn = conexao.openDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Alunos");
            while (rs.next()) {
                int id = rs.getInt("idAluno");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                double nota = rs.getDouble("nota");

                Aluno novoAluno = new Aluno(id, nome, telefone, nota);

                System.out.println(novoAluno);
            }
            conexao.closeDB();
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}

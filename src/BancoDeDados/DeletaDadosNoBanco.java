package BancoDeDados;

import java.sql.*;
import javax.swing.JOptionPane;

public class DeletaDadosNoBanco {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        try {

            ConectaMySQL conexao = new ConectaMySQL();
            Connection cn = conexao.openDB();
            // abro uma conexão para excluir dados em minha tabela Alunos no banco
            Statement st = cn.createStatement();

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno que deseja excluir o registro:");
            int resp = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do aluno " + nome + "?");
            if (resp == 0) {

                int linhasAfetadas = st.executeUpdate("DELETE FROM Alunos  WHERE nome='" + nome + "'");
                if (linhasAfetadas > 0) {
                    System.out.println("Registro excluido com sucesso!");
                    conexao.closeST(st, cn);
                } else {
                    System.out.println("Falha ao excluir o registro.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O aluno " + nome + " não foi excluido!");
            }
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}

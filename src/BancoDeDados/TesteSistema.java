package BancoDeDados;

import java.sql.*;
import javax.swing.JOptionPane;

public class TesteSistema {
    public static void main(String[] args) {
		try {
			Aluno novo = consultarAluno(JOptionPane.showInputDialog("Digite o nome do aluno:"));
			if(novo!=null)
                JOptionPane.showMessageDialog(null, novo);
			else
				System.out.println("Aluno não localizado!");
		} catch (Exception e) {
			e.printStackTrace();
		}    
	}
	public static Aluno consultarAluno(String nomeAluno) throws Exception {
		ConectaMySQL conexao = new ConectaMySQL();
		String queryCmd = "select * from Alunos where "
				+ "nome like ? ";
		Aluno aluno =null;
		Connection con = null;		
		try {
			con = conexao.openDB();
			PreparedStatement ps1 = con.prepareStatement(queryCmd);
			ps1.setString(1, nomeAluno); 			
			ResultSet rs = ps1.executeQuery();			
			if(rs.next()) {				
				int id = rs.getInt("idAluno");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				double nota = rs.getDouble("nota");
				aluno = new Aluno(id, nome, telefone, nota);			
			}
		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			conexao.closeDB();			
		}	
		return aluno; 	
	}
}

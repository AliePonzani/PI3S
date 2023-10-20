package BancoDeDados;

import java.sql.*;

public class InserirDadosNoBanco {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Aluno novAluno = new Aluno("Aline Teste", "(11)97636-3569", 8.5);

        try  {
            Connection cn = ConectaBanco.getConexao();
            // Defina a consulta SQL para inserir um novo aluno na tabela Alunos.
            String sql = "INSERT INTO Alunos (alunosNome, alunosTelefone, alunosNota) VALUES (?, ?, ?)";

            // Crie um objeto PreparedStatement para executar a consulta.
            PreparedStatement pstmt = cn.prepareStatement(sql);

            // Defina os valores dos parâmetros da consulta.
            pstmt.setString(1, novAluno.getNome());
            pstmt.setString(2, novAluno.getTelefone());
            pstmt.setDouble(3, novAluno.getNota());

            // Execute a consulta para inserir o novo aluno.
            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Novo aluno inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir o novo aluno.");
            }
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}


package BancoDeDados;

import java.sql.*;
import javax.swing.JOptionPane;

public class InserirDadosNoBanco {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Aluno novAluno = new Aluno(
                JOptionPane.showInputDialog("Digite o nome do Aluno: "),
                JOptionPane.showInputDialog("Digite o telefone do Aluno: "),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Aluno: ")));

        try {
            //
            ConectaMySQL conexao = new ConectaMySQL();
            Connection cn = conexao.openDB();
            // abro uma conexão para inserir novos dados em minha tabela Alunos no banco
            PreparedStatement ps = cn.prepareStatement(
                    "INSERT INTO Alunos (nome, telefone, nota) VALUES (?, ?, ?)");

            // Define os valores dos parâmetros da consulta.
            // Minha tabela tem os campos 0(idAluno), 1(nome), 2(telefone) e 3(nota)
            ps.setString(1, novAluno.getNome());
            ps.setString(2, novAluno.getTelefone());
            ps.setDouble(3, novAluno.getNota());

            // Executa a consulta para inserir o novo aluno.
            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Novo aluno inserido com sucesso!");
                conexao.closePS(ps, cn);
            } else {
                System.out.println("Falha ao inserir o novo aluno.");
            }
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}

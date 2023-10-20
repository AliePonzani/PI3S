package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoMySQL {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://10.0.0.4:3306/ProjetoPI";
        String usuario = "aline-server";
        String senha = "aline12345";

        try {
            System.out.println("Conectando ao banco de dados...");
            Connection conexao = DriverManager.getConnection(jdbcUrl, usuario, senha);
            System.out.println("Conexão bem-sucedida!");

            // Você pode adicionar aqui a lógica adicional, se necessário.

            // Feche a conexão quando terminar.
            conexao.close();
            System.out.println("Conexão fechada.");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


package connexao;

import entites.Pessoa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConnMysql {

    private final String URL = "jdbc:mysql://localhost:3306/contatosbd";
    private final String USER = "root";
    private final String PASSWORD = "Gold20050404!";
    private static Connection conn;

    public Connection connect() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar se conectar! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexão fechada com sucesso!!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar fechar a conexão! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insert(Pessoa p) {
        connect();
        try {
            String query = "INSERT INTO tabela_agenda (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, p.getNome());
            preparedStatement.setString(2, p.getEmail());
            preparedStatement.setString(3, p.getTelefone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar inserir os dados! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeConnection();
        }
    }

    public void delete(Pessoa p) {
        connect();
        try {
            String query = "DELETE FROM tabela_agenda WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Remoção de dados completa!!",
                    "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar remover o usuário! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeConnection();
        }
    }

    public void edit(Pessoa p) {
        connect();

        try {
            String query = "UPDATE tabela_agenda SET nome = ?, email = ?, telefone = ? WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, p.getNome());
            preparedStatement.setString(2, p.getEmail());
            preparedStatement.setString(3, p.getTelefone());
            preparedStatement.setInt(4, p.getId());
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar atualizar os dados do usuário! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeConnection();
        }
    }
    
    public void cleanTablel() {
        connect();
        
        try {
            String query = "TRUNCATE TABLE tabela_agenda;";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tabela Limpa!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar limpar a tabela! Tente novamente" + e.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);        
        } finally {
            closeConnection();
        }
    }

    public List<Pessoa> read() {
        connect();
        ResultSet rs = null;
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            String query = "SELECT * FROM tabela_agenda";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();

                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoas.add(pessoa);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        } finally {
            closeConnection();
        }

        return pessoas;
    }
}

package com.mariaeduarda.dorivalcaymmi.DAO;

import com.mariaeduarda.dorivalcaymmi.Model.Pessoa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO pessoas (nome, idade, altura, data_registro) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setDouble(3, pessoa.getAltura());
            stmt.setTimestamp(4, Timestamp.valueOf(pessoa.getDataRegistro()));

            stmt.executeUpdate();

            // Obtém o ID gerado
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    pessoa.setId(generatedKeys.getInt(1));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar pessoa", e);
        }
    }

    public List<Pessoa> listarTodos() {
        String sql = "SELECT * FROM pessoas ORDER BY data_registro DESC";
        List<Pessoa> pessoas = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setAltura(rs.getDouble("altura"));
                pessoa.setDataRegistro(rs.getTimestamp("data_registro").toLocalDateTime());

                pessoas.add(pessoa);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pessoas", e);
        }

        return pessoas;
    }

    public Pessoa buscarPorId(int id) {
        String sql = "SELECT * FROM pessoas WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setId(rs.getInt("id"));
                    pessoa.setNome(rs.getString("nome"));
                    pessoa.setIdade(rs.getInt("idade"));
                    pessoa.setAltura(rs.getDouble("altura"));
                    pessoa.setDataRegistro(rs.getTimestamp("data_registro").toLocalDateTime());
                    return pessoa;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar pessoa por ID", e);
        }

        return null;
    }

    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoas SET nome = ?, idade = ?, altura = ? WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setDouble(3, pessoa.getAltura());
            stmt.setInt(4, pessoa.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar pessoa", e);
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM pessoas WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar pessoa", e);
        }
    }
}

package com.mariaeduarda.dorivalcaymmi.DAO;

import com.mariaeduarda.dorivalcaymmi.Model.Jangada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JangadaDAO {

    public void salvar(Jangada jangada) {
        String sql = "INSERT INTO jangadas (altura, cor, material, data_registro) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setDouble(1, jangada.getAltura());
            stmt.setString(2, jangada.getCor());
            stmt.setString(3, jangada.getMaterial());
            stmt.setTimestamp(4, Timestamp.valueOf(jangada.getDataRegistro()));

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    jangada.setId(generatedKeys.getInt(1));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar jangada", e);
        }
    }

    public List<Jangada> listarTodos() {
        String sql = "SELECT * FROM jangadas ORDER BY data_registro DESC";
        List<Jangada> jangadas = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Jangada jangada = new Jangada();
                jangada.setId(rs.getInt("id"));
                jangada.setAltura(rs.getDouble("altura"));
                jangada.setCor(rs.getString("cor"));
                jangada.setMaterial(rs.getString("material"));
                jangada.setDataRegistro(rs.getTimestamp("data_registro").toLocalDateTime());

                jangadas.add(jangada);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar jangadas", e);
        }

        return jangadas;
    }
}

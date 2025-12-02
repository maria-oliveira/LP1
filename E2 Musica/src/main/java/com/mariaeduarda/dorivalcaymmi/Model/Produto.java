package com.mariaeduarda.dorivalcaymmi.Model;

import java.time.LocalDateTime;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String origem;
    private LocalDateTime dataRegistro;

    public Produto() {
        this.dataRegistro = LocalDateTime.now();
    }

    public Produto(String nome, double preco, String origem) {
        this();
        this.nome = nome;
        this.preco = preco;
        this.origem = origem;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public LocalDateTime getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco +
                ", origem='" + origem + "', dataRegistro=" + dataRegistro + '}';
    }
}
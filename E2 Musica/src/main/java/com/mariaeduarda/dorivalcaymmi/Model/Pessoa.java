package com.mariaeduarda.dorivalcaymmi.Model;

import java.time.LocalDateTime;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private double altura;
    private LocalDateTime dataRegistro;

    public Pessoa() {
        this.dataRegistro = LocalDateTime.now();
    }

    public Pessoa(String nome, int idade, double altura) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.dataRegistro = LocalDateTime.now();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva");
        }
        this.altura = altura;
    }

    public LocalDateTime getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }

    @Override
    public String toString() {
        return "Pessoa{id=" + id + ", nome='" + nome + "', idade=" + idade +
                ", altura=" + altura + ", dataRegistro=" + dataRegistro + '}';
    }
}
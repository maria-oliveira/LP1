package com.mariaeduarda.dorivalcaymmi.Model;

import java.time.LocalDateTime;

public class Jangada {
    private int id;
    private double altura;
    private String cor;
    private String material;
    private LocalDateTime dataRegistro;

    public Jangada() {
        this.dataRegistro = LocalDateTime.now();
    }

    public Jangada(double altura, String cor, String material) {
        this();
        this.altura = altura;
        this.cor = cor;
        this.material = material;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva");
        }
        this.altura = altura;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public LocalDateTime getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDateTime dataRegistro) { this.dataRegistro = dataRegistro; }

    @Override
    public String toString() {
        return "Jangada{id=" + id + ", altura=" + altura + ", cor='" + cor +
                "', material='" + material + "', dataRegistro=" + dataRegistro + '}';
    }
}

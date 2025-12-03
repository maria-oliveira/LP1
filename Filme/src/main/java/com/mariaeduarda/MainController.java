package com.mariaeduarda;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainController {

    // Campos da aba PESSOA
    @FXML
    private TextField nomePessoaField;
    @FXML
    private TextField corCabeloField;
    @FXML
    private TextField alturaPessoaField;
    @FXML
    private Button registrarPessoaButton;
    @FXML
    private Label mensagemPessoaLabel;

    // Campos da aba CASA
    @FXML
    private TextField decoracaoField;
    @FXML
    private TextField corCasaField;
    @FXML
    private TextField paredesField;
    @FXML
    private Button registrarCasaButton;
    @FXML
    private Label mensagemCasaLabel;

    // Campos da aba POÇÃO
    @FXML
    private TextField nomePocaoField;
    @FXML
    private TextField corPocaoField;
    @FXML
    private TextField finalidadeField;
    @FXML
    private Button registrarPocaoButton;
    @FXML
    private Label mensagemPocaoLabel;

    // Metodo para salvar no CSV (exatamente igual)
    private void salvarNoCSV(String nomeArquivo, String[] dados) {
        try (FileWriter fw = new FileWriter(nomeArquivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            // Cria a linha CSV escapando campos que contêm vírgulas ou aspas
            StringBuilder linha = new StringBuilder();
            for (int i = 0; i < dados.length; i++) {
                String campo = dados[i];
                // Se o campo contém vírgula ou aspas, envolve com aspas e escapa aspas internas
                if (campo.contains(",") || campo.contains("\"")) {
                    campo = "\"" + campo.replace("\"", "\"\"") + "\"";
                }
                linha.append(campo);
                if (i < dados.length - 1) {
                    linha.append(",");
                }
            }

            pw.println(linha.toString());

        } catch (IOException e) {
            System.err.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }

    // Metodo para obter data e hora atual formatada (exatamente igual)
    private String getDataHoraAtual() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatter);
    }

    // Metodo para registrar PESSOA (mesma lógica)
    @FXML
    protected void onRegistrarPessoaClick() {
        String nome = nomePessoaField.getText();
        String corCabelo = corCabeloField.getText();
        String altura = alturaPessoaField.getText();

        if (nome.isEmpty() || corCabelo.isEmpty() || altura.isEmpty()) {
            mensagemPessoaLabel.setText("Preencha todos os campos!");
            mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Pessoa",
                    nome,
                    corCabelo,
                    altura,
                    getDataHoraAtual()
            };
            salvarNoCSV("pessoas.csv", dados);

            mensagemPessoaLabel.setText(
                    " Pessoa registrada com sucesso!\n" +
                            "Nome: " + nome + "\n" +
                            "Cor dos Cabelos: " + corCabelo + "\n" +
                            "Altura: " + altura
            );
            mensagemPessoaLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            nomePessoaField.clear();
            corCabeloField.clear();
            alturaPessoaField.clear();
        }
    }

    // Metodo para registrar CASA (mesma lógica)
    @FXML
    protected void onRegistrarCasaClick() {
        String decoracao = decoracaoField.getText();
        String cor = corCasaField.getText();
        String paredes = paredesField.getText();

        if (decoracao.isEmpty() || cor.isEmpty() || paredes.isEmpty()) {
            mensagemCasaLabel.setText("Preencha todos os campos!");
            mensagemCasaLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Casa",
                    decoracao,
                    cor,
                    paredes,
                    getDataHoraAtual()
            };
            salvarNoCSV("casas.csv", dados);

            mensagemCasaLabel.setText(
                    "Casa registrada com sucesso!\n" +
                            "Decoração: " + decoracao + "\n" +
                            "Cor: " + cor + "\n" +
                            "Número de paredes: " + paredes
            );
            mensagemCasaLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            decoracaoField.clear();
            corCasaField.clear();
            paredesField.clear();
        }
    }

    // Metodo para registrar POÇÃO (mesma lógica)
    @FXML
    protected void onRegistrarPocaoClick() {
        String nome = nomePocaoField.getText();
        String cor = corPocaoField.getText();
        String finalidade = finalidadeField.getText();

        if (nome.isEmpty() || cor.isEmpty() || finalidade.isEmpty()) {
            mensagemPocaoLabel.setText("Preencha todos os campos!");
            mensagemPocaoLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Poção",
                    nome,
                    cor,
                    finalidade,
                    getDataHoraAtual()
            };
            salvarNoCSV("pocoes.csv", dados);

            mensagemPocaoLabel.setText(
                    "Poção registrada com sucesso!\n" +
                            "Nome: " + nome + "\n" +
                            "Cor: " + cor + "\n" +
                            "Finalidade: " + finalidade
            );
            mensagemPocaoLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            nomePocaoField.clear();
            corPocaoField.clear();
            finalidadeField.clear();
        }
    }
}
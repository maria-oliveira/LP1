package com.mariaeduarda.dorivalcaymmi;

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

    // Campos da aba JANGADA
    @FXML
    private TextField alturaField;
    @FXML
    private TextField corField;
    @FXML
    private TextField materialField;
    @FXML
    private Button registrarButton;
    @FXML
    private Label mensagemJangadaLabel;

    // Campos da aba PESSOA
    @FXML
    private TextField alturaPessoaField;
    @FXML
    private TextField idadeField;
    @FXML
    private TextField nomePessoaField;
    @FXML
    private Button registrarPessoaButton;
    @FXML
    private Label mensagemPessoaLabel;

    // Campos da aba PRODUTO
    @FXML
    private TextField precoField;
    @FXML
    private TextField origemField;
    @FXML
    private TextField nomeProdutoField;
    @FXML
    private Button registrarProdutoButton;
    @FXML
    private Label mensagemProdutoLabel;

    // Metodo para salvar no CSV
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

    // Metodo para obter data e hora atual formatada
    private String getDataHoraAtual() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatter);
    }

    // Metodo para registrar JANGADA
    @FXML
    protected void onRegistrarJangadaClick() {
        String altura = alturaField.getText();
        String cor = corField.getText();
        String material = materialField.getText();

        if (altura.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            mensagemJangadaLabel.setText("Preencha todos os campos!");
            mensagemJangadaLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Jangada",
                    altura,
                    cor,
                    material,
                    getDataHoraAtual()
            };
            salvarNoCSV("jangadas.csv", dados);

            mensagemJangadaLabel.setText(
                    "✅ Jangada registrada com sucesso!\n" +
                            "Altura: " + altura + "\n" +
                            "Cor: " + cor + "\n" +
                            "Material: " + material
            );
            mensagemJangadaLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            alturaField.clear();
            corField.clear();
            materialField.clear();
        }
    }

    // Metodo para registrar PESSOA
    @FXML
    protected void onRegistrarPessoaClick() {
        String altura = alturaPessoaField.getText();
        String idade = idadeField.getText();
        String nome = nomePessoaField.getText();

        if (altura.isEmpty() || idade.isEmpty() || nome.isEmpty()) {
            mensagemPessoaLabel.setText("Preencha todos os campos!");
            mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Pessoa",
                    nome,
                    idade,
                    altura,
                    getDataHoraAtual()
            };
            salvarNoCSV("pessoas.csv", dados);

            mensagemPessoaLabel.setText(
                    "✅ Pessoa registrada com sucesso!\n" +
                            "Nome: " + nome + "\n" +
                            "Idade: " + idade + "\n" +
                            "Altura: " + altura
            );
            mensagemPessoaLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            alturaPessoaField.clear();
            idadeField.clear();
            nomePessoaField.clear();
        }
    }

    // Metodo para registrar PRODUTO
    @FXML
    protected void onRegistrarProdutoClick() {
        String preco = precoField.getText();
        String origem = origemField.getText();
        String nome = nomeProdutoField.getText();

        if (preco.isEmpty() || origem.isEmpty() || nome.isEmpty()) {
            mensagemProdutoLabel.setText("Preencha todos os campos!");
            mensagemProdutoLabel.setStyle("-fx-text-fill: red;");
        } else {
            // Salvar no CSV
            String[] dados = {
                    "Produto",
                    nome,
                    preco,
                    origem,
                    getDataHoraAtual()
            };
            salvarNoCSV("produtos.csv", dados);

            mensagemProdutoLabel.setText(
                    "✅ Produto registrado com sucesso!\n" +
                            "Nome: " + nome + "\n" +
                            "Preço: " + preco + "\n" +
                            "Origem: " + origem
            );
            mensagemProdutoLabel.setStyle("-fx-text-fill: green;");

            // Limpar campos
            precoField.clear();
            origemField.clear();
            nomeProdutoField.clear();
        }
    }
}
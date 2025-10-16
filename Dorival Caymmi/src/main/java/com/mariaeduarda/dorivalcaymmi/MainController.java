package com.mariaeduarda.dorivalcaymmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

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

    // Método para registrar JANGADA
    @FXML
    protected void onRegistrarJangadaClick() {
        String altura = alturaField.getText();
        String cor = corField.getText();
        String material = materialField.getText();

        if (altura.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            mensagemJangadaLabel.setText("❌ Preencha todos os campos!");
            mensagemJangadaLabel.setStyle("-fx-text-fill: red;");
        } else {
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

    // Método para registrar PESSOA
    @FXML
    protected void onRegistrarPessoaClick() {
        String altura = alturaPessoaField.getText();
        String idade = idadeField.getText();
        String nome = nomePessoaField.getText();

        if (altura.isEmpty() || idade.isEmpty() || nome.isEmpty()) {
            mensagemPessoaLabel.setText("❌ Preencha todos os campos!");
            mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
        } else {
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
            mensagemProdutoLabel.setText(" Preencha todos os campos!");
            mensagemProdutoLabel.setStyle("-fx-text-fill: red;");
        } else {
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
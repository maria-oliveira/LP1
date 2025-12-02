package com.mariaeduarda.dorivalcaymmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import com.mariaeduarda.dorivalcaymmi.DAO.*;
import com.mariaeduarda.dorivalcaymmi.Model.*;

public class MainController {

    //aba jangada
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

    //aba pessoa
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

    //aba produto
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

    // DAOs
    private PessoaDAO pessoaDAO;
    private JangadaDAO jangadaDAO;
    private ProdutoDAO produtoDAO;

    // Inicializa os DAOs
    public void initialize() {
        this.pessoaDAO = new PessoaDAO();
        this.jangadaDAO = new JangadaDAO();
        this.produtoDAO = new ProdutoDAO();
    }

    //metodo chamado quando o botão "registrar" da aba jangada é clicado
    @FXML
    protected void onRegistrarJangadaClick() {
        //obtem os valores digitados
        String alturaText = alturaField.getText();
        String cor = corField.getText();
        String material = materialField.getText();

        //verifica se todos os campos foram preenchidos
        if (alturaText.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            // exibe mensagem de erro
            mensagemJangadaLabel.setText("Preencha todos os campos!");
            mensagemJangadaLabel.setStyle("-fx-text-fill: red;");
        } else {
            try {
                // Converte a altura para double
                double altura = Double.parseDouble(alturaText);

                // Cria o objeto Jangada
                Jangada jangada = new Jangada(altura, cor, material);

                // Salva no banco de dados
                jangadaDAO.salvar(jangada);

                //exibe mensagem de sucesso
                mensagemJangadaLabel.setText(
                        "Jangada registrada com sucesso!\n" +
                                "Altura: " + altura + "\n" +
                                "Cor: " + cor + "\n" +
                                "Material: " + material
                );
                mensagemJangadaLabel.setStyle("-fx-text-fill: green;");

                //limpa os campos para novo registro
                alturaField.clear();
                corField.clear();
                materialField.clear();

            } catch (NumberFormatException e) {
                mensagemJangadaLabel.setText("Altura deve ser um número válido!");
                mensagemJangadaLabel.setStyle("-fx-text-fill: red;");
            } catch (Exception e) {
                mensagemJangadaLabel.setText("Erro ao salvar jangada: " + e.getMessage());
                mensagemJangadaLabel.setStyle("-fx-text-fill: red;");
                e.printStackTrace();
            }
        }
    }

    //metodo chamado quando o botão "registrar" da aba pessoa é clicado
    @FXML
    protected void onRegistrarPessoaClick() {
        //obtem os valores digitados
        String alturaText = alturaPessoaField.getText();
        String idadeText = idadeField.getText();
        String nome = nomePessoaField.getText();

        //verifica se todos os campos foram preenchidos
        if (alturaText.isEmpty() || idadeText.isEmpty() || nome.isEmpty()) {
            //exibe mensagem de erro
            mensagemPessoaLabel.setText("Preencha todos os campos!");
            mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
        } else {
            try {
                // Converte os valores numéricos
                double altura = Double.parseDouble(alturaText);
                int idade = Integer.parseInt(idadeText);

                // Cria o objeto Pessoa
                Pessoa pessoa = new Pessoa(nome, idade, altura);

                // Salva no banco de dados
                pessoaDAO.salvar(pessoa);

                //exibe mensagem de sucesso
                mensagemPessoaLabel.setText(
                        "Pessoa registrada com sucesso!\n" +
                                "Nome: " + nome + "\n" +
                                "Idade: " + idade + "\n" +
                                "Altura: " + altura
                );
                mensagemPessoaLabel.setStyle("-fx-text-fill: green;");

                //limpa os campos para novo registro
                alturaPessoaField.clear();
                idadeField.clear();
                nomePessoaField.clear();

            } catch (NumberFormatException e) {
                mensagemPessoaLabel.setText("Altura e idade devem ser números válidos!");
                mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
            } catch (Exception e) {
                mensagemPessoaLabel.setText("Erro ao salvar pessoa: " + e.getMessage());
                mensagemPessoaLabel.setStyle("-fx-text-fill: red;");
                e.printStackTrace();
            }
        }
    }

    //metodo chamado quando o botão "registrar" da aba produto é clicado
    @FXML
    protected void onRegistrarProdutoClick() {
        //obtem os valores digitados nos campos
        String precoText = precoField.getText();
        String origem = origemField.getText();
        String nome = nomeProdutoField.getText();

        //verifica se todos os campos foram preenchidos
        if (precoText.isEmpty() || origem.isEmpty() || nome.isEmpty()) {
            //exibe mensagem de erro
            mensagemProdutoLabel.setText("Preencha todos os campos!");
            mensagemProdutoLabel.setStyle("-fx-text-fill: red;");
        } else {
            try {
                // Converte o preço para double
                double preco = Double.parseDouble(precoText);

                // Cria o objeto Produto
                Produto produto = new Produto(nome, preco, origem);

                // Salva no banco de dados
                produtoDAO.salvar(produto);

                //exibe mensagem de sucesso em verde
                mensagemProdutoLabel.setText(
                        "Produto registrado com sucesso!\n" +
                                "Nome: " + nome + "\n" +
                                "Preço: R$ " + preco + "\n" +
                                "Origem: " + origem
                );
                mensagemProdutoLabel.setStyle("-fx-text-fill: green;");

                //limpa os campos para novo registro
                precoField.clear();
                origemField.clear();
                nomeProdutoField.clear();

            } catch (NumberFormatException e) {
                mensagemProdutoLabel.setText("Preço deve ser um número válido!");
                mensagemProdutoLabel.setStyle("-fx-text-fill: red;");
            } catch (Exception e) {
                mensagemProdutoLabel.setText("Erro ao salvar produto: " + e.getMessage());
                mensagemProdutoLabel.setStyle("-fx-text-fill: red;");
                e.printStackTrace();
            }
        }
    }
}
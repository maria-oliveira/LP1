package com.mariaeduarda.dorivalcaymmi;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class ProdutoController {

    @FXML
    private TextField precoField;
    @FXML
    private TextField origemField;
    @FXML
    private TextField nomeField;
    @FXML
    private Button registrarButton;
    @FXML
    private Label mensagemLabel;

    @FXML
    protected void onRegistrarClick() {
        String preco = precoField.getText();
        String origem = origemField.getText();
        String nome = nomeField.getText();

        if (preco.isEmpty() || origem.isEmpty() || nome.isEmpty()) {
            mensagemLabel.setText("Preencha todos os campos!");
        } else {
            mensagemLabel.setText(
                    "Registrado com sucesso!\nNome: " + nome +
                            "\nPreço: " + preco +
                            "\nOrigem: " + origem
            );
        }
    }
}

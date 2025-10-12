package com.mariaeduarda.dorivalcaymmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class PessoaController {

    @FXML
    private TextField alturaField;
    @FXML
    private TextField idadeField;
    @FXML
    private TextField nomeField;
    @FXML
    private Button registrarButton;
    @FXML
    private Label mensagemLabel;

    @FXML
    protected void onRegistrarClick() {
        String altura = alturaField.getText();
        String idade = idadeField.getText();
        String nome = nomeField.getText();

        if (altura.isEmpty() || idade.isEmpty() || nome.isEmpty()) {
            mensagemLabel.setText("Preencha todos os campos!");
        } else {
            mensagemLabel.setText(
                    "Registrado com sucesso!\nNome: " + nome +
                            "\nIdade: " + idade +
                            "\nAltura: " + altura
            );
        }
    }
}

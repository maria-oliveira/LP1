package com.mariaeduarda.dorivalcaymmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class JangadaController {

    @FXML
    private TextField alturaField;

    @FXML
    private TextField corField;

    @FXML
    private TextField materialField;

    @FXML
    private Button registrarButton;

    @FXML
    private Label mensagemLabel;

    @FXML
    protected void onRegistrarClick() {
        String altura = alturaField.getText();
        String cor = corField.getText();
        String material = materialField.getText();

        if (altura.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            mensagemLabel.setText("Preencha todos os campos!");
        } else {
            mensagemLabel.setText(
                    "Registrado com sucesso!\nAltura: " + altura +
                            "\nCor: " + cor +
                            "\nMaterial: " + material
            );
        }
    }
}

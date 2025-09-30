package com.mariaeduarda;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    @FXML private TextField jangadaAltura;
    @FXML private TextField jangadaCor;
    @FXML private TextField jangadaMaterial;

    @FXML private TextField pessoaNome;
    @FXML private TextField pessoaIdade;
    @FXML private TextField pessoaAltura;

    @FXML private TextField produtoNome;
    @FXML private TextField produtoOrigem;
    @FXML private TextField produtoPreco;

    @FXML private Button registrarMusicaBtn;

    @FXML
    private void registrarMusica() {
        try (FileWriter writer = new FileWriter("musica.csv", true)) {
            writer.write(jangadaAltura.getText() + ";" +
                    jangadaCor.getText() + ";" +
                    jangadaMaterial.getText() + ";" +
                    pessoaNome.getText() + ";" +
                    pessoaIdade.getText() + ";" +
                    pessoaAltura.getText() + ";" +
                    produtoNome.getText() + ";" +
                    produtoOrigem.getText() + ";" +
                    produtoPreco.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private TextField filmePessoaNome;
    @FXML private TextField filmePessoaAltura;
    @FXML private TextField filmePessoaIdade;

    @FXML private TextField filmeCasaDecoracao;
    @FXML private TextField filmeCasaCor;
    @FXML private TextField filmeCasaQtd;

    @FXML private TextField filmePocaoNome;
    @FXML private TextField filmePocaoCor;
    @FXML private TextField filmePocaoRaridade;

    @FXML private Button registrarFilmeBtn;

    @FXML
    private void registrarFilme() {
        try (FileWriter writer = new FileWriter("filme.csv", true)) {
            writer.write(filmePessoaNome.getText() + ";" +
                    filmePessoaAltura.getText() + ";" +
                    filmePessoaIdade.getText() + ";" +
                    filmeCasaDecoracao.getText() + ";" +
                    filmeCasaCor.getText() + ";" +
                    filmeCasaQtd.getText() + ";" +
                    filmePocaoNome.getText() + ";" +
                    filmePocaoCor.getText() + ";" +
                    filmePocaoRaridade.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private TextField doodlePessoaNome;
    @FXML private TextField doodlePessoaAltura;
    @FXML private TextField doodlePessoaIdade;

    @FXML private TextField doodleAnimalRaca;
    @FXML private TextField doodleAnimalIdade;
    @FXML private TextField doodleAnimalCor;

    @FXML private TextField doodleVeiculoCor;
    @FXML private TextField doodleVeiculoQtdRodas;
    @FXML private TextField doodleVeiculoMotor;

    @FXML private Button registrarDoodleBtn;

    @FXML
    private void registrarDoodle() {
        try (FileWriter writer = new FileWriter("doodle.csv", true)) {
            writer.write(doodlePessoaNome.getText() + ";" +
                    doodlePessoaAltura.getText() + ";" +
                    doodlePessoaIdade.getText() + ";" +
                    doodleAnimalRaca.getText() + ";" +
                    doodleAnimalIdade.getText() + ";" +
                    doodleAnimalCor.getText() + ";" +
                    doodleVeiculoCor.getText() + ";" +
                    doodleVeiculoQtdRodas.getText() + ";" +
                    doodleVeiculoMotor.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private TextField vikBebidaTemp;
    @FXML private TextField vikBebidaCor;
    @FXML private TextField vikBebidaPreco;

    @FXML private TextField vikCanecaCor;
    @FXML private TextField vikCanecaMaterial;
    @FXML private TextField vikCanecaTextura;

    @FXML private TextField vikGraoCor;
    @FXML private TextField vikGraoOrigem;
    @FXML private TextField vikGraoQualidade;

    @FXML private Button registrarVikBtn;

    @FXML
    private void registrarVik() {
        try (FileWriter writer = new FileWriter("vik.csv", true)) {
            writer.write(vikBebidaTemp.getText() + ";" +
                    vikBebidaCor.getText() + ";" +
                    vikBebidaPreco.getText() + ";" +
                    vikCanecaCor.getText() + ";" +
                    vikCanecaMaterial.getText() + ";" +
                    vikCanecaTextura.getText() + ";" +
                    vikGraoCor.getText() + ";" +
                    vikGraoOrigem.getText() + ";" +
                    vikGraoQualidade.getText() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

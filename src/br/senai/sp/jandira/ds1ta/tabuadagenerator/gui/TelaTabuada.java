package br.senai.sp.jandira.ds1ta.tabuadagenerator.gui;

import br.senai.sp.jandira.ds1ta.tabuadagenerator.model.Gerador;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(true);
        stage.setTitle("Tabuada");

        //criar elemento principal, criar a cena, colocar o elemento principal na cena e a cena no palco
        VBox root = new VBox();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        //criar header
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #000000");


        //adicionar conteúdo ao header
        Label lblTitulo = new Label("Tabuada");
        Label lblSubTitulo = new Label("Crie a tabuada que a sua imaginação mandar.");
        header.getChildren().addAll(lblTitulo,lblSubTitulo);

        //criar gridpane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setPrefHeight(100);
        gridPane.setStyle("-fx-background-color: #06732a");

        //adicionar o conteúdo ao gridpane
        Label lblMultiplicando = new Label("Multiplicando:");
        TextField tfMultiplicando = new TextField();

        Label lblIntervaloMenor = new Label("Intervalo menor:");
        TextField tfIntervaloMenor = new TextField();

        Label lblIntervaloMaior = new Label("Intervalo maior:");
        TextField tfIntervaloMaior = new TextField();


        //colocar os componentes no grid

        gridPane.add(lblMultiplicando,0,0);
        gridPane.add(tfMultiplicando,1,0);
        gridPane.add(lblIntervaloMenor,0,1);
        gridPane.add(tfIntervaloMenor,1,1);
        gridPane.add(lblIntervaloMaior,0,2);
        gridPane.add(tfIntervaloMaior,1,2);

        //hbox de botoes
        HBox botoes = new HBox();
        botoes.setPrefHeight(100);
        botoes.setStyle("-fx-background-color: #106a56");

        //criar botoes
        Button calcular = new Button("Calcular");
        Button Limpar = new Button("Limpar");
        Button sair = new Button("Sair");

        //botar os botoes no hbox

        botoes.getChildren().addAll(calcular,Limpar,sair);

        //criar vbox de resultados
        VBox resultados = new VBox();
        resultados.setPrefHeight(200);
        resultados.setStyle("-fx-background-color: red");

        //criar conteúdo de resultados
        Label lblResultados = new Label("Resultados:");
        ListView lista = new ListView();



        //adicionar conteúdo ao vbox resultados
        resultados.getChildren().addAll(lista,lblResultados);

        //adicionar componentes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridPane);
        root.getChildren().add(botoes);
        root.getChildren().add(resultados);

        stage.show();


    }

}

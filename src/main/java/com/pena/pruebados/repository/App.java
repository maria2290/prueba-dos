package com.pena.pruebados.repository;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Aplication{

    private static final String VISTA_PRINCIPAL = "/cl/duoc/pokedex/view/pokedex-view.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        URL vista = App.class.getResource(VISTA_PRINCIPAL);
        if (vista == null) {
            throw new IllegalStateException("No se encontró la vista principal: " + VISTA_PRINCIPAL);
        }
        Parent root = FXMLLoader.load(vista);
        stage.setTitle("Pokédex de Cartas");
        stage.setScene(new Scene(root));
        stage.show();
    }

}

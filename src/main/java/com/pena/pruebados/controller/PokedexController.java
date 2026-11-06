package com.pena.pruebados.controller;

import cl.duoc.pokedex.model.Carta;
import cl.duoc.pokedex.model.CartaEnergia;
import cl.duoc.pokedex.model.CartaPokemon;
import cl.duoc.pokedex.repository.CartaRepository;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class PokedexController {

    private static final String CATEGORIA_POKEMON = "Pokémon";
    private static final String CATEGORIA_ENERGIA = "Energía";



    @FXML
    private ComboBox<String> categoriaComboBox;
    @FXML
    private TextField nombreField;
    @FXML
    private TextField anioField;
    @FXML
    private TextField cantidadField;
    @FXML
    private TextField tipoElementalField;
    @FXML
    private CheckBox brillanteCheckBox;
    @FXML
    private CheckBox evolucionActivaCheckBox;
    @FXML
    private TextField cantidadEnergiaField;

    @FXML
    private Button registrarButton;
    @FXML
    private Button eliminarButton;
    @FXML
    private Label mensajeLabel;

    @FXML
    private TableView<Carta> cartasTable;
    @FXML
    private TableColumn<Carta, String> categoriaColumn;
    @FXML
    private TableColumn<Carta, String> nombreColumn;
    @FXML
    private TableColumn<Carta, Integer> anioColumn;
    @FXML
    private TableColumn<Carta, Integer> cantidadColumn;
    @FXML
    private TableColumn<Carta, String> valorColumn;

    private final ObservableList<Carta> cartas = FXCollections.observableArrayList();
    private final CartaRepository repository = new CartaRepository();

    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<String> categoriaComboBox;

    @FXML
    public void initialize() {
        configurarTabla();

        categoriaComboBox.setItems(FXCollections.observableArrayList(CATEGORIA_POKEMON, CATEGORIA_ENERGIA));
        categoriaComboBox.valueProperty().addListener((observable, anterior, nuevo) -> actualizarCamposPorCategoria());
        categoriaComboBox.getSelectionModel().selectFirst();

        cargarDatos();
    }

    private void cargarDatos() {
    }

    private void configurarTabla() {
    }

    public PokedexController(ComboBox<String> categoriaComboBox) {
        this.categoriaComboBox = categoriaComboBox;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

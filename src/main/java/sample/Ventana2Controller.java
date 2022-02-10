package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Ventana2Controller implements Initializable {

    private Ventana1Controller controller;
    private Ventana1Controller.Pokemon pokemonCargado;



    @FXML
    private Label ataque1;

    @FXML
    private Label ataque2;

    @FXML
    private Label ataque3;

    @FXML
    private Button bAtacar;

    @FXML
    private Button bCurar;

    @FXML
    private ProgressBar barraContrincante;

    @FXML
    private ProgressBar barraMiPokemon;

    @FXML
    private Label cancelar;

    @FXML
    private ImageView escenario;

    @FXML
    private ImageView fotoContrincante;

    @FXML
    private ImageView fotoMiPokemon;

    @FXML
    private Label nivelContrincante;

    @FXML
    private Label nivelMiPokemon;

    @FXML
    private Label nombreContrincante;

    @FXML
    private Label nombreMiPokemon;

    @FXML
    private Label psContrincante;

    @FXML
    private Label psMiPokemon;

    @FXML
    void ejecutarAtaque1(MouseEvent event) {

    }

    @FXML
    void ejecutarAtaque2(MouseEvent event) {

    }

    @FXML
    void ejecutarAtaque3(MouseEvent event) {

    }

    @FXML
    void ejecutarCancelacion(MouseEvent event) {

    }

    @FXML
    void mostrarPSContrincante(MouseEvent event) {

    }

    @FXML
    void mostrarPSMiPokemon(MouseEvent event) {

    }

    @FXML
    void mostrarVidaContrincante(MouseEvent event) {

    }

    @FXML
    void mostrarVidaMiPokemon(MouseEvent event) {

    }

    public static ArrayList<Ventana1Controller.Pokemon> listaPokemon;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Ventana1.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Ventana1Controller ventana1Controller=fxmlLoader.getController();
            this.controller=ventana1Controller;
            this.pokemonCargado=Ventana1Controller.miPokemon;

            apagarBotones();
            ArrayList<Ventana1Controller.Pokemon> listaPokemon=new ArrayList<>();

            Ventana1Controller.Pokemon poke3 = new Ventana1Controller.Pokemon("Dragonite", 100, 100, "Nv 100", "src\\main\\resources\\Image\\dragonite.gif", "src\\main\\resources\\Image\\sex.png", "src\\main\\resources\\Image\\tic.png");
            Ventana1Controller.Pokemon poke4 = new Ventana1Controller.Pokemon("Blastoise", 100, 100, "Nv 100", "src\\main\\resources\\Image\\blastoise.gif", "src\\main\\resources\\Image\\sex.png", "src\\main\\resources\\Image\\tic.png");
            Ventana1Controller.Pokemon poke5 = new Ventana1Controller.Pokemon("Alakazam", 100, 100, "Nv 100", "src\\main\\resources\\Image\\alakazam.gif", "src\\main\\resources\\Image\\sex.png", "src\\main\\resources\\Image\\tic.png");
            Ventana1Controller.Pokemon poke6 = new Ventana1Controller.Pokemon("Aracanine", 100, 100, "Nv 100", "src\\main\\resources\\Image\\arcanine.gif", "src\\main\\resources\\Image\\sex.png", "src\\main\\resources\\Image\\tic.png");

            listaPokemon.add(poke4);
            this.listaPokemon=listaPokemon;
            //añadir los contrincantes que he creado

            cargarContrincante();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void cargarMiPokemon(){
        nombreMiPokemon.setText(pokemonCargado.getNombre());
        //hacer con todos los datos
    }

    public void cargarContrincante(){

        nombreContrincante.setText(listaPokemon.get(0).getNombre());
    }

    public void apagarBotones(){
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);
    }

    public void encenderBotones(){
        ataque1.setVisible(true);
        ataque2.setVisible(true);
        ataque3.setVisible(true);
        cancelar.setVisible(true);
    }

}

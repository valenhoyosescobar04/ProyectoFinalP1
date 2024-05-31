package edu.cue.proyectofinal.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
public class TestController2 {


        @FXML
        private Button menuButton;

        @FXML
        private Label label;

        @FXML
        private ImageView gameImage1;

        @FXML
        private ImageView gameImage2;

        @FXML
        private ImageView gameImage3;

        @FXML
        private ImageView gameImage4;

        @FXML
        private MediaView mediaView;

        @FXML
        private Button buyButton;

        @FXML
        private Label gameTitle;

        @FXML
        private Label gamePrice;

        @FXML
        private Label gameOldPrice;

        @FXML
        private Button storeButton;

        @FXML
        private Button libraryButton;

        @FXML
        private Button cartButton;

        @FXML
        public void initialize() {
            // Configurar el MediaView para reproducir un video
            String videoPath = "src/edu/cue/proyectofinal/resources/videos/assassins_creed_unity.mp4"; // Ruta al video
            Media media = new Media(new File(videoPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.setAutoPlay(true);

            // Configurar acciones de los botones
            storeButton.setOnAction(event -> openStore());
            libraryButton.setOnAction(event -> openLibrary());
            cartButton.setOnAction(event -> openCart());
            buyButton.setOnAction(event -> buyGame());
        }

        private void openStore() {
            System.out.println("Abriendo Tienda...");
            // Aquí iría la lógica para cambiar a la vista de la tienda
        }

        private void openLibrary() {
            System.out.println("Abriendo Biblioteca...");
            // Aquí iría la lógica para cambiar a la vista de la biblioteca
        }

        private void openCart() {
            System.out.println("Abriendo Carrito...");
            // Aquí iría la lógica para cambiar a la vista del carrito
        }

        private void buyGame() {
            System.out.println("Comprando Assassin's Creed Unity...");
            // Aquí iría la lógica para procesar la compra del juego
        }
    }


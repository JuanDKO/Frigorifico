/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class InicioController implements Initializable {

    @FXML
    private Label Alimentos;
    @FXML
    private Label Interior;
    @FXML
    private Label termostato;
    @FXML
    private Label Tiempo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiarAlimentos(MouseEvent event) {
    }

    @FXML
    private void cambiarInterior(MouseEvent event) {
        Stage escPrin = (Stage) Interior.getScene().getWindow();
           
           Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vistas/Interior.fxml"));
            Scene scene = new Scene(root);
            
            escPrin.setTitle("Interior");
            // Seteo la scene y la muestro
            escPrin.setScene(scene);
            escPrin.show();
        } catch (IOException ex) {
            System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }   
    }

    @FXML
    private void cambiarAjustes(MouseEvent event) {
        Stage escPrin = (Stage) Interior.getScene().getWindow();
           
           Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vistas/Ajustes.fxml"));
            Scene scene = new Scene(root);
            
            escPrin.setTitle("Interior");
            // Seteo la scene y la muestro
            escPrin.setScene(scene);
            escPrin.show();
        } catch (IOException ex) {
            System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }   
    }

    @FXML
    private void cambiarTiempo(MouseEvent event) {
    }
    
}

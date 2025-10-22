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
public class InteriorController implements Initializable {

    @FXML
    private Label volverInicio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volverInicio(MouseEvent event) {
        Stage escPrin = (Stage) volverInicio.getScene().getWindow();
           
           Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vistas/Inicio.fxml"));
            Scene scene = new Scene(root);
            
            escPrin.setTitle("Inicio");
            // Seteo la scene y la muestro
            escPrin.setScene(scene);
            escPrin.show();
        } catch (IOException ex) {
            System.getLogger(InicioController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 
    }
}
    

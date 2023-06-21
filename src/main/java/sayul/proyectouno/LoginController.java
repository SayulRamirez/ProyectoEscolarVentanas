/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sayul.proyectouno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sayul
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tFieldUsuario;
    @FXML
    private PasswordField tFieldPassword;
    @FXML
    private CheckBox checkBoxRecordar;
    @FXML
    private Button botonInicioSesion;
    @FXML
    private Label labelMensaje;
    @FXML
    private Label labelContrasenaOlvidada;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionInicioSesion(ActionEvent event) {
    }
    
}

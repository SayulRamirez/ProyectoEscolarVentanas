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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sayul
 */
public class AlmacenamientoController implements Initializable {

    @FXML
    private TableColumn<?, ?> columnaId;
    @FXML
    private TableColumn<?, ?> columnaProducto;
    @FXML
    private TableColumn<?, ?> columnaClave;
    @FXML
    private TableColumn<?, ?> columnaCosto;
    @FXML
    private TableColumn<?, ?> columnaPrecio;
    @FXML
    private TableColumn<?, ?> columnaExistencia;
    @FXML
    private TextField tfieldId;
    @FXML
    private TextField tFieldProducto;
    @FXML
    private TextField tFieldClave;
    @FXML
    private TextField tFieldCosto;
    @FXML
    private TextField tFieldPrecio;
    @FXML
    private TextField tFieldExistencia;
    @FXML
    private Button botonAgregar;
    @FXML
    private Button botonCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void botonAgregarAccion(ActionEvent event) {
    }

    @FXML
    private void botonCancelarAccion(ActionEvent event) {
    }
    
}

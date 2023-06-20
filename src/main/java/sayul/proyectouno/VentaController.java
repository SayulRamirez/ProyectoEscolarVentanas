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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sayul
 */
public class VentaController implements Initializable {

    @FXML
    private TableColumn<?, ?> columnaCantidad;
    @FXML
    private TableColumn<?, ?> columnaClave;
    @FXML
    private TableColumn<?, ?> columnaProducto;
    @FXML
    private TableColumn<?, ?> columnaImporte;
    @FXML
    private Label labelFecha;
    @FXML
    private Label labelHora;
    @FXML
    private Label labelTicket;
    @FXML
    private TextArea tAreaCliente;
    @FXML
    private TextField tFieldImporteTotal;
    @FXML
    private TextField tFieldImporteRecibido;
    @FXML
    private TextField tFieldCambio;
    @FXML
    private Button botonCobrar;
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
    private void botonCobrarAccion(ActionEvent event) {
    }

    @FXML
    private void botonCancelarAccion(ActionEvent event) {
    }
    
}

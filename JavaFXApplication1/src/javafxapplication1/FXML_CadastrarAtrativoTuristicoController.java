/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author waldir
 */
public class FXML_CadastrarAtrativoTuristicoController implements Initializable {

    @FXML
    private TextField tfSite;

    @FXML
    private TextField tfLatitude;

    @FXML
    private TextField tfComoChegar;

    @FXML
    private TextField tfLongitude;

    @FXML
    private TextField tfNomeAtrativo;

    @FXML
    private ComboBox<?> cbMunicipio;

    @FXML
    private ToggleGroup tipoEventoGroup;

    @FXML
    void btnCadastrar(ActionEvent event) {

    }

    @FXML
    void btnVoltar(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

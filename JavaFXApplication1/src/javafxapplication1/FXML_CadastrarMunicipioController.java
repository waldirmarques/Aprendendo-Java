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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author waldir
 */
public class FXML_CadastrarMunicipioController implements Initializable {

     @FXML
    private TextField tfMunicipio;

    @FXML
    private TextField tfPopulacao;

    @FXML
    private TextField tfLongitude;

    @FXML
    private TextField tfLatitude;

    @FXML
    private TextField tfEstado;

    @FXML
    private TextField tfSite;

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

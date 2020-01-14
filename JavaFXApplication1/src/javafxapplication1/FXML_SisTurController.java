/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author waldir
 */
public class FXML_SisTurController implements Initializable {
    protected static Stage janCadMun;
    
    public FXML_SisTurController(){
        //JavaFXApplication1 maim = new JavaFXApplication1();
        //janMenu = maim.getJanelaMenu();
    }
    
    @FXML
    void btnClikCadastrarAtrativoTuristico(ActionEvent event) {
        
    }

    @FXML
    void btnClikCadastrarMunicipio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_CadastrarMunicipio.fxml"));
        
        Scene scene = new Scene(root);
        
        janCadMun = new Stage();
        janCadMun.setScene(scene);
        janCadMun.show();
        JavaFXApplication1.janelaMenu.hide();
    }

    @FXML
    void btnClikListarAtrativosMunicipios(ActionEvent event) {

    }

    @FXML
    void btnClikListarMunicipios(ActionEvent event) {

    }

    @FXML
    void btnClikSair(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
}

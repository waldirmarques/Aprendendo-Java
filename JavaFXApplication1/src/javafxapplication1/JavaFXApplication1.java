/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author waldir
 */
public class JavaFXApplication1 extends Application {
   
    protected static Stage janelaMenu;
    protected static GerenciadorDeJanelas janelas;
    
    @Override
    public void start(Stage stage) throws Exception {
        janelas = new GerenciadorDeJanelas();
        janelas.AbrirJanelas("FXML_SisTur.fxml");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public Stage getJanelaMenu(){
        return this.janelaMenu;
    }
    
}

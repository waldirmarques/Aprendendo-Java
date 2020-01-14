package javafxapplication1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GerenciadorDeJanelas {
    String janelas[] = {"FXML_AtrativoNatural","FXML_AtrativoProgramado","FXML_CadastrarAtrativoTuristico","FXML_CadastrarMunicipio","FXML_Resutados","FXML_SisTur"}; 
    List<Stage> stages;
    public GerenciadorDeJanelas(){
        this.stages = new ArrayList<>();
        for(String j: janelas){
            Stage novaStage = new Stage();
            stages.add(novaStage);
        }
    }
    public void AbrirJanelas(String janelaAbrir) throws IOException{
        for(int m = 0; m < janelas.length;m++){
            if(janelas[m].equals(janelaAbrir)){
                Parent root = FXMLLoader.load(getClass().getResource("FXML_SisTur.fxml"));   
                Scene scene = new Scene(root);
                Stage janela = new Stage();
                janela.setScene(scene);
                stages.set(m, janela);
                janela.show();
            }
        }
    }
    
    public void fecharJanelas(String janelaAbrir) throws IOException{
        for(int m = 0; m < janelas.length;m++){
            if(janelas[m].equals(janelaAbrir)){
                stages.get(m).close();
            }
        }
    }
}

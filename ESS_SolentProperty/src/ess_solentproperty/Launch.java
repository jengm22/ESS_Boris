package ess_solentproperty;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author 1leszd34
 */
public class Launch extends Application {
    
    @Override
    public void start(Stage stage) {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));        
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

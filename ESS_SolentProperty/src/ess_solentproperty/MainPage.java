package ess_solentproperty;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author 1leszd34
 */
public class MainPage extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMainPage.fxml"));
        try {
            loader.load();
            System.out.println("Main Page loaded successfully.");
        } catch (NullPointerException e) {
            System.out.println("----- NullPointerException -----");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("----- IOException -----");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("----- Unknown error -----");
            System.out.println(e.getMessage());
        }
        
        FXMLMainPageController ctrlMainPage = new FXMLMainPageController();
        AnchorPane apMain = ctrlMainPage.getAPMain();
        StackPane mainStack = new StackPane();
        mainStack.getChildren().add(apMain);
        Scene mainScene = new Scene(mainStack);
        Stage mainStage = new Stage();
        mainStage.setTitle("Solent Property Solutions");
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

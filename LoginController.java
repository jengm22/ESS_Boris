/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ess_solentproperty;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class LoginController implements Initializable {
    
    @FXML 
    private Label lblStatus;
    
    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassword; 
   
    @FXML
    public void Login(ActionEvent event)throws IOException  {  
           
        System.out.println(txtUserName);
        System.out.println(event.toString());
        
        if(txtUserName.getText().equals("user")&& txtPassword.getText().equals("pass")){
            lblStatus.setText("Login Success");
              Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLMainPage.fxml"));        
            Scene scene = new Scene(root);        
            stage.setScene(scene);
            stage.show();         
            ((Node) (event.getSource())).getScene().getWindow().hide();          
        }
        else{
            lblStatus.setText("Login Failed");
         } 
       
    }
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

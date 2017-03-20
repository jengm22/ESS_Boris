
package ess_solentproperty;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author 1leszd34
 */
public class FXMLMainPageController implements Initializable {
    Account user;
    
    /*
        FXML Elements
    */
    @FXML private AnchorPane apBackground;
    @FXML private MenuBar menuMain;
    @FXML private Menu menuFile;
    @FXML private MenuItem miLogout;
    @FXML private MenuItem miExit;
    @FXML private Menu menuAccounts;
    @FXML private MenuItem miMyAccount;
    @FXML private SeparatorMenuItem smiAccounts;
    @FXML private MenuItem miViewAccounts;
    @FXML private Menu menuStock;
    @FXML private MenuItem miStock;
    @FXML private GridPane gpMain;
    @FXML private Label lblNumber;
    @FXML private Label lblAddress;
    @FXML private Label lblStatus;
    @FXML private Label lblServices;
    
    /*
        FXML Get Methods
    */
    @FXML private AnchorPane getApBackground() { return apBackground; }
    @FXML private MenuBar getMenuBar() { return menuMain; }
    @FXML private Menu getMenuFile() { return menuFile; }
    @FXML private MenuItem getMiLogout() { return miLogout; }
    @FXML private MenuItem getMiExit() { return miExit; }
    @FXML private Menu getMenuAccounts() { return menuAccounts; }
    @FXML private MenuItem getMiMyAccount() { return miMyAccount; }
    @FXML private SeparatorMenuItem getSmiAccounts() { return smiAccounts; }
    @FXML private MenuItem getMiViewAccounts() { return miViewAccounts; }
    @FXML private Menu getMenuStock() { return menuStock; }
    @FXML private MenuItem getMiStock() { return miStock; }
    @FXML private Label getLblNumber() { return lblNumber; }
    @FXML private Label getLblAddress() { return lblAddress; }
    @FXML private Label getLblStatus() { return lblStatus; }
    @FXML private Label getLblServices() { return lblServices; }
    
    /*
        FXML Set Methods
    */
    @FXML private void setApBackground(AnchorPane ap) { apBackground = ap; }
    @FXML private void setMenuBar(MenuBar mb) { menuMain = mb; }
    @FXML private void setMenuFile(Menu m) { menuFile = m; }
    @FXML private void setMiLogout(MenuItem mi) { miLogout = mi; }
    @FXML private void setMiExit(MenuItem mi) { miExit = mi; }
    @FXML private void setMenuAccounts(Menu m) { menuAccounts = m; }
    @FXML private void setMiMyAccount(MenuItem mi) { miMyAccount = mi; }
    @FXML private void setSmiAccounts(SeparatorMenuItem smi) { smiAccounts = smi; }
    @FXML private void setMiViewAccounts(MenuItem mi) { miViewAccounts = mi; }
    @FXML private void setMenuStock(Menu m) { menuStock = m; }
    @FXML private void setMiStock(MenuItem mi) { miStock = mi; }
    @FXML private void setGpMain(GridPane gp) { gpMain = gp; }
    @FXML private void setLblNumber(Label lbl) { lblNumber = lbl; }
    @FXML private void setLblAddress(Label lbl) { lblAddress = lbl; }
    @FXML private void setLblStatus(Label lbl) { lblStatus = lbl; }
    @FXML private void setLblServices(Label lbl) { lblServices = lbl; }
    
    // Log out current user from system
    private void logout() {
        user = null;
        // Show login page
    }
    
    // Exit the program
    private void exit() {
        user = null;
        System.exit(0);
    }
    
    // View the current user's account
    private void myAccount() {
        // get current user
        // View user account
    }
    
    // View accounts page
    private void viewAccounts() {
        // Check current user is an admin
        if (user.isAdmin()) {
            
        }
    }
    
    // View stock page
    private void viewStock() {
        // Stock page being done by Dan
    }
    
    private void getCurrentAccount() {
//        Account user = FXMLLoginController.getCurrentUser();
        user = new Account("Bob", "123", true);
    }
    
    // Display Main page
    public void show() {
        
        Stage mainPage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Disable admin elements if the current user is not an admin
        if (user.isAdmin() == false) {
            smiAccounts.setVisible(false);
            smiAccounts.setDisable(true);
            miViewAccounts.setVisible(false);
            miViewAccounts.setDisable(true);
            menuStock.setVisible(false);
            menuStock.setDisable(true);
            miStock.setVisible(false);
            miStock.setDisable(true);
        }
    }    
}

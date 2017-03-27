package ess_solentproperty;

import java.net.URL;
import java.util.ResourceBundle;
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
 * @author Dean Leszman - 1LESZD34
 */
public class FXMLMainPageController implements Initializable {
    Account user;
    
    /*
        FXML Elements
    */
    @FXML public AnchorPane apMain;
    @FXML public AnchorPane apSummary;
    @FXML public MenuBar menuMain;
    @FXML public Menu menuFile;
    @FXML public MenuItem miLogout;
    @FXML public MenuItem miExit;
    @FXML public Menu menuAccounts;
    @FXML public MenuItem miMyAccount;
    @FXML public SeparatorMenuItem smiAccounts;
    @FXML public MenuItem miViewAccounts;
    @FXML public Menu menuStock;
    @FXML public MenuItem miStock;
    @FXML public GridPane gpSummary;
    @FXML public Label lblSummaryNumber;
    @FXML public Label lblSummaryAddress;
    @FXML public Label lblSummaryStatus;
    @FXML public Label lblSummaryServices;
    
    /*
        FXML Get Methods
    */
    @FXML public AnchorPane getAPMain() { return apMain; }
    @FXML public AnchorPane getApSummary() { return apSummary; }
    @FXML public MenuBar getMenuBar() { return menuMain; }
    @FXML public Menu getMenuFile() { return menuFile; }
    @FXML public MenuItem getMiLogout() { return miLogout; }
    @FXML public MenuItem getMiExit() { return miExit; }
    @FXML public Menu getMenuAccounts() { return menuAccounts; }
    @FXML public MenuItem getMiMyAccount() { return miMyAccount; }
    @FXML public SeparatorMenuItem getSmiAccounts() { return smiAccounts; }
    @FXML public MenuItem getMiViewAccounts() { return miViewAccounts; }
    @FXML public Menu getMenuStock() { return menuStock; }
    @FXML public MenuItem getMiStock() { return miStock; }
    @FXML public GridPane getGpSummary() { return gpSummary; }
    @FXML public Label getLblNumber() { return lblSummaryNumber; }
    @FXML public Label getLblAddress() { return lblSummaryAddress; }
    @FXML public Label getLblStatus() { return lblSummaryStatus; }
    @FXML public Label getLblServices() { return lblSummaryServices; }
    
    /*
        FXML Set Methods
    */
    @FXML public void setApMain(AnchorPane ap) { apMain = ap; }
    @FXML public void setApSummary(AnchorPane ap) { apSummary = ap; }
    @FXML public void setMenuBar(MenuBar mb) { menuMain = mb; }
    @FXML public void setMenuFile(Menu m) { menuFile = m; }
    @FXML public void setMiLogout(MenuItem mi) { miLogout = mi; }
    @FXML public void setMiExit(MenuItem mi) { miExit = mi; }
    @FXML public void setMenuAccounts(Menu m) { menuAccounts = m; }
    @FXML public void setMiMyAccount(MenuItem mi) { miMyAccount = mi; }
    @FXML public void setSmiAccounts(SeparatorMenuItem smi) { smiAccounts = smi; }
    @FXML public void setMiViewAccounts(MenuItem mi) { miViewAccounts = mi; }
    @FXML public void setMenuStock(Menu m) { menuStock = m; }
    @FXML public void setMiStock(MenuItem mi) { miStock = mi; }
    @FXML public void setGpSummary(GridPane gp) { gpSummary = gp; }
    @FXML public void setLblSummaryNumber(Label lbl) { lblSummaryNumber = lbl; }
    @FXML public void setLblSummaryAddress(Label lbl) { lblSummaryAddress = lbl; }
    @FXML public void setLblSummaryStatus(Label lbl) { lblSummaryStatus = lbl; }
    @FXML public void setLblSummaryServices(Label lbl) { lblSummaryServices = lbl; }
    
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
    
    /*
        Called upon initialisation of controller
    */
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
        
        // Create a template set of employees
        
    }    
}

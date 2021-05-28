
package fx.test;

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
import javafx.stage.Stage;
    
    //Daniel Wolfe
    //patient information search controller
    //this page allows the user to search for patient information by entering name or room number

public class PatientLookupController implements Initializable {
    
     //variables for changing scenes
    private Stage stage;
    private Scene scene;
    private Parent root;
    
        //button for entering patient name
    @FXML
    private void handleButtonName(ActionEvent event) {
        
    }
    
        //button for entering patient room
    @FXML
    private void handleButtonRoom(ActionEvent event) {
        
    }
    
        //button to head back to the menu
    @FXML
    private void handleButtonBack(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("PatientMenu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}

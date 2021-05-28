
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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
    
    //Daniel Wolfe
    //Patient information entry controller
    //this page allows a user to enter patient information to store it into the database
    //requires most field to be entered in order for buttion method to activate
    //displays entered information into a text area on the screen

public class NewPatientController implements Initializable {
    
        //variables for changing scenes
    private Stage stage;
    private Scene scene;
    private Parent root;
    
        //text variables
    @FXML
    private Button buttonAdd;
    @FXML
    private TextField firstIn;
    @FXML
    private TextField lastIn;
    @FXML
    private TextField ageIn;
    @FXML
    private TextField sexIn;
    @FXML
    private TextField illnessIn;
    @FXML
    private TextField roomIn;
    @FXML
    private TextField allergiesIn;
    @FXML
    private TextField DateIn;
    @FXML
    private TextField wardIn;
    @FXML
    private TextArea textOut;
    
        //button for adding patient information to the database
    @FXML
    private void handleButtonAdd(ActionEvent event) {
        
            //text field input variables for patient information
        String first = firstIn.getText();
        String last = lastIn.getText();
        String age = ageIn.getText();
        String sex = sexIn.getText();
        String illness = illnessIn.getText();
        String room = roomIn.getText();
        String allergies = allergiesIn.getText();
        String ward = wardIn.getText();
        String date = DateIn.getText();
        
            //patient class constructor for holding patient information
        Patient newpatient = new Patient(first, last, age, sex, illness, allergies, date, ward, room);
        
            //if statement checking that the required fields are filled
        if(first == null || first.isEmpty() || first.trim().isEmpty() && last == null || last.isEmpty() || last.trim().isEmpty() 
                && illness == null || illness.isEmpty() || illness.trim().isEmpty() && ward == null || ward.isEmpty() || ward.trim().isEmpty() 
                && room == null || room.isEmpty() || room.trim().isEmpty() && age == null || age.isEmpty() || age.trim().isEmpty())
        {
            textOut.setText("Invalid Input: Not all required fields are filled in");
        }
        else{
            
                //displays information in text area from the patient class to string method
            textOut.setText(newpatient.toString());

                //resets input text fields to blank
            firstIn.setText("");
            lastIn.setText("");
            ageIn.setText("");
            sexIn.setText("");
            illnessIn.setText("");
            roomIn.setText("");
            allergiesIn.setText("");
            wardIn.setText("");
            DateIn.setText("");

            //CODE FOR ADDING TO THE DATABASE HERE!!
        
            
        }
         
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

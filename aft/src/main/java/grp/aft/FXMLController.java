package grp.aft;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Screen;

public class FXMLController implements javafx.fxml.Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Implementing the Initializable interface means that this method
        // will be called when the controller instance is created
       // App.setController(this);
    }

    public void handleButtonAction(ActionEvent event) {
    	Screen ws = Screen.getPrimary();
    	System.out.println(ws);
    }
}

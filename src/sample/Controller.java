package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    private TextField myTextField;

    int count = 0;

    public void Count(ActionEvent e){
        ++count;
        myTextField.setText(count+" ");
    }
}

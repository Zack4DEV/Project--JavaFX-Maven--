package stream.radio;
     
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

class Controller {

     @FXML
     public void Radio(ActionEvent actionEvent) throws IOException {
          
          Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

          window.setScene(root);
          window.show();
     } 
}

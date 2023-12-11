package stream.radio;

import stream.radio.Player;
     
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.Media.MediaView;
     
import java.io.IOException;
import java.util.Objects;


class Controller {
     @FXML 
     Button button = new Button();
     @FXML
     ImageView imageView = new ImageView();
     @FXML
     MediaView mediaView = new MediaView();
     
     @FXML
     public void Stream(ActionEvent actionEvent) throws IOException {
          
          Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
          window.setScene(root);

          window.show();
     } 

}

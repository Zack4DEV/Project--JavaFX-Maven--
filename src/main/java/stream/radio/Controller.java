package stream.radio;

import stream.radio.Player;
     
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;

class Controller {
     @FXML 
     Button button = new Button();
     @FXML
     ImageView imageView = new ImageView();
     @FXML
     MediaView mediaView = new MediaView();
           
     public static void main(String[] args){
     Player.main(args);
     } 
}

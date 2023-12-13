package stream.radio;

import stream.radio.Data; 
     
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Player {

     
     @FXML
     private Button play = new Button();
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer(new Media());
     @FXML
     private MediaView mediaView = new MediaView(mediaPlayer); 
  
         
    public void play(){
    play.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent ae){
          mediaPlayer.play();
          }
     });
     }

     
}

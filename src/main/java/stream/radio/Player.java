package stream.radio;

import stream.radio.Stream;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaException;
import java.io.File;

class Player {

     
     File mediaURL = new File(Stream.toURL());
     @FXML
     private Media media = new Media(mediaURL.toString());     
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     @FXML
     private MediaView mediaView = new MediaView(mediaPlayer); 

     @Override
     public void setPlay(Media media){
     mediaPlayer.play();
     }
     
     public static void main(String[] args){
     Player player = new Player();
  }
}

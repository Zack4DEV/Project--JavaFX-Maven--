package stream.radio;

import stream.radio.Stream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

class Player {

  
     private File mediaURL = new File(streamURL);
     private Media media = new Media(mediaURL.toString());     
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     private MediaView mediaView = new MediaView(mediaPlayer); 

      public static void main(String[] args) throws IOException {
      try{
      Scene scene = new Scene(new AnchorPane(mediaView), 173, 163);
      Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

      stage.setScene(scene);
      stage.show();
  
      mediaPlayer.play();
      }catch(IOException e){
      System.err.println(e);      
      }
      
}

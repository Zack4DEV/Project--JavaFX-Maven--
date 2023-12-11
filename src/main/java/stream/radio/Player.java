package stream.radio;

import stream.radio.Stream;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaException;
import java.io.File;

class Player {

  
     public static void main(String[] args) throws MediaException {
     
     private File mediaURL = new File(streamURL);
     private Media media = new Media(mediaURL.toString());     
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     private MediaView mediaView = new MediaView(mediaPlayer); 
     
      try{ 
     
        mediaPlayer.play();
      
      } catch(IOException e){
      
        System.err.println(e);      
      }
      
  }
}

package stream.radio;

import stream.radio.Stream;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaException;
import java.io.File;

class Player {


     public File mediaURL = new File(Stream.toURL(StreamURL));
     private Media media = new Media(mediaURL.toString());     
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     private MediaView mediaView = new MediaView(mediaPlayer); 
     
     Media play = (Media) mediaPlayer.play();
     
     public static void main(String[] args) throws MediaException {
     Player player = new Player();
  }
}

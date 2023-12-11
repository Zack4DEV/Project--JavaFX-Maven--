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
import java.net.MalformedURLException;

class Player throws MalformedURLException {

  
     private File mediaURL = new File(streamURL);
     private Media media = new Media(mediaURL.toString());     
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     private MediaView mediaView = new MediaView(mediaPlayer); 

    
     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
     Scene scene = new Scene(new AnchorPane(mediaView), 173, 163);

     stage.setScene(scene);
     stage.show();
  
     mediaPlayer.play();  
}

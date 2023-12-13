package stream.radio;

import stream.radio.Stream;

import javafx.application.Application;
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
import java.net.URL;
import java.net.MalformedURLException;

import java.io.File;

class Player {

     
     var mediaString = Stream::streamMedia;
     
     URL url = (URL) mediaString.toUri().toString();
     URL mediaURL = new URL(url);
     
     @FXML
     Button play = new Button(mediaString);
     @FXML
     private Media media = new Media(mediaURL);     
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     @FXML
     private MediaView mediaView = new MediaView(mediaPlayer); 

     public void setPlay(){
     play.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent ae){
          mediaPlayer.play();
          }
     });
     }
     
}

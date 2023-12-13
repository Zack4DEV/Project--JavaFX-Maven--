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


import java.io.File;

class Player {

     
     File mediaURI = new File(stream.radio.Stream.streamList());
     @FXML
     Button play = new Button(stream.radio.Stream.streamList());
     @FXML
     private Media media = new Media(mediaURI.toURI().toString());     
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     @FXML
     private MediaView mediaView = new MediaView(mediaPlayer); 

     @Override
     public void setPlay(){
     play.setOnAction(new EventHandler<ActionEvent<>>(){
          @Override
          public void handle(ActionEvent<MouseEvent> ae){
          mediaPlayer.play();
          }
     });
     }
     
     public static void main(String[] args){
     Player player = new Player();
  }
}

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

     private final Hyperlink links;
     
     @FXML
     private Button play = new Button();
     @FXML
     private Media media = new Media();     
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer();
     @FXML
     private MediaView mediaView = new MediaView(); 
  
     interface Links< L extends Data.Links>{ 

     public Media setMediaLinks(Media media,Hyperlink links) throws MediaException {
     
          Media mediaLinks = (Media)  media.setUrl(links);
          System.out.println( +(media) "Playing");
     }

     public void getMediaLinks(Hyperlink links){

          return links;
     }

}

    public class Play implements Links {

    public void getPlay(){

    }
         
    public void setPlay(){
    play.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent ae){
          mediaPlayer.play();
          }
     });
     }

}
     
}

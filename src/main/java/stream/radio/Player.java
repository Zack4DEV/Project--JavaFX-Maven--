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
     private Media media = new Media(Player.Links.getMediaLinks());     
     @FXML
     private MediaPlayer mediaPlayer = new MediaPlayer(media);
     @FXML
     private MediaView mediaView = new MediaView(mediaPlayer); 
  
     interface Links { 

          /**
     public void setMediaLinks(Media media,Hyperlink links) throws MediaException {
     
          Media mediaLinks = (Media)  media.set(links);
          System.out.println( +(media) "Playing");
     }

     public void getMediaLinks(Hyperlink links){
          Media links = new stream.radio.Data.Links();
          return links;
     }

}

    abstract class Play {

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
          */

}
     
}

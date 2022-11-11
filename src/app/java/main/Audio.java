package replit.Controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventAdapter;

public class Audio implements Initializable{

    MediaPlayer mediaPlayer = new MediaPlayerFactory().mediaPlayers().newMediaPlayer();

    public void initialize(URL location, ResourceBundle rb) {

    mediaPlayer.events().addMediaPlayerEventListener(new MediaPlayerEventAdapter(){
        @Override
        public void mediaPlayerReady(MediaPlayer mediaPlayer){
        mediaPlayer.controls().setTime(10000);
        }
    });

   }
}


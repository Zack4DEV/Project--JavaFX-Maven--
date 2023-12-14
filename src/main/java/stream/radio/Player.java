package stream.radio;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.Exception;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Hyperlink;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.util.*;
import java.net.*;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.MalformedURLException;



abstract class Player {

    private final Hyperlink hl = new Hyperlink("");
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;

    String hlString = (String) hl.toString();
    
    public void play() throws Exception {

        try {
        media = new Media(hlString);
        if (media.getError() == null) {
            media.setOnError(new Runnable() {
                public void run() {
                }
            });
            try {
                mediaPlayer = new MediaPlayer( new Media(hlString) );
                if (mediaPlayer.getError() == null) {
                    mediaPlayer.setOnError(new Runnable() {
                        public void run() {
                        }
                    });
                    mediaView = new MediaView(mediaPlayer);
                    mediaView.setOnError(new EventHandler<MediaErrorEvent>() {
                        public void handle(MediaErrorEvent t) {
                        }
                    });
                } else {
                }
            } catch (Exception mediaPlayerException) {
            }
        } else {
        }
    } catch (Exception Exception) {
    }
        
    }
    
        interface Players {
        
        public void mfmPlay() throws MalformedURLException{
        final Hyperlink hlmfm = new Hyperlink("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        String hlStringmfm = (String) hlmfm.toString();
        MediaPlayer mfmPlayer = new MediaPlayer( new Media(hlStringmfm) );
        mfmPlayer.play();
        }

        public void aswatPlay() throws MalformedURLException{
        final Hyperlink hlaswat = new Hyperlink("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        String hlStringaswat = (String) hlaswat.toString();
        MediaPlayer aswatPlayer = new MediaPlayer( new Media(hlStringaswat) );
        aswatPlayer.play();
        }

        public void chadaPlay() throws MalformedURLException{
        final Hyperlink hlchada = new Hyperlink("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        String hlStringchada = (String) hlchada.toString();
        MediaPlayer chadaPlayer = new MediaPlayer( new Media(hlStringchada) );
        chadaPlayer.play();
        }

        public void marsPlay() throws MalformedURLException{
        final Hyperlink hlmars = new Hyperlink("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        String hlStringmars = (String) hlmars.toString();
        MediaPlayer marsPlayer = new MediaPlayer( new Media(hlStringmars) );
        marsPlayer.play();        
        }
        
        public void medradioPlay() throws MalformedURLException{
        final Hyperlink hlmedradio = new Hyperlink("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        String hlStringmedradio = (String) hlmedradio.toString();
        MediaPlayer medradioPlayer = new MediaPlayer( new Media(hlStringmedradio) );
        medradioPlayer.play();
        }

        public void taniaPlay() throws MalformedURLException{
        final Hyperlink hltania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        String hlStringtania = (String) hltania.toString();
        MediaPlayer taniaPlayer = new MediaPlayer( new Media(hlStringtania) );
        taniaPlayer.play();
        }

        public void atlanticPlay() throws MalformedURLException{
        final Hyperlink hlatlantic = new Hyperlink("http://atlanticradio.ma:8000/stream/1");
        String hlStringatlantic = (String) hlatlantic.toString();
        MediaPlayer atlanticPlayer = new MediaPlayer( new Media(hlStringatlantic) );
        atlanticPlayer.play();
        }

        public void yabiladiPlay() throws MalformedURLException{
        final Hyperlink hlyabiladi = new Hyperlink("http://snassen.yabiladi.com:8000/stream/1");
        String hlStringyabiladi = (String) hlyabiladi.toString();
        MediaPlayer yabiladiPlayer = new MediaPlayer( new Media(hlStringyabiladi) );
        yabiladiPlayer.play();
        }

        public void mediPlay() throws MalformedURLException{
        final Hyperlink hlmedi = new Hyperlink("http://51.222.88.199:80/medi1");
        String hlStringmedi = (String) hlmedi.toString();
        MediaPlayer mediPlayer = new MediaPlayer( new Media(hlStringmedi) );
        mediPlayer.play();       
         }

        public void nessPlay() throws MalformedURLException{
        final Hyperlink hlness = new Hyperlink("http://radio.nessradio.net:8000/nessradio.mp3");
        String hlStringness = (String) hlness.toString();
        MediaPlayer nessPlayer = new MediaPlayer( new Media(hlStringness) );
        nessPlayer.play();
        }

        public void hitradioPlay() throws MalformedURLException{
        final Hyperlink hlhitradio = new Hyperlink("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        String hlStringhitradio = (String) hlhitradio.toString();
        MediaPlayer hitradioPlayer = new MediaPlayer( new Media(hlStringhitradio) );
        hitradioPlayer.play();
        }

        public void hitmarocPlay() throws MalformedURLException{
        final Hyperlink hlhitmaroc = new Hyperlink("http://api.webrad.io/data/hls/68/hits1-maroc");
        String hlStringhitmaroc = (String) hlhitmaroc.toString();
        MediaPlayer hitmarocPlayer = new MediaPlayer( new Media(hlStringhitmaroc) );
        hitmarocPlayer.play();
        }
        public void tarabPlay() throws MalformedURLException{
        final Hyperlink hltarab = new Hyperlink("http://streaming2.rimradio.ma/livetarab");
        String hlStringtarab = (String) hltarab.toString();
        MediaPlayer tarabPlayer = new MediaPlayer( new Media(hlStringtarab) );
        tarabPlayer.play();        
        }

        public void wataniaPlay() throws MalformedURLException{
        final Hyperlink hlwatania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        String hlStringwatania = (String) hlwatania.toString();
        MediaPlayer wataniaPlayer = new MediaPlayer( new Media(hlStringwatania) );
        wataniaPlayer.play();
        }

        public void moroccoenglishPlay() throws MalformedURLException{
        final Hyperlink hlmoroccoenglish = new Hyperlink("http://streamer.radio.co/s6cba51492/listen");
        String hlStringmoroccoenglish = (String) hlmoroccoenglish.toString();
        MediaPlayer moroccoenglishPlayer = new MediaPlayer( new Media(hlStringmoroccoenglish) );
        moroccoenglishPlayer.play();        
        }

        public void tamazghaPlay() throws MalformedURLException{
        final Hyperlink hltamazgha = new Hyperlink("http://streaming2.rimradio.ma/liveamazighe");
        String hlStringtamazgha = (String) hltamazgha.toString();
        MediaPlayer tamazghaPlayer = new MediaPlayer( new Media(hlStringtamazgha) );
        tamazghaPlayer.play();
        }

        public void izlanPlay() throws MalformedURLException{
        final Hyperlink hlizlan = new Hyperlink("http://izlan.fr/radios/atlas/stream");
        String hlStringizlan = (String) hlizlan.toString();
        MediaPlayer izlanPlayer = new MediaPlayer( new Media(hlStringizlan) );
        izlanPlayer.play();        
        }

        public void coranPlay() throws MalformedURLException{
        final Hyperlink hlcoran = new Hyperlink("http://dedi.radio-coran.net:8000/livehq.mp3");
        String hlStringcoran = (String) hlcoran.toString();
        MediaPlayer coranPlayer = new MediaPlayer( new Media(hlStringcoran) );
        coranPlayer.play();        
        }
        
        public void montecarloPlay() throws MalformedURLException{
        final Hyperlink hlmontecarlo = new Hyperlink("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        String hlStringmontecarlo = (String) hlmontecarlo.toString();
        MediaPlayer montecarloPlayer = new MediaPlayer( new Media(hlStringmontecarlo) );
        montecarloPlayer.play();
        }

        public void aljazeeraPlay() throws MalformedURLException{
        final Hyperlink hlaljazeera = new Hyperlink("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        String hlStringaljazeera = (String) hlaljazeera.toString();
        MediaPlayer aljazeeraPlayer = new MediaPlayer( new Media(hlStringaljazeera) );
        aljazeeraPlayer.play();
        }

        public void skynewsarabiaPlay() throws MalformedURLException{
        final Hyperlink hlskynewsarabia = new Hyperlink("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        String hlStringskynewsarabia = (String) hlskynewsarabia.toString();
        MediaPlayer skynewsarabiaPlayer = new MediaPlayer( new Media(hlStringskynewsarabia) );
        skynewsarabiaPlayer.play();
        }

        public void bbcarabicPlay() throws MalformedURLException{
        final Hyperlink hlbbcarabic = new Hyperlink("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        String hlStringbbcarabic = (String) hlbbcarabic.toString();
        MediaPlayer bbcarabicPlayer = new MediaPlayer( new Media(hlStringbbcarabic) );
        bbcarabicPlayer.play();
        }
    
    }


    public class Action {

    @FXML
    private Button button = new Button("");
  
    private final Hyperlink hl = new Hyperlink("");
    String hlString = (String) hl.toString();

    
    public void action() throws Exception{
    button.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent e){
          }
     });
     }


   class ActionPlayers implements Players{

    Players players = Players.class.getResource();

    @FXML
    private Button btnmfm = new Button("mfm");
    @FXML
    private Button btnaswat = new Button("aswat");
    @FXML
    private Button btnchada = new Button("chada");
    @FXML
    private Button btnmars = new Button("mars");
    @FXML
    private Button btnmedradio = new Button("med radio");
    @FXML
    private Button btntania = new Button("2m");
    @FXML
    private Button btnatlantic = new Button("atlantic");
    @FXML
    private Button btnyabiladi = new Button("yabiladi");
    @FXML
    private Button btnmedi = new Button("medi1");
    @FXML
    private Button btnness = new Button("ness");
    @FXML
    private Button btnhitradio = new Button("hitradio");
    @FXML
    private Button btnhitmaroc = new Button("hit maroc");
    @FXML
    private Button btntarab = new Button("tarab");
    @FXML
    private Button btnwatania = new Button("watania");
    @FXML
    private Button btnmoroccoenglish = new Button("morocco english");  
    @FXML
    private Button btntamazgha = new Button("tamazgha");
    @FXML
    private Button btnizlan = new Button("izlan");
    @FXML
    private Button btncoran = new Button("coran");
    @FXML
    private Button btnmontecarlo = new Button("montecarlo"); 
    @FXML
    private Button btnaljazeera = new Button("aljazeera");
    @FXML
    private Button btnskynewsarabia = new Button("skynewsarabia");
    @FXML
    private Button btnbbcarabic = new Button("bbcarabic");   

     public void mfmAction() throws Exception{
     btnmfm.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emfm){
               players.mfmPlayer.play();
          }
     });          
     }

     public void aswatAction() throws Exception{
     btnaswat.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent easwat){
               players.aswatPlayer.play();
          }
     });          
     }

     public void chadaAction() throws Exception{
     btnchada.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent echada){
               players.chadaPlayer.play();
          }
     });          
     }

     public void marsAction() throws Exception{
     btnmars.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emars){
               players.marsPlayer.play();
          }
     });          
     }

     public void medradioAction() throws Exception{
     btnmedradio.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emedradio){
               players.medradioPlayer.play();
          }
     });          
     }

     public void taniaAction() throws Exception{
     btntania.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent etania){
               players.taniaPlayer.play();
          }
     });          
     }

     public void atlanticAction() throws Exception{
     btnatlantic.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent eatlantic){
               players.atlanticPlayer.play();
          }
     });          
     }

     public void yabiladiAction() throws Exception{
     btnyabiladi.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent eyabiladi){
               players.yabiladiPlayer.play();
          }
     });          
     }

     public void mediAction() throws Exception{
     btnmedi.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emedi){
               players.mediPlayer.play();
          }
     });          
     }

     public void nessAction() throws Exception{
     btnness.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent eness){
               players.nessPlayer.play();
          }
     });          
     }

     public void hitradioAction() throws Exception{
     btnhitradio.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ehitradio){
               players.hitradioPlayer.play();
          }
     });          
     }

     public void hitmarocAction() throws Exception{
     btnhitmaroc.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ehitmaroc){
               players.hitmarocPlayer.play();
          }
     });          
     }

     public void tarabAction() throws Exception{
     btntarab.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent etarab){
               players.tarabPlayer.play();
          }
     });          
     }

     public void wataniaAction() throws Exception{
     btnwatania.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ewatania){
               players.wataniaPlayer.play();
          }
     });          
     }

     public void moroccoenglishAction() throws Exception{
     btnmoroccoenglish.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emoroccoenglish){
               players.moroccoenglishPlayer.play();
          }
     });          
     }

     public void tamazghaAction() throws Exception{
     btntamazgha.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent etamazgha){
               players.tamazghaPlayer.play();
          }
     });          
     }

     public void izlanAction() throws Exception{
     btnizlan.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent eizlan){
               players.izlanPlayer.play();
          }
     });          
     }


     public void coranAction() throws Exception{
     btncoran.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ecoran){
               players.coranPlayer.play();
          }
     });          
     }

     public void montecarloAction() throws Exception{
     btnmontecarlo.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent emontecarlo){
               players.montecarloPlayer.play();
          }
     });          
     }

     public void aljazeeraAction() throws Exception{
     btnaljazeera.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ealjazeera){
               players.aljazeeraPlayer.play();
          }
     });          
     }

     public void skynewsarabiaAction() throws Exception{
     btnskynewsarabia.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent eskynewsarabia){
               players.skynewsarabiaPlayer.play();
          }
     });          
     }

     public void bbcarabicAction() throws Exception{
     btnbbcarabic.setOnAction(new EventHandler<>(){
          @Override
          public void handle(MouseEvent ebbcarabic){
               players.bbcarabicPlayer.play();
          }
     });          
     }
                   
     }
     
}
    

}

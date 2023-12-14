package stream.radio;

import stream.radio.Action;

import javafx.fxml.FXML;
import javafx.net.Hyperlink;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.event.EventHandler;
import java.util.*;

abstract class Player {

    private final Hyperlink hl;
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;

    public void play() throws MediaException {

        try {
        media = new Media(hl.toString());
        if (media.getError() == null) {
            media.setOnError(new Runnable() {
                public void run() {
                    // Handle asynchronous error in Media object.
                }
            });
            try {
                mediaPlayer = new MediaPlayer(media);
                if (mediaPlayer.getError() == null) {
                    mediaPlayer.setOnError(new Runnable() {
                        public void run() {
                            // Handle asynchronous error in MediaPlayer object.
                        }
                    });
                    mediaView = new MediaView(mediaPlayer);
                    mediaView.setOnError(new EventHandler<MediaErrorEvent>() {
                        public void handle(MediaErrorEvent t) {
                            // Handle asynchronous error in MediaView.
                        }
                    });
                } else {
                    // Handle synchronous error creating MediaPlayer.
                }
            } catch (Exception mediaPlayerException) {
                // Handle exception in MediaPlayer constructor.
            }
        } else {
            // Handle synchronous error creating Media.
        }
    } catch (MediaException mediaException) {
        // Handle exception in Media constructor.
    }
        
    }
    
        public class hyperLinks {
        
        public void mfmPlay(){
        Hyperlink hlmfm = new Hyperlink("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        mfmPlayer = new MediaPlayer(new Media(hlmfm).toString());
        mfmPlayer.play();
        }

        public void aswatPlay(){
        Hyperlink hlaswat = new Hyperlink("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        aswatPlayer = new MediaPlayer(new Media(hlaswat.toString()));
        aswatPlayer.play();
        }

        public void chadaPlay(){
        Hyperlink hlchada = new Hyperlink("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        chadaPlayer = new MediaPlayer(new Media(hlchada.toString()));
        chadaPlayer.play();
        }

        public void marsPlay(){
        Hyperlink hlmars = new Hyperlink("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        marsPlayer = new MediaPlayer(new Media(hlmars.toString()));
        marsPlayer.play();
        }
         public void medradioPlay(){
        Hyperlink hlmedradio = new Hyperlink("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        medradioPlayer = new MediaPlayer(new Media(hlmedradio.toString()));
        medradioPlayer.play();
        }

        public void taniaPlay(){
        Hyperlink hltania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        taniaPlayer = new MediaPlayer(new Media(hltania.toString()));
        taniaPlayer.play();
        }

        public void atlanticPlay(){
        Hyperlink hlatlantic = new Hyperlink("http://atlanticradio.ma:8000/stream/1");
        atlanticPlayer = new MediaPlayer(new Media(hlatlantic.toString()));
        atlanticPlayer.play();
        }

        public void yabiladiPlay(){
        Hyperlink hlyabiladi = new Hyperlink("http://snassen.yabiladi.com:8000/stream/1");
        yabilaladidiPlayer = new MediaPlayer(new Media(hlyabiladi.toString()));
        yabiPlayer.play();
        }

         public void mediPlay(){
        Hyperlink hlmedi = new Hyperlink("http://51.222.88.199:80/medi1");
        mediPlayer = new MediaPlayer(new Media(hlmedi.toString()));
        mediPlayer.play();
        }

        public void nessPlay(){
        Hyperlink hlness = new Hyperlink("http://radio.nessradio.net:8000/nessradio.mp3");
        nessPlayer = new MediaPlayer(new Media(hlness.toString()));
        nessPlayer.play();
        }

        public void hitradioPlay(){
        Hyperlink hlhitradio = new Hyperlink("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        hitradioPlayer = new MediaPlayer(new Media(hlhitradio.toString()));
        hitradioPlayer.play();
        }

        public void hitmarocPlay(){
        Hyperlink hlhitmaroc = new Hyperlink("http://api.webrad.io/data/hls/68/hits1-maroc");
        hitmarocPlayer = new MediaPlayer(new Media(hlhitmaroc.toString()));
        hitmarocPlayer.play();
        }
        public void tarabPlay(){
        Hyperlink hltarab = new Hyperlink("http://streaming2.rimradio.ma/livetarab");
        tarabPlayer = new MediaPlayer(new Media(hltarab.toString()));
        tarabPlayer.play();
        }

        public void wataniaPlay(){
        Hyperlink hlwatania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        wataniaPlayer = new MediaPlayer(new Media(hlwatania.toString()));
        wataniaPlayer.play();
        }

        public void moroccoenglishPlay(){
        Hyperlink hlmoroccoenglish = new Hyperlink("http://streamer.radio.co/s6cba51492/listen");
        moroccoenglishPlayer = new MediaPlayer(new Media(hlmoroccoenglish.toString()));
        moroccoenglishPlayer.play();
        }

        public void tamazghaPlay(){
        Hyperlink hltamazgha = new Hyperlink("http://streaming2.rimradio.ma/liveamazighe");
        tamazghaPlayer = new MediaPlayer(new Media(hltamazgha.toString()));
        tamazghaPlayer.play();
        }

        public void izlanPlay(){
        Hyperlink hlizlan = new Hyperlink("http://izlan.fr/radios/atlas/stream");
        izlanPlayer = new MediaPlayer(new Media(hlizlan.toString()));
        izlanPlayer.play();
        }

        public void coranPlay(){
        Hyperlink hlcoran = new Hyperlink("http://dedi.radio-coran.net:8000/livehq.mp3");
        coranPlayer = new MediaPlayer(new Media(hlcoran.toString()));
        coranPlayer.play();
        }
        
        public void montecarloPlay(){
        Hyperlink hlmontecarlo = new Hyperlink("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        montecarloPlayer = new MediaPlayer(new Media(hlmontecarlo.toString()));
        montecarloPlayer.play();
        }

        public void aljazeeraPlay(Hyperlink hlaljazeera){
        Hyperlink hlaljazeera = new Hyperlink("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        aljazeeraPlayer = new MediaPlayer(new Media(hlaljazeera.toString()));
        aljazeeraPlayer.play();
        }

        public void skybewsarabiaPlay(){
        Hyperlink hlskybewsarabia = new Hyperlink("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        skybewsarabiaPlayer = new MediaPlayer(new Media(hlskybewsarabia.toString()));
        skybewsarabiaPlayer.play();
        }

        public void bbcarabicPlay(){
        Hyperlink hlbbcarabic = new Hyperlink("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        bbcarabicPlayer = new MediaPlayer(new Media(hlbbcarabic.toString()));
        bbcarabicPlayer.play();
        }
    
    }

}

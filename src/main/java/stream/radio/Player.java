package stream.radio;

import stream.radio.Action;

import javafx.fxml.FXML;
import javafx.scene.media.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.event.EventHandler;
import java.util.*;
import java.net.*;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import javafx.scene.control.Hyperlink;


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
    } catch (Exception mediaException) {
    }
        
    }
    
        public class URLs {
        
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

}

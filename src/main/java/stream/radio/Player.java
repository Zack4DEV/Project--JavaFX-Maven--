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
//import javafx.scene.control.Hyperlink;


abstract class Player {

    private final URL hl;
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;

    String hlString = (String) hl.toURI().toString();
    
    public void play() throws Exception {

        try {
        media = new Media(hlString);
        if (media.getError() == null) {
            media.setOnError(new Runnable() {
                public void run() {
                }
            });
            try {
                mediaPlayer = new MediaPlayer(hlString);
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
        
        public void mfmPlay(){
        URL hlmfm = new URL("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        String hlStringmfm = (String) hlmfm.toURI().toString();
        MediaPlayer mfmPlayer = new MediaPlayer(hlStringmfm);
        mfmPlayer.play();
        }

        public void aswatPlay(){
        URL hlaswat = new URL("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        String hlStringaswat = (String) hlaswat.toURI().toString();
        MediaPlayer aswatPlayer = new MediaPlayer(hlStringaswat);
        aswatPlayer.play();
        }

        public void chadaPlay(){
        URL hlchada = new URL("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        String hlStringchada = (String) hlchada.toURI().toString();
        MediaPlayer chadaPlayer = new MediaPlayer(hlStringchada);
        chadaPlayer.play();
        }

        public void marsPlay(){
        URL hlmars = new URL("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        String hlStringmars = (String) hlmars.toURI().toString();
        MediaPlayer marsPlayer = new MediaPlayer(hlStringmars);
        marsPlayer.play();        
        }
        
        public void medradioPlay(){
        URL hlmedradio = new URL("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        String hlStringmedradio = (String) hlmedradio.toURI().toString();
        MediaPlayer medradioPlayer = new MediaPlayer(hlStringmedradio);
        medradioPlayer.play();
        }

        public void taniaPlay(){
        URL hltania = new URL("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        String hlStringtania = (String) hltania.toURI().toString();
        MediaPlayer taniaPlayer = new MediaPlayer(hlStringtania);
        taniaPlayer.play();
        }

        public void atlanticPlay(){
        URL hlatlantic = new URL("http://atlanticradio.ma:8000/stream/1");
        String hlStringatlantic = (String) hlatlantic.toURI().toString();
        MediaPlayer atlanticPlayer = new MediaPlayer(hlStringatlantic);
        atlanticPlayer.play();
        }

        public void yabiladiPlay(){
        URL hlyabiladi = new URL("http://snassen.yabiladi.com:8000/stream/1");
        String hlStringyabiladi = (String) hlyabiladi.toURI().toString();
        MediaPlayer yabilaladidiPlayer = new MediaPlayer(hlStringyabiladi);
        yabiladiPlayer.play();
        }

        public void mediPlay(){
        URL hlmedi = new URL("http://51.222.88.199:80/medi1");
        String hlStringmedi = (String) hlmedi.toURI().toString();
        MediaPlayer mediPlayer = new MediaPlayer(hlStringmedi);
        mediPlayer.play();       
         }

        public void nessPlay(){
        URL hlness = new URL("http://radio.nessradio.net:8000/nessradio.mp3");
        String hlStringness = (String) hlness.toURI().toString();
        MediaPlayer nessPlayer = new MediaPlayer(hlStringness);
        nessPlayer.play();
        }

        public void hitradioPlay(){
        URL hlhitradio = new URL("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        String hlStringhitradio = (String) hlhitradio.toURI().toString();
        MediaPlayer hitradioPlayer = new MediaPlayer(hlStringhitradio);
        hitradioPlayer.play();
        }

        public void hitmarocPlay(){
        URL hlhitmaroc = new URL("http://api.webrad.io/data/hls/68/hits1-maroc");
        String hlStringhitmaroc = (String) hlhitmaroc.toURI().toString();
        MediaPlayer hitmarocPlayer = new MediaPlayer(hlStringhitmaroc);
        hitmarocPlayer.play();
        }
        public void tarabPlay(){
        URL hltarab = new URL("http://streaming2.rimradio.ma/livetarab");
        String hlStringness = (String) hlness.toURI().toString();
        MediaPlayer tarabPlayer = new MediaPlayer(hlStringness);
        nessPlayer.play();        
        }

        public void wataniaPlay(){
        URL hlwatania = new URL("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        String hlStringwatania = (String) hlwatania.toURI().toString();
        MediaPlayer wataniaPlayer = new MediaPlayer(hlStringwatania);
        wataniaPlayer.play();
        }

        public void moroccoenglishPlay(){
        URL hlmoroccoenglish = new URL("http://streamer.radio.co/s6cba51492/listen");
        String hlStringmoroccoenglish = (String) hlmoroccoenglish.toURI().toString();
        MediaPlayer moroccoenglishPlayer = new MediaPlayer(hlStringmoroccoenglish);
        moroccoenglishPlayer.play();        
        }

        public void tamazghaPlay(){
        URL hltamazgha = new URL("http://streaming2.rimradio.ma/liveamazighe");
        String hlStringtamazgha = (String) hltamazgha.toURI().toString();
        MediaPlayer tamazghaPlayer = new MediaPlayer(hlStringtamazgha);
        tamazghaPlayer.play();
        }

        public void izlanPlay(){
        URL hlizlan = new URL("http://izlan.fr/radios/atlas/stream");
        String hlStringizlan = (String) hlizlan.toURI().toString();
        MediaPlayer izlanPlayer = new MediaPlayer(hlStringizlan);
        izlanPlayer.play();        
        }

        public void coranPlay(){
        URL hlcoran = new URL("http://dedi.radio-coran.net:8000/livehq.mp3");
        String hlStringcoran = (String) hlcoran.toURI().toString();
        MediaPlayer coranPlayer = new MediaPlayer(hlStringcoran);
        coranPlayer.play();        
        }
        
        public void montecarloPlay(){
        URL hlmontecarlo = new URL("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        String hlStringmontecarlo = (String) hlmontecarlo.toURI().toString();
        MediaPlayer montecarloPlayer = new MediaPlayer(hlStringmontecarlo);
        montecarloPlayer.play();
        }

        public void aljazeeraPlay(){
        URL hlaljazeera = new URL("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        String hlStringaljazeera = (String) hlaljazeera.toURI().toString();
        MediaPlayer aljazeeraPlayer = new MediaPlayer(hlStringaljazeera);
        aljazeeraPlayer.play();
        }

        public void skynewsarabiaPlay(){
        URL hlskynewsarabia = new URL("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        String hlStringskynewsarabia = (String) hlskynewsarabia.toURI().toString();
        MediaPlayer skynewsarabiaPlayer = new MediaPlayer(hlStringskynewsarabia);
        skynewsarabiaPlayer.play();
        }

        public void bbcarabicPlay(){
        URL hlbbcarabic = new URL("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        String hlStringbbcarabic = (String) hlbbcarabic.toURI().toString();
        MediaPlayer bbcarabicPlayer = new MediaPlayer(hlStringbbcarabic);
        bbcarabicPlayer.play();
        }
    
    }

}

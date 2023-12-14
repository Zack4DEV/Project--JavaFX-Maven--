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
                mediaPlayer = new MediaPlayer(String);
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
        MediaPlayer mfmPlayer;
        String hlStringmfm = (String) hlmfm.toURI().toString();
        mfmPlayer.play(hlStringmfm);
        }

        public void aswatPlay(){
        URL hlaswat = new URL("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        MediaPlayer aswatPlayer;
        String hlStringaswat = (String) hlaswat.toURI().toString();
        aswatPlayer.play(hlStringaswat);
        }

        public void chadaPlay(){
        URL hlchada = new URL("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        MediaPlayer chadaPlayer;
        String hlStringchada = (String) hlchada.toURI().toString();
        chadaPlayer.play(hlStringchada);
        }

        public void marsPlay(){
        URL hlmars = new URL("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        MediaPlayer marsPlayer;
        String hlStringmars = (String) hlmars.toURI().toString();
        marsPlayer.play(hlStringmars);        
        }
        
        public void medradioPlay(){
        URL hlmedradio = new URL("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        MediaPlayer medradioPlayer;
        String hlStringmedradio = (String) hlmedradio.toURI().toString();
        medradioPlayer.play(hlStringmedradio);
        }

        public void taniaPlay(){
        URL hltania = new URL("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        MediaPlayer taniaPlayer;
        String hlStringtania = (String) hltania.toURI().toString();
        taniaPlayer.play(hlStringtania);
        }

        public void atlanticPlay(){
        URL hlatlantic = new URL("http://atlanticradio.ma:8000/stream/1");
        MediaPlayer atlanticPlayer;
        String hlStringatlantic = (String) hlatlantic.toURI().toString();
        atlanticPlayer.play(hlStringatlantic);
        }

        public void yabiladiPlay(){
        URL hlyabiladi = new URL("http://snassen.yabiladi.com:8000/stream/1");
        MediaPlayer yabilaladidiPlayer;
        String hlStringyabiladi = (String) hlyabiladi.toURI().toString();
        yabiladiPlayer.play(hlStringyabiladi);
        }

        public void mediPlay(){
        URL hlmedi = new URL("http://51.222.88.199:80/medi1");
        MediaPlayer mediPlayer;
        String hlStringmedi = (String) hlmedi.toURI().toString();
        mediPlayer.play(hlStringmedi);       
         }

        public void nessPlay(){
        URL hlness = new URL("http://radio.nessradio.net:8000/nessradio.mp3");
        MediaPlayer nessPlayer;
        String hlStringness = (String) hlness.toURI().toString();
        nessPlayer.play(hlStringness);
        }

        public void hitradioPlay(){
        URL hlhitradio = new URL("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        MediaPlayer hitradioPlayer;
        String hlStringhitradio = (String) hlhitradio.toURI().toString();
        hitradioPlayer.play(hlStringhitradio);
        }

        public void hitmarocPlay(){
        URL hlhitmaroc = new URL("http://api.webrad.io/data/hls/68/hits1-maroc");
        MediaPlayer hitmarocPlayer;
        String hlStringhitmaroc = (String) hlhitmaroc.toURI().toString();
        hitmarocPlayer.play(hlStringhitmaroc);
        }
        public void tarabPlay(){
        URL hltarab = new URL("http://streaming2.rimradio.ma/livetarab");
        MediaPlayer tarabPlayer;
        String hlStringness = (String) hlness.toURI().toString();
        nessPlayer.play(hlStringness);        
        }

        public void wataniaPlay(){
        URL hlwatania = new URL("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        MediaPlayer wataniaPlayer;
        String hlStringwatania = (String) hlwatania.toURI().toString();
        wataniaPlayer.play(hlStringwatania);
        }

        public void moroccoenglishPlay(){
        URL hlmoroccoenglish = new URL("http://streamer.radio.co/s6cba51492/listen");
        MediaPlayer moroccoenglishPlayer;
        String hlStringmoroccoenglish = (String) hlmoroccoenglish.toURI().toString();
        moroccoenglishPlayer.play(hlStringmoroccoenglish);        
        }

        public void tamazghaPlay(){
        URL hltamazgha = new URL("http://streaming2.rimradio.ma/liveamazighe");
        MediaPlayer tamazghaPlayer;
        String hlStringtamazgha = (String) hltamazgha.toURI().toString();
        tamazghaPlayer.play(hlStringtamazgha);
        }

        public void izlanPlay(){
        URL hlizlan = new URL("http://izlan.fr/radios/atlas/stream");
        MediaPlayer izlanPlayer;
        String hlStringizlan = (String) hlizlan.toURI().toString();
        izlanPlayer.play(hlStringizlan);        
        }

        public void coranPlay(){
        URL hlcoran = new URL("http://dedi.radio-coran.net:8000/livehq.mp3");
        MediaPlayer coranPlayer;
        String hlStringcoran = (String) hlcoran.toURI().toString();
        coranPlayer.play(hlStringcoran);        
        }
        
        public void montecarloPlay(){
        URL hlmontecarlo = new URL("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        MediaPlayer montecarloPlayer;
        String hlStringmontecarlo = (String) hlmontecarlo.toURI().toString();
        montecarloPlayer.play(hlStringmontecarlo);
        }

        public void aljazeeraPlay(URL hlaljazeera){
        URL hlaljazeera = new URL("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        MediaPlayer aljazeeraPlayer;
        String hlStringaljazeera = (String) hlaljazeera.toURI().toString();
        aljazeeraPlayer.play(hlStringaljazeera);
        }

        public void skynewsarabiaPlay(){
        URL hlskynewsarabia = new URL("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        MediaPlayer skynewsarabiaPlayer;
        String hlStringskynewsarabia = (String) hlskynewsarabia.toURI().toString();
        skynewsarabiaPlayer.play(hlStringskynewsarabia);
        }

        public void bbcarabicPlay(){
        URL hlbbcarabic = new URL("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        MediaPlayer bbcarabicPlayer;
        String hlStringbbcarabic = (String) hlbbcarabic.toURI().toString();
        bbcarabicPlayer.play(hlStringbbcarabic);
        }
    
    }

}

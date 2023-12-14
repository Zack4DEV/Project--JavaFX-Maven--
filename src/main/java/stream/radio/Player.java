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
import java.net.URI;
import javafx.scene.control.Hyperlink;


abstract class Player {

    private final Hyperlink hl;
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;

    String hlString = (String) hl.toUri().toString();
    
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
    
        public class hyperLinks {
        
        public void mfmPlay(){
        Hyperlink hlmfm = new Hyperlink("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        MediaPlayer mfmPlayer;
        String hlStringmfm = (String) hlmfm.toUri().toString();
        mfmPlayer.play(hlStringmfm);
        }

        public void aswatPlay(){
        Hyperlink hlaswat = new Hyperlink("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        MediaPlayer aswatPlayer;
        String hlStringaswat = (String) hlaswat.toUri().toString();
        aswatPlayer.play(hlStringaswat);
        }

        public void chadaPlay(){
        Hyperlink hlchada = new Hyperlink("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        MediaPlayer chadaPlayer;
        String hlStringchada = (String) hlchada.toUri().toString();
        chadaPlayer.play(hlStringchada);
        }

        public void marsPlay(){
        Hyperlink hlmars = new Hyperlink("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        MediaPlayer marsPlayer;
        String hlStringmars = (String) hlmars.toUri().toString();
        marsPlayer.play(hlStringmars);        
        }
        
        public void medradioPlay(){
        Hyperlink hlmedradio = new Hyperlink("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        MediaPlayer medradioPlayer;
        String hlStringmedradio = (String) hlmedradio.toUri().toString();
        medradioPlayer.play(hlStringmedradio);
        }

        public void taniaPlay(){
        Hyperlink hltania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        MediaPlayer taniaPlayer;
        String hlStringtania = (String) hltania.toUri().toString();
        taniaPlayer.play(hlStringtania);
        }

        public void atlanticPlay(){
        Hyperlink hlatlantic = new Hyperlink("http://atlanticradio.ma:8000/stream/1");
        MediaPlayer atlanticPlayer;
        String hlStringatlantic = (String) hlatlantic.toUri().toString();
        atlanticPlayer.play(hlStringatlantic);
        }

        public void yabiladiPlay(){
        Hyperlink hlyabiladi = new Hyperlink("http://snassen.yabiladi.com:8000/stream/1");
        MediaPlayer yabilaladidiPlayer;
        String hlStringyabiladi = (String) hlyabiladi.toUri().toString();
        yabiladiPlayer.play(hlStringyabiladi);
        }

        public void mediPlay(){
        Hyperlink hlmedi = new Hyperlink("http://51.222.88.199:80/medi1");
        MediaPlayer mediPlayer;
        String hlStringmedi = (String) hlmedi.toUri().toString();
        mediPlayer.play(hlStringmedi);       
         }

        public void nessPlay(){
        Hyperlink hlness = new Hyperlink("http://radio.nessradio.net:8000/nessradio.mp3");
        MediaPlayer nessPlayer;
        String hlStringness = (String) hlness.toUri().toString();
        nessPlayer.play(hlStringness);
        }

        public void hitradioPlay(){
        Hyperlink hlhitradio = new Hyperlink("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        MediaPlayer hitradioPlayer;
        String hlStringhitradio = (String) hlhitradio.toUri().toString();
        hitradioPlayer.play(hlStringhitradio);
        }

        public void hitmarocPlay(){
        Hyperlink hlhitmaroc = new Hyperlink("http://api.webrad.io/data/hls/68/hits1-maroc");
        MediaPlayer hitmarocPlayer;
        String hlStringhitmaroc = (String) hlhitmaroc.toUri().toString();
        hitmarocPlayer.play(hlStringhitmaroc);
        }
        public void tarabPlay(){
        Hyperlink hltarab = new Hyperlink("http://streaming2.rimradio.ma/livetarab");
        MediaPlayer tarabPlayer;
        String hlStringness = (String) hlness.toUri().toString();
        nessPlayer.play(hlStringness);        
        }

        public void wataniaPlay(){
        Hyperlink hlwatania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        MediaPlayer wataniaPlayer;
        String hlStringwatania = (String) hlwatania.toUri().toString();
        wataniaPlayer.play(hlStringwatania);
        }

        public void moroccoenglishPlay(){
        Hyperlink hlmoroccoenglish = new Hyperlink("http://streamer.radio.co/s6cba51492/listen");
        MediaPlayer moroccoenglishPlayer;
        String hlStringmoroccoenglish = (String) hlmoroccoenglish.toUri().toString();
        moroccoenglishPlayer.play(hlStringmoroccoenglish);        
        }

        public void tamazghaPlay(){
        Hyperlink hltamazgha = new Hyperlink("http://streaming2.rimradio.ma/liveamazighe");
        MediaPlayer tamazghaPlayer;
        String hlStringtamazgha = (String) hltamazgha.toUri().toString();
        tamazghaPlayer.play(hlStringtamazgha);
        }

        public void izlanPlay(){
        Hyperlink hlizlan = new Hyperlink("http://izlan.fr/radios/atlas/stream");
        MediaPlayer izlanPlayer;
        String hlStringizlan = (String) hlizlan.toUri().toString();
        izlanPlayer.play(hlStringizlan);        
        }

        public void coranPlay(){
        Hyperlink hlcoran = new Hyperlink("http://dedi.radio-coran.net:8000/livehq.mp3");
        MediaPlayer coranPlayer;
        String hlStringcoran = (String) hlcoran.toUri().toString();
        coranPlayer.play(hlStringcoran);        
        }
        
        public void montecarloPlay(){
        Hyperlink hlmontecarlo = new Hyperlink("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        MediaPlayer montecarloPlayer;
        String hlStringmontecarlo = (String) hlmontecarlo.toUri().toString();
        montecarloPlayer.play(hlStringmontecarlo);
        }

        public void aljazeeraPlay(Hyperlink hlaljazeera){
        Hyperlink hlaljazeera = new Hyperlink("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        MediaPlayer aljazeeraPlayer;
        String hlStringaljazeera = (String) hlaljazeera.toUri().toString();
        aljazeeraPlayer.play(hlStringaljazeera);
        }

        public void skynewsarabiaPlay(){
        Hyperlink hlskynewsarabia = new Hyperlink("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        MediaPlayer skynewsarabiaPlayer;
        String hlStringskynewsarabia = (String) hlskynewsarabia.toUri().toString();
        skynewsarabiaPlayer.play(hlStringskynewsarabia);
        }

        public void bbcarabicPlay(){
        Hyperlink hlbbcarabic = new Hyperlink("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        MediaPlayer bbcarabicPlayer;
        String hlStringbbcarabic = (String) hlbbcarabic.toUri().toString();
        bbcarabicPlayer.play(hlStringbbcarabic);
        }
    
    }

}

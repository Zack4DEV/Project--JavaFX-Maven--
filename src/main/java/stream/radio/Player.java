package stream.radio;

import stream.radio.Action;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.event.EventHandler;
import java.util.*;
import java.net.*;
import javafx.scene.control.Hyperlink;

abstract class Player {

    private final Hyperlink hl;
    Media hlString = (Media) hl.toString();
    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;

    public void play() throws Exception {

        try {
        media = new Media(stringHl);
        if (media.getError() == null) {
            media.setOnError(new Runnable() {
                public void run() {
                }
            });
            try {
                mediaPlayer = new MediaPlayer(media);
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
        mfmPlayer = new MediaPlayer(new Media());
        Media hlStringmfm = (Media) hlmfm.toString();
        mfmPlayer.play(hlStringmfm);
        }

        public void aswatPlay(){
        Hyperlink hlaswat = new Hyperlink("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        aswatPlayer = new MediaPlayer(new Media());
        Media hlStringaswat = (Media) hlaswat.toString();
        aswatPlayer.play(hlStringaswat);
        }

        public void chadaPlay(){
        Hyperlink hlchada = new Hyperlink("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        chadaPlayer = new MediaPlayer(new Media());
        Media hlStringchada = (Media) hlchada.toString();
        chadaPlayer.play(hlStringchada);
        }

        public void marsPlay(){
        Hyperlink hlmars = new Hyperlink("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        marsPlayer = new MediaPlayer(new Media());
        Media hlStringmars = (Media) hlmars.toString();
        marsPlayer.play(hlStringmars);        
        }
         public void medradioPlay(){
        Hyperlink hlmedradio = new Hyperlink("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        medradioPlayer = new MediaPlayer(new Media());
        Media hlStringmedradio = (Media) hlmedradio.toString();
        medradioPlayer.play(hlStringmedradio);
        }

        public void taniaPlay(){
        Hyperlink hltania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        taniaPlayer = new MediaPlayer(new Media());
        Media hlStringtania = (Media) hltania.toString();
        taniaPlayer.play(hlStringtania);
        }

        public void atlanticPlay(){
        Hyperlink hlatlantic = new Hyperlink("http://atlanticradio.ma:8000/stream/1");
        atlanticPlayer = new MediaPlayer(new Media());
        Media hlStringatlantic = (Media) hlatlantic.toString();
        atlanticPlayer.play(hlStringatlantic);
        }

        public void yabiladiPlay(){
        Hyperlink hlyabiladi = new Hyperlink("http://snassen.yabiladi.com:8000/stream/1");
        yabilaladidiPlayer = new MediaPlayer(new Media());
        Media hlStringyabiladi = (Media) hlyabiladi.toString();
        yabiladiPlayer.play(hlStringyabiladi);
        }

        public void mediPlay(){
        Hyperlink hlmedi = new Hyperlink("http://51.222.88.199:80/medi1");
        mediPlayer = new MediaPlayer(new Media());
        Media hlStringmedi = (Media) hlmedi.toString();
        mediPlayer.play(hlStringmedi);       
         }

        public void nessPlay(){
        Hyperlink hlness = new Hyperlink("http://radio.nessradio.net:8000/nessradio.mp3");
        nessPlayer = new MediaPlayer(new Media());
        Media hlStringness = (Media) hlness.toString();
        nessPlayer.play(hlStringness);
        }

        public void hitradioPlay(){
        Hyperlink hlhitradio = new Hyperlink("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        hitradioPlayer = new MediaPlayer(new Media());
        Media hlStringhitradio = (Media) hlhitradio.toString();
        hitradioPlayer.play(hlStringhitradio);
        }

        public void hitmarocPlay(){
        Hyperlink hlhitmaroc = new Hyperlink("http://api.webrad.io/data/hls/68/hits1-maroc");
        hitmarocPlayer = new MediaPlayer(new Media());
        Media hlStringhitmaroc = (Media) hlhitmaroc.toString();
        hitmarocPlayer.play(hlStringhitmaroc);
        }
        public void tarabPlay(){
        Hyperlink hltarab = new Hyperlink("http://streaming2.rimradio.ma/livetarab");
        tarabPlayer = new MediaPlayer(new Media());
        Media hlStringness = (Media) hlness.toString();
        nessPlayer.play(hlStringness);        
        }

        public void wataniaPlay(){
        Hyperlink hlwatania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        wataniaPlayer = new MediaPlayer(new Media());
        Media hlStringwatania = (Media) hlwatania.toString();
        wataniaPlayer.play(hlStringwatania);
        }

        public void moroccoenglishPlay(){
        Hyperlink hlmoroccoenglish = new Hyperlink("http://streamer.radio.co/s6cba51492/listen");
        moroccoenglishPlayer = new MediaPlayer(new Media());
        Media hlStringmoroccoenglish = (Media) hlmoroccoenglish.toString();
        moroccoenglishPlayer.play(hlStringmoroccoenglish);        
        }

        public void tamazghaPlay(){
        Hyperlink hltamazgha = new Hyperlink("http://streaming2.rimradio.ma/liveamazighe");
        tamazghaPlayer = new MediaPlayer(new Media());
        Media hlStringtamazgha = (Media) hltamazgha.toString();
        tamazghaPlayer.play(hlStringtamazgha);
        }

        public void izlanPlay(){
        Hyperlink hlizlan = new Hyperlink("http://izlan.fr/radios/atlas/stream");
        izlanPlayer = new MediaPlayer(new Media());
        Media hlStringizlan = (Media) hlizlan.toString();
        izlanPlayer.play(hlStringizlan);        
        }

        public void coranPlay(){
        Hyperlink hlcoran = new Hyperlink("http://dedi.radio-coran.net:8000/livehq.mp3");
        coranPlayer = new MediaPlayer(new Media());
        Media hlStringcoran = (Media) hlcoran.toString();
        coranPlayer.play(hlStringcoran);        
        }
        
        public void montecarloPlay(){
        Hyperlink hlmontecarlo = new Hyperlink("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        montecarloPlayer = new MediaPlayer(new Media());
        Media hlStringmontecarlo = (Media) hlmontecarlo.toString();
        montecarloPlayer.play(hlStringmontecarlo);
        }

        public void aljazeeraPlay(Hyperlink hlaljazeera){
        Hyperlink hlaljazeera = new Hyperlink("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        aljazeeraPlayer = new MediaPlayer(new Media());
        Media hlStringaljazeera = (Media) hlaljazeera.toString();
        aljazeeraPlayer.play(hlStringaljazeera);
        }

        public void skynewsarabiaPlay(){
        Hyperlink hlskybewsarabia = new Hyperlink("http://radio.skynewsarabia.com/stteam/radio/skynewsarabia");
        skybewsarabiaPlayer = new MediaPlayer(new Media());
        Media hlStringskynewsarabia = (Media) hlskynewsarabia.toString();
        skynewsarabiaPlayer.play(hlStringskynewsarabia);
        }

        public void bbcarabicPlay(){
        Hyperlink hlbbcarabic = new Hyperlink("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        bbcarabicPlayer = new MediaPlayer(new Media());
        Media hlStringbbcarabic = (Media) hlbbcarabic.toString();
        bbcarabicPlayer.play(hlStringbbcarabic);
        }
    
    }

}

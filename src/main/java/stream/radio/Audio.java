package stream.radio;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Audio {
    private void onPreloadAudio() {
        
        String stringmfm = URI.create("http://streamer.eagrpservices.com/audio/mfmradio.ogg").toString();
        String stringaswat = URI.create("http://broadcast.ice.infomaniak.ch/aswat-high.mp3").toString();
        String stringchada = URI.create("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3").toString();
        String stringmars = URI.create("http://streamer.eagrpservices.com/audio/radiomars.mp3").toString();
        String stringmedradio = URI.create("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3").toString();
        String stringtania = URI.create(
                "http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8").toString();
        String stringatlantic = URI.create("http://atlanticradio.ma:8000/stream/1/").toString();
        String stringyabiladi = URI.create("http://snassen.yabiladi.com:8000/stream/1").toString();
        String stringmedi = URI.create("http://51.222.88.199:80/medi1").toString();
        String stringness = URI.create("http://radio.nessradio.net:8000/nessradio.mp3").toString();
        String stringhitradio = URI.create("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3").toString();
        String stringhitmaroc = URI.create("http://api.webrad.io/data/streams/68/hits1-maroc").toString();
        String stringtarab = URI.create("http://streaming2.rimradio.ma/livetarab").toString();
        String stringwatania = URI.create(
                "http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8")
                .toString();
        String stringmoroccoenglish = URI.create("http://streamer.radio.co/s6cba51492/listen").toString();
        String stringtamazgha = URI.create("http://streaming2.rimradio.ma/liveamazighe").toString();
        String stringizlan = URI.create("http://izlan.fr/radios/atlas/stream").toString();
        String stringcoran = URI.create("http://dedi.radio-coran.net:8000/livehq.mp3").toString();
        String stringmontecarlo = URI.create("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3").toString();
        String stringaljazeera = URI.create("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8").toString();
        String stringskynewsarabia = URI.create("http://radio.skynewsarabia.com/stream/radio/skynewsarabia").toString();
        String stringbbcarabic = URI.create("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio").toString();

        String stringname = new String[]{stringmfm,stringaswat,stringchada,stringmars,stringmedradio,stringtania,stringatlantic,stringyabiladi,stringmedi,stringness,stringhitradio,stringhitmaroc,stringtarab,stringwatania,stringmoroccoenglish,stringtamazgha,stringizlan,stringcoran,stringmontecarlo,stringaljazeera,stringskynewsarabia,stringbbcarabic};
        List<String> listname =  List.of(stringname);

        for (int i = 0; i <= listname.size(); i++) {
             String  medianame = listname[i];
            }
     }

    private void onAfterAudio(){
         ArrayList<Button> arraybuttonuri = new ArrayList<Button>();
         String string = new String[]{"mfm","aswat","chada","mars","medradio","2m","atlantic","yabiladi","medi1","ness","hitradio","hitmaroc","tarab","watania","morocco english","tamazgha","izlan","coran","montecarlo","aljazeera","skynewsarabia","bbc arabic"};
        
         for(int i = 0 ; i <= listname.size() ; i++){        
         for(int j = i ; j <= string.size() ; j++ ){
         arraybuttonuri.put(string[j]);
         String TmpText = (String) arraybuttonuri.getText();
         medianame[i].setLabel(TmpText);
         }
     }    
   }

    @FXML
    WebView webView = new WebView();
    @FXML
    MediaView mediaView = new MediaView();

    private void onPlayAudio() {
                if (mediaView.getMediaPlayer == null) {
                    try {
                        final String mediauri = ClassLoader.getSystemResources(medianame);
                        URI uriname = mediauri.toURI();
                        uriname.getMediaPlayer().play();

                    } catch (URISyntaxException use) {
                        use.printStackTrace();
                    }
                }
            }

     public static void main(String[] args) {
       Audio audio = new Audio();
    }

}

package stream.radio;

import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.*;
import java.util.ArrayList;  
import java.util.List;  


public class Data {

    final ListView listview = new ListView();
    List<Hyperlink> links = new ArrayList<>(streammfm,streamaswat,streamchada,streammars,streammedradio,streamtania,streamatlantic,streamyabiladi,streammedi,streamness,streamhitradio,streamhitmaroc,streamtarab,streamwatania,streammoroccoenglish,streamtamazgha,streamizlan,streamcoran,streammontecarlo,streamaljazeera,streamskynewsarabia,streambbcarabic);
    
    public interface Stream {
        
        public void Stream(Hyperlink link){
            
        Hyperlink streammfm = new Hyperlink("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        Hyperlink streamaswat = new Hyperlink("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        Hyperlink streamchada = new Hyperlink("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        Hyperlink streammars = new Hyperlink("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        Hyperlink streammedradio = new Hyperlink("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        Hyperlink streamtania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        Hyperlink streamatlantic = new Hyperlink("http://atlanticradio.ma:8000/stream/1");
        Hyperlink streamyabiladi = new Hyperlink("http://snassen.yabiladi.com:8000/stream/1");
        Hyperlink streammedi = new Hyperlink("http://51.222.88.199:80/medi1");
        Hyperlink streamness = new Hyperlink("http://radio.nessradio.net:8000/nessradio.mp3");
        Hyperlink streamhitradio = new Hyperlink("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        Hyperlink streamhitmaroc = new Hyperlink("http://api.webrad.io/data/streams/68/hits1-maroc");
        Hyperlink streamtarab = new Hyperlink("http://streaming2.rimradio.ma/livetarab");
        Hyperlink streamwatania = new Hyperlink("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        Hyperlink streammoroccoenglish = new Hyperlink("http://streamer.radio.co/s6cba51492/listen");
        Hyperlink streamtamazgha = new Hyperlink("http://streaming2.rimradio.ma/liveamazighe");
        Hyperlink streamizlan = new Hyperlink("http://izlan.fr/radios/atlas/stream");
        Hyperlink streamcoran = new Hyperlink("http://dedi.radio-coran.net:8000/livehq.mp3");
        Hyperlink streammontecarlo = new Hyperlink("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        Hyperlink streamaljazeera = new Hyperlink("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        Hyperlink streamskynewsarabia = new Hyperlink("http://radio.skynewsarabia.com/stream/radio/skynewsarabia");
        Hyperlink streambbcarabic = new Hyperlink("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");
        
        }
        
        public List<Hyperlink> getStream(Hyperlink link){
            return link;
        }

        public void setStream(List<Hyperlink> links ,Hyperlink link){
           links.add(link);
           
           for(final Hyperlink hyperlink : links) {
            hyperlink.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent ae) {
                    getHostServices().showDocument(hyperlink.getText());
                }
            });
        }

        listview.getItems().addAll(links);
        }
    }

    
    public class Media<S extends Stream> {

        public List<S> Media(List<Hyperlink> media){ 
        }

    }
  
    }

}

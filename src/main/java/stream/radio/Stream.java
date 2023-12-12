package stream.radio;

import java.util.*;
import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Collectors;  

import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
public class Stream{

    private String streamString(String name){

        String stringmfm = new String("http://streamer.eagrpservices.com/audio/mfmradio.ogg");
        String stringaswat = new String("http://broadcast.ice.infomaniak.ch/aswat-high.mp3");
        String stringchada = new String("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3");
        String stringmars = new String("http://streamer.eagrpservices.com/audio/radiomars.mp3");
        String stringmedradio = new String("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3");
        String stringtania = new String("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8");
        String stringatlantic = new String("http://atlanticradio.ma:8000/stream/1");
        String stringyabiladi = new String("http://snassen.yabiladi.com:8000/stream/1");
        String stringmedi = new String("http://51.222.88.199:80/medi1");
        String stringness = new String("http://radio.nessradio.net:8000/nessradio.mp3");
        String stringhitradio = new String("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3");
        String stringhitmaroc = new String("http://api.webrad.io/data/streams/68/hits1-maroc");
        String stringtarab = new String("http://streaming2.rimradio.ma/livetarab");
        String stringwatania = new String("http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8");
        String stringmoroccoenglish = new String("http://streamer.radio.co/s6cba51492/listen");
        String stringtamazgha = new String("http://streaming2.rimradio.ma/liveamazighe");
        String stringizlan = new String("http://izlan.fr/radios/atlas/stream");
        String stringcoran = new String("http://dedi.radio-coran.net:8000/livehq.mp3");
        String stringmontecarlo = new String("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3");
        String stringaljazeera = new String("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8");
        String stringskynewsarabia = new String("http://radio.skynewsarabia.com/stream/radio/skynewsarabia");
        String stringbbcarabic = new String("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio");

        List<String> stringNameList = Arrays.AsList(stringmfm,stringaswat,stringchada,stringmars,stringmedradio,stringtania,stringatlantic,stringyabiladi,stringmedi,stringness,stringhitradio,stringhitmaroc,stringtarab,stringwatania,stringmoroccoenglish,stringtamazgha,stringizlan,stringcoran,stringmontecarlo,stringaljazeera,stringskynewsarabia,stringbbcarabic);

        
        }


    public String streamList(String[] streamStringList){


        String stringName = (String) stringNameList.Stream().map( stringScan -> new Scanner(stream.radio.Stream.streamString()).findAll("http://") ).map( stringScan -> stringScan.group()).flatMap().Collect(Collectors.toList());
        
        
    }
    
    public URI toURI() throws URISyntaxException {

        URI streamURI = new URI(stream.radio.Stream.streamList());
            
        }
    
    public URL toURL() thorws MalformedURLException{

        streamURL = new URL();
        streamURL.setUrl( new URL(stream.radio.Stream.toURI());
            
        }

    public static void main(String[] args){
        Stream stream = new Stream();
        
    }
  
}

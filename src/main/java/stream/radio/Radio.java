package stream.radio;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Radio {
     private Button button;   
     private Media media;
     private MediaPlayer mediaPlayer;
     private MediaView mediaView; 
     private AnchorPane anchorPane;
     private TextArea name;
     private String url;
     private final Pattern pattern = Pattern.compile("(http:\\)|[^#\\&\\?\\n]*");

     public Radio(double width, double heigth){ 

        List<String> arrayButton = Arrays.asList("mfm","aswat","chada","mars","medradio","2m","atlantic","yabiladi","medi1","ness","hitradio","hitmaroc","tarab","watania","morocco english","tamazgha","izlan","coran","montecarlo","aljazeera","skynewsarabia","bbc arabic");
        List<List<String>> listName =  arrayButton.stream().map(b -> new Scanner(x).findAll("http://").map(b -> b.group()).collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.toList());

        StringBuilder nameButton = new StringBuilder(); 

        collect.forEach(b -> nameButton.append(b)).toString(); 
          
        
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

        List<String> stringName = Arrays.asList(stringmfm,stringaswat,stringchada,stringmars,stringmedradio,stringtania,stringatlantic,stringyabiladi,stringmedi,stringness,stringhitradio,stringhitmaroc,stringtarab,stringwatania,stringmoroccoenglish,stringtamazgha,stringizlan,stringcoran,stringmontecarlo,stringaljazeera,stringskynewsarabia,stringbbcarabic);
        List<List<String>> listName =  stringName.stream().map(x -> new Scanner(x).findAll("http://").map(m -> m.group()).collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.toList());

        StringBuilder mediaURL = new StringBuilder(); 

        collect.forEach(x -> mediaURL.append(x)).toString();

          

         
     super();
     this.setprefwidth(width);   
     this.setprefheight(height);

     AnchorPane anchorPane = new AnchorPane();
     anchorPane.setprefwidth(width);   
     anchorPane.setprefheight(height);
        
     MediaView mediaView = new MediaView();
     ImageView imageView = new ImageView();
     button = new Button();

     anchorPane.getChildren().addAll(mediaView,imageView,button);
         
     button.setprefwidth(57);   
     button.setprefheight(121);    

     button.setText("nameButton");
    
     button.setOnMouseClicked(EventHandler<MouseEvent> eventHandler = handle -> {
     if(!name.getText().equals("")){
         url.setUrl((mediaURL.getText()).toURL());
         mediaPlayer.load(this.url).play();

     }
     });  
    }

}

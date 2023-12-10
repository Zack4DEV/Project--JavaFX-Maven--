package stream.radio;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URL;
import java.net.URLSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
     super();
     this.setPrefWidth(width);   
     this.setPrefHeight(height);

     AnchorPane anchorPane = new AnchorPane(); 
     anchorPane.setPrefWidth(width);   
     anchorPane.setPrefHeight(height);
        
     MediaView mediaView = new MediaView();
     ImageView imageView = new ImageView();
     button = new Button();
     
     button.setPrefWidth(57);   
     button.setPrefHeight(121);    

     name = nameButton.getText();
     button.setText("name");
    
  
     button.setOnMouseClicked(new EventHandler<MouseEvent>({

     public void handle(MouseEvent mouseEvent){
     if(!name.getText().equals("")){
         url.setUrl((mediaURL.getText()).toURL());
         mediaPlayer.load(this.url).play();

     }
     }
     });  
    anchorPane.getChildren().addAll(button,mediaView);
    }

     private void onPreloadName(){
        List<String> arrayButton = Arrays.asList("mfm","aswat","chada","mars","medradio","2m","atlantic","yabiladi","medi1","ness","hitradio","hitmaroc","tarab","watania","morocco english","tamazgha","izlan","coran","montecarlo","aljazeera","skynewsarabia","bbc arabic");
        List<List<String>> listName =  arrayButton.stream().map(b -> new Scanner(x).findAll("http://").map(b -> b.group()).collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.toList());

        StringBuilder nameButton = new StringBuilder(); 

        collect.forEach(b -> nameButton.append(b).toString());  
    }
     
    private void onPreloadURL() {
        
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

        List<String> stringName = Arrays.asList(stringmfm,stringaswat,stringchada,stringmars,stringmedradio,stringtania,stringatlantic,stringyabiladi,stringmedi,stringness,stringhitradio,stringhitmaroc,stringtarab,stringwatania,stringmoroccoenglish,stringtamazgha,stringizlan,stringcoran,stringmontecarlo,stringaljazeera,stringskynewsarabia,stringbbcarabic);
        List<List<String>> listName =  stringName.stream().map(x -> new Scanner(x).findAll("http://").map(m -> m.group()).collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.toList());

        StringBuilder mediaURL = new StringBuilder(); 

        collect.forEach(x -> mediaURL.append(x).toString());
    }

    void Play(){
    mediaPlayer.load(this.url).play();
    }
}

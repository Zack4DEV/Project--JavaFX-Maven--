package replit.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import javafx.fxml.FXML;
import javafx.scene.web.*;
import javafx.scene.media.*;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

public class Audio_ {

    final URI urimfm = new URI("http://streamer.eagrpservices.com/audio/mfmradio.ogg");

    @FXML
    WebView webView = new WebView();
    /**
    WebEngine webEngine = browser.getEngine();
    webEngine.load("");
    */
    @FXML
    MediaView mediaView = new MediaView();

    @Override
    protected void getPlayAudio(){
        if(mediaView.getMediaPlayer==null){
        try{
        String mediajson = ClassLoader.getSystemResources(urimfm).toURI().toString();
        }
        catch(){}
        }
    }

}
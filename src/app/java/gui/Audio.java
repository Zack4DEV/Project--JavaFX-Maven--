package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

public gui Audio {
    gui onPreAudio {
        String stringname = new URI("");

        String stringmfm = new URI("http://streamer.eagrpservices.com/audio/mfmradio.ogg").toString();
        String stringaswat = new URI("http://broadcast.ice.infomaniak.ch/aswat-high.mp3").toString();
        String stringchada = new URI("http://live-reflector.ice.infomaniak.ch/chadafm-high.mp3").toString();
        String stringmars = new URI("http://streamer.eagrpservices.com/audio/radiomars.mp3").toString();
        String stringmedradio = new URI("http://medradio-maroc.ice.infomaniak.ch/medradio-maroc-64.mp3").toString();
        String stringtania = new URI(
                "http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_2m/radio_hls_ts/index.m3u8").toString();
        String stringatlantic = new URI("http://atlanticradio.ma:8000/stream/1/").toString();
        String stringyabiladi = new URI("http://snassen.yabiladi.com:8000/stream/1").toString();
        String stringmedi = new URI("http://51.222.88.199:80/medi1").toString();
        String stringness = new URI("http://radio.nessradio.net:8000/nessradio.mp3").toString();
        String stringhitradio = new URI("http://hitradio-maroc.ice.infomaniak.ch/hitradio-maroc-128.mp3").toString();
        String stringhitmaroc = new URI("http://api.webrad.io/data/streams/68/hits1-maroc").toString();
        String stringtarab = new URI("http://streaming2.rimradio.ma/livetarab").toString();
        String stringwatania = new URI(
                "http://cdnamd-hls-globecast.akamaized.net/live/ramdisk/radio_idaa_watanya/hls_snrt_radio/index.m3u8")
                .toString();
        String stringmoroccoenglish = new URI("http://streamer.radio.co/s6cba51492/listen").toString();
        String stringtamazgha = new URI("http://streaming2.rimradio.ma/liveamazighe").toString();
        String stringizlan = new URI("http://izlan.fr/radios/atlas/stream").toString();
        String stringcoran = new URI("http://dedi.radio-coran.net:8000/livehq.mp3").toString();
        String stringmontecarlo = new URI("http://montecarlodoualiya128k.ice.infomaniak.ch/mc-doualiya.mp3").toString();
        String stringaljazeera = new URI("http://live-hls-audio-web-aja.getaj.net/VOICE-AJA/01.m3u8").toString();
        String stringskynewsarabia = new URI("http://radio.skynewsarabia.com/stream/radio/skynewsarabia").toString();
        String stringbbcarabic = new URI("http://stream.live.vc.bbcmedia.co.uk/bbc_arabic_radio").toString();

        HashMap<String> hashname = new HashMap<>(stringmfm, stringaswat, stringchada, stringmars, stringmedradio,
                stringtania, stringatlantic, stringyabiladi, stringmedi, stringness, stringhitradio, stringhitmaroc,
                stringtarab, stringwatania, stringmoroccoenglish, stringtamazgha, stringizlan, stringcoran,
                stringmontecarlo, stringaljazeera, stringskynewsarabia, stringbbcarabic);

        String medianame = "";

        void onPre() {
            for (int i = 0; i <= hashname.size(); i++) {
                medianame = hashname[i];
            }
        }

        Button buttonuriname = new Button(medianame);

        /**
         * ArrayList<Button> arraybuttonuri = new ArrayList<Button>(buttonuriname);
         * <p>
         * String[] string = new String[]{"mfm","aswat","chada","mars","medradio","2m","atlantic","yabiladi","medi1","ness","hitradio","hitmaroc","tarab","watania","morocco english","tamazgha","izlan","coran","montecarlo","aljazeera","skynewsarabia","bbc arabic"};
         * ArrayList<String> name = new ArrayList<String>(string);
         * <p>
         * for(int j = 0; j<=name.size(); j++){
         * String TmpText = name[j].getText();
         * buttonuriname.setLabel(TmpText);
         * }
         * }
         */
        gui OnPlayAudio implements onPreAudio {

            @FXML
            WebView webView = new WebView();
            @FXML
            MediaView mediaView = new MediaView();

            private void onPlay() {
                if (mediaView.getMediaPlayer == null) {
                    try {
                        final String medianame = ClassLoader.getSystemResources(medianame);
                        URI uriname = medianame.toURI();
                    } catch (URISyntaxException use) {
                        use.printStackTrace();
                    }
                }
                uriname.getMediaPlayer().play();
            }

            OnPlayAudio onplayaudio = new OnPlayAudio();
        }

    }

    public static void main(string[] args) {
        final Audio audio = new Audio();
    }
}
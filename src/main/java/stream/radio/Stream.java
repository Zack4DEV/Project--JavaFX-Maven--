package stream.radio;

import stream.radio.Media;

import java.util.*;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;
import java.util.stream.Collectors;

import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
public class Stream {
    
    public void streamList(){
        
        List<? extends Media> stringNameList = Arrays.asList(stringmfm,stringaswat,stringchada,stringmars,stringmedradio,stringtania,stringatlantic,stringyabiladi,stringmedi,stringness,stringhitradio,stringhitmaroc,stringtarab,stringwatania,stringmoroccoenglish,stringtamazgha,stringizlan,stringcoran,stringmontecarlo,stringaljazeera,stringskynewsarabia,stringbbcarabic);
        
        stringNameList.stream().map( stringScan -> new Scanner(stringNameList).findAll("http://") ).map( stringScan -> stringScan.group() ).flatMap(list -> list.stream() ).Collect(Collectors.toList());
        
        collect.forEach(stringNameList -> stringScan.add());        

        
    }

    /**
    public string toURI() throws URISyntaxException {

        
        URI mediaURI = stream.radio.streamMedia().build().toURI();
        mediaURI.toString();
        
    }
    
    public URL toURL() throws MalformedURLException {

        URL mediaURL = new URL (mediaURI);
            
        }

    */
  
  
}

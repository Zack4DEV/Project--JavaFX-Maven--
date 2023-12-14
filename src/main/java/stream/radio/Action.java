package stream.radio;

import stream.radio.Player; 
import stream.radio.Player.Players; 

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaErrorEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.net.*;
import java.net.MalformedURLException;


public class Action {

    Hyperlink hl;
    Player players = new Player(new Players((hl)));
     
    @FXML
    private Button button = new Button("");
  
         
    public void action() throws MediaErrorEvent{
    button.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent e){
          }
     });
     }


    public class Actions extends Player {
         
    @FXML
    private Button btnmfm = new Button("mfm");
    @FXML
    private Button btnaswat = new Button("aswat");
    @FXML
    private Button btnchada = new Button("chada");
    @FXML
    private Button btnmars = new Button("mars");
    @FXML
    private Button btnmedradio = new Button("med radio");
    @FXML
    private Button btntania = new Button("2m");
    @FXML
    private Button btnatlantic = new Button("atlantic");
    @FXML
    private Button btnyabiladi = new Button("yabiladi");
    @FXML
    private Button btnmedi = new Button("medi1");
    @FXML
    private Button btnness = new Button("ness");
    @FXML
    private Button btnhitradio = new Button("hitradio");
    @FXML
    private Button btnhitmaroc = new Button("hit maroc");
    @FXML
    private Button btntarab = new Button("tarab");
    @FXML
    private Button btnwatania = new Button("watania");
    @FXML
    private Button btnmoroccoenglish = new Button("morocco english");  
    @FXML
    private Button btntamazgha = new Button("tamazgha");
    @FXML
    private Button btnizlan = new Button("izlan");
    @FXML
    private Button btncoran = new Button("coran");
    @FXML
    private Button btnmontecarlo = new Button("montecarlo"); 
    @FXML
    private Button btnaljazeera = new Button("aljazeera");
    @FXML
    private Button btnskynewsarabia = new Button("skynewsarabia");
    @FXML
    private Button btnbbcarabic = new Button("bbcarabic");   

     public void mfmAction() throws MediaErrorEvent{
     btnmfm.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emfm){
               players.mfmPlayer.play();
          }
     });          
     }

     public void aswatAction() throws MediaErrorEvent{
     btnaswat.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent easwat){
               players.aswatPlayer.play();
          }
     });          
     }

     public void chadaAction() throws MediaErrorEvent{
     btnchada.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent echada){
               players.chadaPlayer.play();
          }
     });          
     }

     public void marsAction() throws MediaErrorEvent{
     btnmars.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emars){
               players.marsPlayer.play();
          }
     });          
     }

     public void medradioAction() throws MediaErrorEvent{
     btnmedradio.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emedradio){
               players.medradioPlayer.play();
          }
     });          
     }

     public void taniaAction() throws MediaErrorEvent{
     btntania.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etania){
               players.taniaPlayer.play();
          }
     });          
     }

     public void atlanticAction() throws MediaErrorEvent{
     btnatlantic.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eatlantic){
               players.atlanticPlayer.play();
          }
     });          
     }

     public void yabiladiAction() throws MediaErrorEvent{
     btnyabiladi.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eyabiladi){
               players.yabiladiPlayer.play();
          }
     });          
     }

     public void mediAction() throws MediaErrorEvent{
     btnmedi.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emedi){
               players.mediPlayer.play();
          }
     });          
     }

     public void nessAction() throws MediaErrorEvent{
     btnness.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eness){
               players.nessPlayer.play();
          }
     });          
     }

     public void hitradioAction() throws MediaErrorEvent{
     btnhitradio.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ehitradio){
               players.hitradioPlayer.play();
          }
     });          
     }

     public void hitmarocAction() throws MediaErrorEvent{
     btnhitmaroc.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ehitmaroc){
               players.hitmarocPlayer.play();
          }
     });          
     }

     public void tarabAction() throws MediaErrorEvent{
     btntarab.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etarab){
               players.tarabPlayer.play();
          }
     });          
     }

     public void wataniaAction() throws MediaErrorEvent{
     btnwatania.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ewatania){
               players.wataniaPlayer.play();
          }
     });          
     }

     public void moroccoenglishAction() throws MediaErrorEvent{
     btnmoroccoenglish.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emoroccoenglish){
               players.moroccoenglishPlayer.play();
          }
     });          
     }

     public void tamazghaAction() throws MediaErrorEvent{
     btntamazgha.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etamazgha){
               players.tamazghaPlayer.play();
          }
     });          
     }

     public void izlanAction() throws MediaErrorEvent{
     btnizlan.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eizlan){
               players.izlanPlayer.play();
          }
     });          
     }


     public void coranAction() throws MediaErrorEvent{
     btncoran.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ecoran){
               players.coranPlayer.play();
          }
     });          
     }

     public void montecarloAction() throws MediaErrorEvent{
     btnmontecarlo.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emontecarlo){
               players.montecarloPlayer.play();
          }
     });          
     }

     public void aljazeeraAction() throws MediaErrorEvent{
     btnaljazeera.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ealjazeera){
               players.aljazeeraPlayer.play();
          }
     });          
     }

     public void skynewsarabiaAction() throws MediaErrorEvent{
     btnskynewsarabia.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eskynewsarabia){
               players.skynewsarabiaPlayer.play();
          }
     });          
     }

     public void bbcarabicAction() throws MediaErrorEvent{
     btnbbcarabic.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ebbcarabic){
               players.bbcarabicPlayer.play();
          }
     });          
     }
                   
     }
     
}

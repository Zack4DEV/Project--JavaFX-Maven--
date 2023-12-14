package stream.radio;

import stream.radio.Player; 
     
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.MediaErrorEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Action {

     
    @FXML
    private Button button = new Button("");
  
         
    public void action() throws MediaErrorEvent{
    button.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent e){
          }
     });
     }

    public class Actions {

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
               mfmPlayer.play();
          }
     });          
     }

     public void aswatAction() throws MediaErrorEvent{
     btnaswat.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent easwat){
               aswatPlayer.play();
          }
     });          
     }

     public void chadaAction() throws MediaErrorEvent{
     btnchada.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent echada){
               chadaPlayer.play();
          }
     });          
     }

     public void marsAction() throws MediaErrorEvent{
     btnmars.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emars){
               marsPlayer.play();
          }
     });          
     }

     public void medradioAction() throws MediaErrorEvent{
     btnmedradio.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emedradio){
               medradioPlayer.play();
          }
     });          
     }

     public void taniaAction() throws MediaErrorEvent{
     btntania.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etania){
               taniaPlayer.play();
          }
     });          
     }

     public void atlanticAction() throws MediaErrorEvent{
     btnatlantic.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eatlantic){
               atlanticPlayer.play();
          }
     });          
     }

     public void yabiladiAction() throws MediaErrorEvent{
     btnyabiladi.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eyabiladi){
               yabiladiPlayer.play();
          }
     });          
     }

     public void mediAction() throws MediaErrorEvent{
     btnmedi.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emedi){
               mediPlayer.play();
          }
     });          
     }

     public void nessAction() throws MediaErrorEvent{
     btnness.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eness){
               nessPlayer.play();
          }
     });          
     }

     public void hitradioAction() throws MediaErrorEvent{
     btnhitradio.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ehitradio){
               hitradioPlayer.play();
          }
     });          
     }

     public void hitmarocAction() throws MediaErrorEvent{
     btnhitmaroc.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ehitmaroc){
               hitmarocPlayer.play();
          }
     });          
     }

     public void tarabAction() throws MediaErrorEvent{
     btntarab.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etarab){
               tarabPlayer.play();
          }
     });          
     }

     public void wataniaAction() throws MediaErrorEvent{
     btnwatania.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ewatania){
               wataniaPlayer.play();
          }
     });          
     }

     public void moroccoenglishAction() throws MediaErrorEvent{
     btnmoroccoenglish.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emoroccoenglish){
               moroccoenglishPlayer.play();
          }
     });          
     }

     public void tamazghaAction() throws MediaErrorEvent{
     btntamazgha.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent etamazgha){
               tamazghaPlayer.play();
          }
     });          
     }

     public void izlanAction() throws MediaErrorEvent{
     btnizlan.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eizlan){
               izlanPlayer.play();
          }
     });          
     }

     public void mfmAction() throws MediaErrorEvent{
     btnmfm.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emfm){
               mfmPlayer.play();
          }
     });          
     }

     public void coranAction() throws MediaErrorEvent{
     btncoran.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ecoran){
               coranPlayer.play();
          }
     });          
     }

     public void montecarloAction() throws MediaErrorEvent{
     btnmontecarlo.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent emontecarlo){
               montecarloPlayer.play();
          }
     });          
     }

     public void aljazeeraAction() throws MediaErrorEvent{
     btnaljazeera.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ealjazeera){
               aljazeeraPlayer.play();
          }
     });          
     }

     public void skynewsarabiaAction() throws MediaErrorEvent{
     btnskynewsarabia.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent eskynewsarabia){
               skynewsarabiaPlayer.play();
          }
     });          
     }

     public void bbcarabicAction() throws MediaErrorEvent{
     btnbbcarabic.setOnAction(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ebbcarabic){
               bbcarabicPlayer.play();
          }
     });          
     }
                   
     }
     
}

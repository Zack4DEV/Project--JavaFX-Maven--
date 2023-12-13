package stream.radio;
     
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Player {

     
     @FXML
     private Button play = new Button();
  
         
    public void play(){
    play.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent ae){
          }
     });
     }

     
}

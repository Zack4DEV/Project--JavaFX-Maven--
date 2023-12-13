package stream.radio;
     
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Action {

     
    @FXML
    private Button button = new Button("hl*");
  
         
    public void action(){
    button.setOnAction(new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent ae){
          }
     });
     }

     
}

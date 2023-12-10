package stream.radio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URL;
import java.net.URLSyntaxException;

import stream.radio.Radio;

public class Main extends Application {

   

    public class Player extends AnchorPane {
     private Button button;   
     private Media media;
     private MediaPlayer mediaPlayer;
     private MediaView mediaView; 
     private AnchorPane anchorPane;
     private TextArea name;
     private String url;
     private final Pattern pattern = Pattern.compile("(http:\\)|[^#\\&\\?\\n]*");
     
     public Player(double width, double heigth){ 
     super();
     this.setPrefWidth(width);   
     this.setPrefHeight(height);

     AnchorPane anchorPane = new AnchorPane(); 
     anchorPane.setPrefWidth(width);   
     anchorPane.setPrefHeight(height);

     button = new Button();
     button.setPrefWidth(57);   
     button.setPrefHeight(121);    

     name = nameButton.getText();
     button.setText("name");
    
      anchorPane.getChildren().addAll(button,name);
  
     button.setOnMouseClicked(new EventHandler<MouseEvent>{
     @Override
     public void handle(MouseEvent mouseEvent){
     if(!name.getText().equals("")){
         url.setUrl((mediaURL.getText()).toURL());
         mediaPlayer.load(this.url).play();

     }
     }
     });
        
    mediaView.setPrefWidth(width);
    mediaView.setPrefHeight(height);
    this.getChildren().addAll(anchorPane,mediaView);
    
    MediaView mediaView = new MediaView(mediaPlayer);
    }

    void Play(){
    mediaPlayer.load(this.url).play();
    }

    void setPlayURL(){
    Matcher matcher = Pattern.matcher(url);
    if(matcher.find()){
    this.url = mediaURL;
    System.out.println(this.url);
    }else{
    System.out.println("Invalid URL");
    }
    }
    }


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("../../../resources/static/radio.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 967, 692);

        scene.getStylesheets().add(ClassLoader.getSystemResource("../../../resources/static/StyleSheets/radio.css").toExternalForm());
        scene.setFill(Color.FLORALWHITE);
        stage.setTitle("Radio APP");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(true);

        Player pl = new Player();
        double anchorPaneHeight = 173;
        double anchorPaneWidth = 163;
        AnchorPane anchorPane = new AnchorPane(new MediaView(),anchorPaneWidth,anchorPaneHeight);
        anchorPane.getChildren().addAll(Player);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

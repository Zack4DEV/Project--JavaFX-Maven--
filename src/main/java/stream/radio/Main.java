package stream.radio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
   
   @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("../../../resources/static/Main.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 967, 692);

        scene.getStylesheets().add(ClassLoader.getSystemResource("../../../resources/static/StyleSheets/Main.css").toExternalForm());
        scene.setFill(Color.FLORALWHITE);
        stage.setTitle("Radio APP");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(true);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

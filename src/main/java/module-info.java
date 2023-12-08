module stream.radio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;
    
    opens stream.radio to javafx.fxml;
    exports stream.radio;
}

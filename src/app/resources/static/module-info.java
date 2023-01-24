module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens replit to javafx.fxml;
    exports replit;
}
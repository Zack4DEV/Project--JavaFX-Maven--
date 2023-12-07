module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens radio to javafx.fxml;
    exports radio;
}
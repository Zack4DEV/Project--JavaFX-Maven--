module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens gui to javafx.fxml;
    exports gui;
}
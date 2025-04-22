module org.example.lesson15_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lesson15_1 to javafx.fxml;
    exports org.example.lesson15_1;
}
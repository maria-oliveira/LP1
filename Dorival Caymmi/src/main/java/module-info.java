module com.mariaeduarda.dorivalcaymmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mariaeduarda.dorivalcaymmi to javafx.fxml;
    exports com.mariaeduarda.dorivalcaymmi;
}
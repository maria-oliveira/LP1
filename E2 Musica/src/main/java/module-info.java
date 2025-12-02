module com.mariaeduarda.dorivalcaymmi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.mariaeduarda.dorivalcaymmi to javafx.fxml;
    exports com.mariaeduarda.dorivalcaymmi;
}
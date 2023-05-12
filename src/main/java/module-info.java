module com.tresenralla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.tresenralla to javafx.fxml;
    exports com.tresenralla;
}
module com.tresenralla {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tresenralla to javafx.fxml;
    exports com.tresenralla;
}
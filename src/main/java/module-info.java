module com.cgvsu {
    requires javafx.controls;
    requires javafx.fxml;
    requires vecmath;
    requires java.desktop;
    requires junit;


    opens com.cgvsu to javafx.fxml;
    exports test;
    exports com.cgvsu;
}
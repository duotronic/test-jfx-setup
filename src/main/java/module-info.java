module com.tekmar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.takmer to javafx.fxml;
    exports com.takmer;
}
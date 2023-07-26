module com.example.gitprojekt2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitprojekt2 to javafx.fxml;
    exports com.example.gitprojekt2;
}
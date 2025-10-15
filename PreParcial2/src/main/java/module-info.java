module co.edu.uniquindio.preparcial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.preparcial2 to javafx.fxml;
    exports co.edu.uniquindio.preparcial2;
}
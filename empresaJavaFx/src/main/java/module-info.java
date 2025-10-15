module co.edu.uniquindio.empresajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.empresajavafx to javafx.fxml;
    exports co.edu.uniquindio.empresajavafx;

    opens co.edu.uniquindio.empresajavafx.model to javafx.fxml;
    exports co.edu.uniquindio.empresajavafx.model;

    opens co.edu.uniquindio.empresajavafx.controller to javafx.fxml;
    exports co.edu.uniquindio.empresajavafx.controller;

    opens co.edu.uniquindio.empresajavafx.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.empresajavafx.viewcontroller;
}
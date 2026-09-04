module ni.edu.uam.sistemadematricula {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.sistemadematricula to javafx.fxml;
    exports ni.edu.uam.sistemadematricula;
}
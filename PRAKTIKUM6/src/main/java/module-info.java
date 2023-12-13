module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens PRAKTIKUM6.TABEL to javafx.fxml;
    exports PRAKTIKUM6.TABEL;
}
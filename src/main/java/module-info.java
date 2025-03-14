module com.example.ex1_surcharge_chap3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_surcharge_chap3 to javafx.fxml;
    exports com.example.ex1_surcharge_chap3;
}
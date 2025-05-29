module carrental {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    
    opens carrental to javafx.fxml;
    exports carrental;
}
module ac.uk.rgu {
    requires javafx.controls;
    requires javafx.fxml;

    opens ac.uk.rgu to javafx.fxml;
    exports ac.uk.rgu;
}

package ac.uk.rgu;

import java.security.Provider;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MysceneController {
    @FXML
    private Label label; 

    @FXML
    private void btnOnClick(){
        this.label.setText("Hiiii");
    }
    
}

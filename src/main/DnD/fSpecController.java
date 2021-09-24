package main.DnD;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class fSpecController {
    public Button btnArchery;
    public Button btnDefense;
    public Button btnDueling;
    public Button btnGWFighting;
    public Button btnProtection;
    public Button btn2WFighting;

    String specialization;
    String eventHandle;

    public String getSpec() {
        return specialization;
    }

    public void archery(ActionEvent actionEvent) {
        specialization = "Archery";
        eventHandle = actionEvent.getEventType().toString();
        if("ACTION".equals(eventHandle)){
            final Stage stage = (Stage) btnArchery.getScene().getWindow();
            stage.close();
        }
    }

    public void defense(ActionEvent actionEvent) {
        specialization = "Defense";
    }

    public void dueling(ActionEvent actionEvent) {
        specialization = "Dueling";
    }

    public void gwFight(ActionEvent actionEvent) {
        specialization = "Great Weapon";
    }

    public void prot(ActionEvent actionEvent) {
        specialization = "Protection";
    }

    public void twoWeap(ActionEvent actionEvent) {
        specialization = "2 Weapon";
    }
}

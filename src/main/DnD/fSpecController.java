package main.DnD;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class fSpecController {
    public Button btnArchery;
    public Button btnDefense;
    public Button btnDueling;
    public Button btnGWFighting;
    public Button btnProtection;
    public Button btn2WFighting;

    String specialization;

    public String getSpec() {
        return specialization;
    }

    public void archery(ActionEvent actionEvent) {
        specialization = "Archery";
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

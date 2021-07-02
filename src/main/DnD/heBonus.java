package main.DnD;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class heBonus {
    public ChoiceBox cbBonus1;
    public ChoiceBox cbBonus2;
    public Button btnAccept;
    ArrayList<String> scores =
            new ArrayList<>(Arrays.asList("Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom"));
    int str, dex, con, intel, wis, cha;
    String name, race, cClass;

    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
    cbBonus1.getItems().addAll(scores);
    cbBonus2.getItems().addAll(scores);

    this.str = str; this.intel = intel;
    this.dex = dex; this.wis = wis;
    this.con = con; this.cha = cha;
    this.name = name; this.race = race; this.cClass = cClass;
    }

    public void acceptClicked(ActionEvent actionEvent) throws IOException {
    boolean different = true;
    String bonus1 = cbBonus1.getSelectionModel().getSelectedItem().toString();
    String bonus2 = cbBonus2.getSelectionModel().getSelectedItem().toString();
    different = difCheck(bonus1, bonus2);
    while (!different){
        JOptionPane.showMessageDialog(null, "Bonuses must be in different scores", "Bonus Conflict", JOptionPane.ERROR_MESSAGE);
        acceptClicked(actionEvent);
        different = difCheck(bonus1, bonus2);
        }
    switch (bonus1){
        case "Strength" -> str = str + 1;
        case "Dexterity" -> dex = dex + 1;
        case "Constitution" -> con = con + 1;
        case "Intelligence" -> intel = intel + 1;
        case "Wisdom" -> wis = wis + 1;
    }
    switch (bonus2){
        case "Strength" -> str = str + 1;
        case "Dexterity" -> dex = dex + 1;
        case "Constitution" -> con = con + 1;
        case "Intelligence" -> intel = intel + 1;
        case "Wisdom" -> wis = wis + 1;
    }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("summary.fxml"));
        Parent summaryScene = (Parent) loader.load();

        sumController sumControl = loader.getController();
        sumControl.dataIntegration(str, dex, con, intel, wis, cha, name, race, cClass);

        final Stage stage = new Stage();
        stage.getIcons().add(new Image("pictures/DnDBW.jpg"));
        stage.setTitle(name + " Character Summary");
        stage.setHeight(425);
        stage.setWidth(600);
        stage.setScene(new Scene(summaryScene));
        stage.show();
    }

    private boolean difCheck(String bonus1, String bonus2) {
    return !bonus1.equals(bonus2);
    }
}

package main.DnD;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.Arrays;

public class heBonus {
    public ChoiceBox cbBonus1;
    public ChoiceBox cbBonus2;
    public Button btnAccept;
    ArrayList<String> scores =
            new ArrayList<>(Arrays.asList("Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom"));

    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
    cbBonus1.getItems().addAll(scores);
    cbBonus2.getItems().addAll(scores);

    }
}

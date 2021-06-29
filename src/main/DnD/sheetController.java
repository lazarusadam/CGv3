package main.DnD;

import javafx.scene.control.Label;

public class sheetController {
    // Ability Score Labels
    public Label strLabel;
    public Label dexLabel;
    public Label conLabel;
    public Label intLabel;
    public Label wisLabel;
    public Label chaLabel;

    // Characteristic Labels
    public Label nameLabel;
    public Label raceLabel;
    public Label classLabel;

    // Derived Stat Labels
    public Label acLabel;
    public Label hpLabel;
    public Label meleeLabel;
    public Label rngLabel;


    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
        nameLabel.setText(name);

        switch (race){
            case "Dwarf":{}
            case "Elf":{}
            case "Halfling":{}
            case "Human":{}
            case "Gnome":{}
            case "Half Elf":{}
            case "Half Orc":{}
            case "Tiefling":{}
        }
        switch (cClass){
            case "Barbarian":{}

            case "Bard":
            case "Cleric":
            case "Druid":
            case "Monk":
            case "Rogue":
            case "Warlock":{}

            case "Fighter":
            case "Paladin":
            case "Ranger":{}

            case "Sorcerer":
            case "Wizard":{}

        }

    }
}

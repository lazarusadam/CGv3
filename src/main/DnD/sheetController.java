package main.DnD;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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

    // Skills Panel
    public TextArea taSkills;


    public void diBarb(int str, int dex, int con, int intel, int wis, int cha, int hp, int ac, String name, String race) {
        nameLabel.setText(name);
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));


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


    }
    public void diFighter(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String special) {
        nameLabel.setText(name);
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));


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


    }
}

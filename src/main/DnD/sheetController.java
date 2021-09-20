package main.DnD;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.lang.annotation.Inherited;
import java.util.function.IntBinaryOperator;

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


    public void diBarb(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int special) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Barbarian");
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
    public void diFighter(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, String special) {
        FPR fighter = new FPR();
        int ac = 0;
        fighter.setAC(dex);

        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Fighter");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));



        String skills;

        skills = "CLASS BASED SKILLS\nSecond Wind:\n  d10+lvl -> 1/day\n" +
                "Fighting Style:\n  ";
        switch (special){
            case "Archery":{ac = fighter.getAC(); break;}
            case "Defense":{ac = fighter.getAC() + 1;break;}
            case "Dueling":{ac = fighter.getAC();break;}
            case "Great Weapon":{ac = fighter.getAC();break;}
            case "Protection":{ac = fighter.getAC();break;}
            case "2 Weapon":{ac = fighter.getAC();break;}
        }

        acLabel.setText(Integer.toString(ac));


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

        taSkills.setText(skills);

    }

    public void diBard(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int specialAbility) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Bard");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));

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

    public void diCleric(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int spells) {
    }
}

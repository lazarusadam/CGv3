package main.DnD;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.lang.annotation.Inherited;
import java.util.function.IntBinaryOperator;

public class sheetController {
    // Ability Score Labels
    @FXML
    public Label strLabel;
    @FXML
    public Label dexLabel;
    @FXML
    public Label conLabel;
    @FXML
    public Label intLabel;
    @FXML
    public Label wisLabel;
    @FXML
    public Label chaLabel;

    // Characteristic Labels
    @FXML
    public Label nameLabel;
    @FXML
    public Label raceLabel;
    @FXML
    public Label classLabel;

    // Derived Stat Labels
    @FXML
    public Label acLabel;
    @FXML
    public Label hpLabel;
    @FXML
    public Label meleeLabel;
    @FXML
    public Label rngLabel;

    // Skills Panel
    @FXML
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
                "Fighting Style: ";
        switch (special){
            case "Archery":{ac = fighter.getAC(); skills = skills + "Archery\n  +2 to Ranged Attack Rolls.\n"; break;}
            case "Defense":{ac = fighter.getAC() + 1; skills = skills + "Defense\n  +1 AC when wearing armor.\n"; break;}
            case "Dueling":{ac = fighter.getAC(); skills = skills + "Dueling\n  +2 dmg when wielding\n  a single 1H weapon.\n"; break;}
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
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Cleric");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diDruid(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int spells) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Druid");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diMonk(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int specialAbility) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Monk");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diPala(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race, int specialAbility) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Paladin");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diSorc(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Sorcerer");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diLock(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Warlock");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }

    public void diWizard(int str, int dex, int con, int intel, int wis, int cha, int hp, String name, String race) {
        nameLabel.setText(name); raceLabel.setText(race); classLabel.setText("Wizard");
        strLabel.setText(Integer.toString(str));
        dexLabel.setText(Integer.toString(dex));
        conLabel.setText(Integer.toString(con));
        intLabel.setText(Integer.toString(intel));
        wisLabel.setText(Integer.toString(wis));
        chaLabel.setText(Integer.toString(cha));
        hpLabel.setText(Integer.toString(hp));
    }
}

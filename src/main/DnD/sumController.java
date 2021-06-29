package main.DnD;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class sumController {
    public TextField tfStr;
    public TextField tfDex;
    public TextField tfCon;
    public TextField tfInt;
    public TextField tfWis;
    public TextField tfCha;
    public TextArea taDesc;
    public Button btnAccept;
    public Button btnReset;
    public ImageView imgChar;
    public ToggleGroup bonusGroup1;
    public ToggleGroup bonusGroup2;
    public TextField tfBonus;
    public RadioButton rbStr1;    public RadioButton rbDex1;    public RadioButton rbCon1;
    public RadioButton rbInt1;    public RadioButton rbWis1;    public RadioButton rbCha1;
    public RadioButton rbStr2;    public RadioButton rbDex2;    public RadioButton rbCon2;
    public RadioButton rbInt2;    public RadioButton rbWis2;    public RadioButton rbCha2;


    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
        String rcLong = race + " " + cClass;
        rbStr1.disableProperty().setValue(true);rbDex1.disableProperty().setValue(true);
        rbCon1.disableProperty().setValue(true);rbInt1.disableProperty().setValue(true);
        rbWis1.disableProperty().setValue(true);rbCha1.disableProperty().setValue(true);
        rbStr2.disableProperty().setValue(true);rbDex2.disableProperty().setValue(true);
        rbCon2.disableProperty().setValue(true);rbInt2.disableProperty().setValue(true);
        rbWis2.disableProperty().setValue(true);rbCha2.disableProperty().setValue(true);
        switch (rcLong) {
            case "Dwarf Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/dwarfbarbarian.jpg"));
            case "Elf Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/elfbarb.jpg"));
            case "Halfling Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/halfbarb.jpg"));
            case "Human Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/humanbarbarian.png"));
            case "Gnome Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/gnomebarb.jpg"));
            case "Half Elf Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/hebarb.jpg"));
            case "Half Orc Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/hobarb.jpg"));
            case "Tiefling Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/Tieflingbarb.jpg"));
        }

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

            case "Bard":{}
            case "Cleric":{}
            case "Druid":{}
            case "Monk":{}
            case "Rogue":{}
            case "Warlock":{}

            case "Fighter":{}
            case "Paladin":{}
            case "Ranger":{}

            case "Sorcerer":{}
            case "Wizard":{}

        }
    }
}

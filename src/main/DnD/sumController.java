package main.DnD;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;

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
            case "Dwarf":{
                tfBonus.setText("Constitution + 2");
                con = con+2;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Elf":{
                tfBonus.setText("Dexterity + 2");
                dex = dex+2;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;

            }
            case "Halfling":{
                tfBonus.setText("Dexterity + 2");
                dex = dex+2;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Human":{
                tfBonus.setText("All stats + 1");
                str = str+1; dex = dex+1; con = con+1;
                intel = intel+1; wis = wis+1; cha = cha+1;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Gnome":{
                tfBonus.setText("Intelligence + 2");
                intel = intel+2;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Half Elf":{
                rbStr1.disableProperty().setValue(false);rbDex1.disableProperty().setValue(false);
                rbCon1.disableProperty().setValue(false);rbInt1.disableProperty().setValue(false);
                rbWis1.disableProperty().setValue(false);
                rbStr1.setUserData(1);rbDex1.setUserData(2);rbCon1.setUserData(3);
                rbInt1.setUserData(4);rbWis1.setUserData(5);
                rbStr2.disableProperty().setValue(false);rbDex2.disableProperty().setValue(false);
                rbCon2.disableProperty().setValue(false);rbInt2.disableProperty().setValue(false);
                rbWis2.disableProperty().setValue(false);
                rbStr2.setUserData(1);rbDex2.setUserData(2);rbCon2.setUserData(3);
                rbInt2.setUserData(4);rbWis2.setUserData(5);
                tfBonus.setText("Charisma + 2.  Two others + 1");
                cha = cha + 2;
              /*  int a = (int)bonusGroup1.getSelectedToggle().getUserData();
                int b = (int)bonusGroup2.getSelectedToggle().getUserData();
                if (a == b){
                    JOptionPane.showMessageDialog(null, "Bonus +1 must be in different ability scores.","Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    switch (a) {
                        case 1 -> str = str + 1;
                        case 2 -> dex = dex + 1;
                        case 3 -> con = con + 1;
                        case 4 -> intel = intel + 1;
                        case 5 -> wis = wis + 1;
                    }
                    switch (b){
                        case 1 -> str = str + 1;
                        case 2 -> dex = dex + 1;
                        case 3 -> con = con + 1;
                        case 4 -> intel = intel + 1;
                        case 5 -> wis = wis + 1;
                    }
                }*/
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Half Orc": {
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Tiefling":{
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
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

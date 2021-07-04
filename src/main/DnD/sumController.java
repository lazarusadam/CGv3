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
    public TextField tfBonus;



    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
        String rcLong = race + " " + cClass;

        switch (rcLong) {
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
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/dndPictures/barbarians/dwarfbarbarian.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/dndPictures/bards/dwarfbard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/dndPictures/clerics/DwarfCleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/dndPictures/druids/dwarfdruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/dndPictures/monks/dwarfmonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/dndPictures/rogues/dwarfrogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/dndPictures/warlocks/dwarflock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/dndPictures/fighters/dwarffighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/dndPictures/paladins/dwarfpaladin.png"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/dndPictures/rangers/dwarfranger.png"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/dndPictures/sorcerers/dwarfsorc.jpg"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/dndPictures/wizards/dwarfwiz.png"));
                }
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

                tfBonus.setText("Charisma + 2.  Two others + 1");
                cha = cha + 2;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Half Orc": {
                tfBonus.setText("Strength + 2.  Constitution + 1");
                str = str+2; con = con+1;
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Tiefling":{
                tfBonus.setText("Charisma + 2.  Intelligence + 1");
                cha = cha+2; intel = intel+1;
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

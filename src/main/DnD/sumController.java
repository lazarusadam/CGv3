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
    public TextField tfBonus;

    String description = "";



    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass) {
        switch (race){
            case "Dwarf":{
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/dwarfbarbarian.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/dwarfbard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/DwarfCleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/dwarfdruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/dwarfmonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/dwarfrogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/dwarflock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/dwarffighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/dwarfpaladin.png"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/dwarfranger.png"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/dwarfsorc.jpg"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/dwarfwiz.png"));
                }
                tfBonus.setText("Constitution + 2");
                con = con+2;
                description = description + "Racial Information\n--------------------\nDarkvision: 60'\n" +
                        "Tool proficiency: Smith's and Mason's tools\nIncreased resist to Poison\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Elf":{
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/elfbarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/elfbard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/elfcleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/elfdruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/elfmonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/elfrogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/elflock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/elffighter.png"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/elfpaladin.png"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/elfranger.jpg"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/elfsorc.jpg"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/elfwiz.png"));
                }
                tfBonus.setText("Dexterity + 2");
                dex = dex+2;
                description = description + "Racial Information\n--------------------\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;

            }
            case "Halfling":{
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/halfbarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/halfbard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/halfcleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/halfdruid.png"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/halfmonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/halfrogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/halflock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/halffighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/halfpaladin.jpg"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/halfranger.jpg"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/halfsorc.png"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/halfwizard.jpg"));
                }
                tfBonus.setText("Dexterity + 2");
                dex = dex+2;
                description = description + "Racial Information\n---------------------\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
                break;
            }
            case "Human":{
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/humanbarbarian.png"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/humanbard.png"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/humancleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/humandruid.png"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/humanmonk.png"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/humanrogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/humanlock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/humanfighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/humanpaladin.jpg"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/humanranger.png"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/humansorc.jpg"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/humanwizard.jpg"));
                }
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
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/gnomebarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/gnomebard.png"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/gnomecleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/gnomedruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/gnomemonk.png"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/gnomerogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/gnomewarlock.png"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/gnomefighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/gnomepaladin.jpg"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/gnomeranger.jpg"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/gnomesorc.png"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/gnomewizard.jpg"));
                }
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
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/hebarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/hebard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/hecleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/hedruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/hemonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/herogue.jpg"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/helock.jpg"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/hefighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/hepaladin.jpg"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/heranger.jpg"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/hesorc.png"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/hewizard.png"));
                }
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
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/hobarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image("main/DnD/classPics/bards/hobard.jpg"));
                    case "Cleric"->imgChar.setImage(new Image("main/DnD/classPics/clerics/hocleric.jpg"));
                    case "Druid"->imgChar.setImage(new Image("main/DnD/classPics/druids/hodruid.jpg"));
                    case "Monk"->imgChar.setImage(new Image("main/DnD/classPics/monks/homonk.jpg"));
                    case "Rogue"->imgChar.setImage(new Image("main/DnD/classPics/rogues/horogue.png"));
                    case "Warlock"->imgChar.setImage(new Image("main/DnD/classPics/warlocks/holock.png"));
                    case "Fighter"->imgChar.setImage(new Image("main/DnD/classPics/fighters/hofighter.jpg"));
                    case "Paladin"->imgChar.setImage(new Image("main/DnD/classPics/paladins/hopaladin.jpg"));
                    case "Ranger"->imgChar.setImage(new Image("main/DnD/classPics/rangers/horanger.png"));
                    case "Sorcerer"->imgChar.setImage(new Image("main/DnD/classPics/sorcerers/hosorc.png"));
                    case "Wizard"->imgChar.setImage(new Image("main/DnD/classPics/wizards/howizard.jpg"));
                }
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
                switch (cClass){
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/Tieflingbarb.jpg"));
                    case "Bard" ->imgChar.setImage(new Image(""));
                    case "Cleric"->imgChar.setImage(new Image(""));
                    case "Druid"->imgChar.setImage(new Image(""));
                    case "Monk"->imgChar.setImage(new Image(""));
                    case "Rogue"->imgChar.setImage(new Image(""));
                    case "Warlock"->imgChar.setImage(new Image(""));
                    case "Fighter"->imgChar.setImage(new Image(""));
                    case "Paladin"->imgChar.setImage(new Image(""));
                    case "Ranger"->imgChar.setImage(new Image(""));
                    case "Sorcerer"->imgChar.setImage(new Image(""));
                    case "Wizard"->imgChar.setImage(new Image(""));
                }
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
            case "Barbarian":{
                Barbarian barb = new Barbarian();
                barb.setHP(con);
                Integer hp = barb.getHP();
                description = description + "Class Information:\n--------------------\nStarting Hit Points: "+ hp +
                        "\nAbilities:\n" + "Rage: 2\nRage Dmg Bonus: +2\n" +
                        "Unarmored Combat AC: " + barb.unarmoredAC(con, dex);
                taDesc.setText(description);
            }

            case "Bard":{
                BCDMRW bard = new BCDMRW();
                bard.setHP(con);
                Integer hp = bard.getHP();
                description = description + "Class information\n--------------------\n";
                taDesc.setText(description);
            }
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

package main.DnD;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class sumController {
    public TextField tfStr;
    public TextField tfDex;
    public TextField tfCon;
    public TextField tfInt;
    public TextField tfWis;
    public TextField tfCha;
    public TextArea taRDesc;
    public TextArea taCDesc;
    public Button btnAccept;
    public Button btnReset;
    public ImageView imgChar;

    String rDesc = "";
    String cDesc = "";
    String cClass;
    String name = "";
    String race;
    int str, dex, con, intel, wis, cha, hp;
    int specialAbility;
    int spells;

    public void dataIntegration(int str, int dex, int con, int intel, int wis, int cha, String name, String race, String cClass, String hebonus1, String heBonus2) throws IOException {
        this.cClass = cClass;
        this.name = name;
        this.race = race;
        this.str = str; this.dex = dex; this.con = con; this.intel = intel; this.wis = wis; this.cha = cha;
        switch (race) {
            case "Dwarf" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/dwarfbarbarian.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/dwarfbard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/DwarfCleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/dwarfdruid.jpg"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/dwarfmonk.jpg"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/dwarfrogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/dwarflock.jpg"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/dwarffighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/dwarfpaladin.png"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/dwarfranger.png"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/dwarfsorc.jpg"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/dwarfwiz.png"));
                }
                con = con + 2;
                rDesc = rDesc + "Ability Bonus: Constitution + 2 \nDarkvision: 60'\n" +
                        "Tool proficiency: Smith's and Mason's tools\nIncreased resist to Poison\n\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));

            }
            case "Elf" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/elfbarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/elfbard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/elfcleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/elfdruid.jpg"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/elfmonk.jpg"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/elfrogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/elflock.jpg"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/elffighter.png"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/elfpaladin.png"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/elfranger.jpg"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/elfsorc.jpg"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/elfwiz.png"));
                }
                dex = dex + 2;
                rDesc = rDesc + "Ability Bonus: Dexterity + 2\nDarkvision: 60'\n" +
                        "Bonus to Save vs. Charm\nCannot be slept\nMeditate instead of sleep\n\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));


            }
            case "Halfling" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/halfbarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/halfbard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/halfcleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/halfdruid.png"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/halfmonk.jpg"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/halfrogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/halflock.jpg"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/halffighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/halfpaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/halfranger.jpg"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/halfsorc.png"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/halfwizard.jpg"));
                }

                dex = dex + 2;
                rDesc = rDesc + "Ability Bonus: Dexterity + 2\nLucky: 1 reroll of a 1 on a d20 attack roll.\n" +
                        "Brave: Bonus to save against Fear";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));

            }
            case "Human" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/humanbarbarian.png"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/humanbard.png"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/humancleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/humandruid.png"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/humanmonk.png"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/humanrogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/humanlock.jpg"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/humanfighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/humanpaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/humanranger.png"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/humansorc.jpg"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/humanwizard.jpg"));
                }

                str = str + 1;
                dex = dex + 1;
                con = con + 1;
                intel = intel + 1;
                wis = wis + 1;
                cha = cha + 1;
                rDesc = rDesc + "Ability Bonus: All Stats + 1\nNo other racial bonuses\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));

            }
            case "Gnome" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/gnomebarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/gnomebard.png"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/gnomecleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/gnomedruid.jpg"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/gnomemonk.png"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/gnomerogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/gnomewarlock.png"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/gnomefighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/gnomepaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/gnomeranger.jpg"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/gnomesorc.png"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/gnomewizard.jpg"));
                }

                intel = intel + 2;
                rDesc = rDesc + "Ability Bonus: Intelligence + 2\nDarkvision: 60'\nGnome Cunning:\n" +
                        "Bonus to all Wis, Int, and Cha saves against magic";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));

            }
            case "Half Elf" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/hebarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/hebard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/hecleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/hedruid.jpg"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/hemonk.jpg"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/herogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/helock.jpg"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/hefighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/hepaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/heranger.jpg"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/hesorc.png"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/hewizard.png"));
                }

                cha = cha + 2;
                rDesc = rDesc + "Ability Bonus: Charisma + 2, " + hebonus1 + " + 1, " + heBonus2 + " + 1\n" +
                        "Darkvision: 60'\nBonus against Charm\nCannot be put to sleep by magic";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
            }
            case "Half Orc" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/hobarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/hobard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/hocleric.jpg"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/hodruid.jpg"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/homonk.jpg"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/horogue.png"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/holock.png"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/hofighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/hopaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/horanger.png"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/hosorc.png"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/howizard.jpg"));
                }

                str = str + 2;
                con = con + 1;
                rDesc = rDesc + "Ability Bonus: Strength + 2, Constitution + 1\nDarkvision: 60'\n" +
                        "Bonus Intimidation Skill\nRelentless Endurance: reduced to 1 hp instead of 0." +
                        " 1/day\nSavage Attacks: can roll 1 additional damage die on a critical hit with" +
                        " melee weapon\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
            }
            case "Tiefling" -> {
                switch (cClass) {
                    case "Barbarian" -> imgChar.setImage(new Image("main/DnD/classPics/barbarians/Tieflingbarb.jpg"));
                    case "Bard" -> imgChar.setImage(new Image("main/DnD/classPics/bards/tieflingbard.jpg"));
                    case "Cleric" -> imgChar.setImage(new Image("main/DnD/classPics/clerics/tieflingcleric.png"));
                    case "Druid" -> imgChar.setImage(new Image("main/DnD/classPics/druids/tieflingdruid.png"));
                    case "Monk" -> imgChar.setImage(new Image("main/DnD/classPics/monks/tieflingmonk.png"));
                    case "Rogue" -> imgChar.setImage(new Image("main/DnD/classPics/rogues/tieflingrogue.jpg"));
                    case "Warlock" -> imgChar.setImage(new Image("main/DnD/classPics/warlocks/tieflinglock.png"));
                    case "Fighter" -> imgChar.setImage(new Image("main/DnD/classPics/fighters/tieflingfighter.jpg"));
                    case "Paladin" -> imgChar.setImage(new Image("main/DnD/classPics/paladins/tieflingpaladin.jpg"));
                    case "Ranger" -> imgChar.setImage(new Image("main/DnD/classPics/rangers/tieflingranger.jpg"));
                    case "Sorcerer" -> imgChar.setImage(new Image("main/DnD/classPics/sorcerers/tieflingsorc.png"));
                    case "Wizard" -> imgChar.setImage(new Image("main/DnD/classPics/wizards/tieflingwizard.jpg"));
                }

                cha = cha + 2;
                intel = intel + 1;
                rDesc = rDesc + "Ability Bonus: Charisma + 2, Intelligence + 1\nDarkvision: 60'\nResist Fire Damage\n";
                tfStr.setText(Integer.toString(str));
                tfDex.setText(Integer.toString(dex));
                tfCon.setText(Integer.toString(con));
                tfInt.setText(Integer.toString(intel));
                tfWis.setText(Integer.toString(wis));
                tfCha.setText(Integer.toString(cha));
            }
        }
        switch (cClass) {
            case "Barbarian" -> {
                Barbarian barb = new Barbarian();
                barb.setHP(con);
                hp = barb.getHP();
                specialAbility = barb.unarmoredAC(con,dex);
                cDesc = cDesc + "Primary Stat: Strength\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n" + "Rage: 2\nRage Dmg Bonus: +2\n" +
                        "Unarmored Combat AC: " + specialAbility;

            }
            case "Bard" -> {
                BCDMRW bard = new BCDMRW();
                bard.setHP(con);
                hp = bard.getHP();
                specialAbility = bard.getInsp(cha);
                cDesc = cDesc + "Primary Stat: Charisma\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\nBardic Inspiration: " + specialAbility + " 1d6/day\n--Spellcasting--\n" +
                        "2 Cantrips & 4 Spells Known\n2 1st Level Spell Slots";

            }
            case "Cleric" -> {
                BCDMRW cleric = new BCDMRW();
                cleric.setHP(con);
                hp = cleric.getHP();
                spells = cleric.getSpells(wis);
                cDesc = cDesc + "Primary Stat: Wisdom\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Spellcasting__\n" +
                        "3 Cantrips & " + spells + " Spells Known\n2 1st Level Spell Slots";

            }
            case "Druid" -> {
                BCDMRW druid = new BCDMRW();
                druid.setHP(con);
                hp = druid.getHP();
                spells = druid.getSpells(wis);

                cDesc = cDesc + "Primary Stat: Wisdom\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Spellcasting--\n" +
                        "2 Cantrips & " + spells + " Spells Known\n2 1st Level Spell Slots\n\n" +
                        "--Class Restriction--\nDruids will not wear armor\nmade of metal.";

            }
            case "Monk" -> {
                BCDMRW monk = new BCDMRW();
                monk.setHP(con);
                hp = monk.getHP();
                specialAbility = monk.getUnarmored(dex, wis);
                cDesc = cDesc + "Primary Stat: Dexterity\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Martial Arts--\n" +
                        "Use Dex as modifiers\nin combat instead of Str\nUnarmed Combat: 1d4 dmg\n" +
                        " -can be a bonus action\nUnarmored Defense:" + specialAbility;

            }
            case "Rogue" -> {
                BCDMRW rogue = new BCDMRW();
                rogue.setHP(con);
                hp = rogue.getHP();

                cDesc = cDesc + "Primary Stat: Dexterity\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\nSneak Attack: 1d6 extra damage " +
                        "to an enemy that is otherwise engaged.\n";
            }
            case "Warlock" -> {
                BCDMRW lock = new BCDMRW();
                lock.setHP(con);
                hp = lock.getHP();

                cDesc = cDesc + "Primary Stat: Charisma\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Spellcasting--\n" +
                        "2 Cantrips & 2 Spells Known\n1 Spell Slot\nOtherworldly Patron\n" +
                        "Additional Benefits based on Patron choice.\n";
            }
            case "Fighter" -> {
                FPR fighter = new FPR();
                fighter.setHP(con);
                hp = fighter.getHP();




                cDesc = cDesc + "Primary Stat: Strength\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\nSpecialized Fighting Style\n" +
                        "Benefits based on style chosen\n  Archery - Defense - Dueling\n  Great Weapon Fighting\n" +
                        "  Protection - 2-Weapon Fighting\nSecond Wind:\nRegain d10+lvl hp in combat\n  1/day";

            }
            case "Paladin" -> {
                FPR paladin = new FPR();
                paladin.setHP(con);
                hp = paladin.getHP();
                specialAbility = paladin.getDS(cha);
                cDesc = cDesc + "Primary Stat: Strength\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\nDivine Sense: 60' " +
                        specialAbility + " times per day\nLay on Hands: Heal 5 hp/day\n";
            }
            case "Ranger" -> {
                FPR ranger = new FPR();
                ranger.setHP(con);
                hp = ranger.getHP();

                cDesc = cDesc + "Primary Stat: Dexterity or Strength\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\nFavored Enemy:" +
                        "\nBonus to Survival Checks against one type of enemy\nNatural Explorer:" +
                        "\nBonus to Ability Checks in one type of terrain\n";

            }
            case "Sorcerer" -> {
                SorcWiz sorc = new SorcWiz();
                sorc.setHP(con);
                hp = sorc.getHP();

                cDesc = cDesc + "Primary Stat: Charisma\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Spellcasting--\n" +
                        "4 Cantrips & 2 Spells Known\n2 1st Level Spell Slots\nSorcerous Origin:\n" +
                        "Draconic or Wild";
            }
            case "Wizard" -> {
                SorcWiz wizard = new SorcWiz();
                wizard.setHP(con);
                hp = wizard.getHP();

                cDesc = cDesc + "Primary Stat: Intelligence\n" +
                        "Starting Hit Points: " + hp + "\n\nAbilities:\n--Spellcasting--\n" +
                        "3 Cantrips Known\n2 1st Level Spell Slots\n";
            }
        }
        taRDesc.setText(rDesc);
        taCDesc.setText(cDesc);
    }

    public void acceptClicked(ActionEvent actionEvent) throws IOException{
        int s, d, co, i, w, ch, hit; String n, r;
        s = str; i = intel; n = name;
        d = dex; w = wis; r = race;
        co = con; ch = cha; hit = hp;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("charsheet.fxml"));
        Parent csScene = (Parent) loader.load();
        sheetController sheet = loader.getController();

        switch (cClass) {
            case "Fighter" -> {
                fSpecController spec = new fSpecController();
                String special = spec.getSpec();
                System.out.println(special);
                sheet.diFighter(s, d, co, i, w, ch, n, r, hit, special);
            }
            case "Barbarian" -> {
                sheet.diBarb(s, d, co, i, w, ch, n, r, hit, specialAbility);
            }
            case "Bard" -> {
                sheet.diBard(s, d, co, i, w, ch, n, r, hit, specialAbility);
            }
            case "Cleric" -> {
                sheet.diCleric(s, d, co, i, w, ch, n, r, hit, spells);
            }
            case "Druid" -> {
                sheet.diDruid(s, d, co, i, w, ch, n, r, hit, spells);
            }
            case "Monk" -> {
                sheet.diMonk(s, d, co, i, w, ch, n, r, hit, specialAbility);
            }
            case "Paladin" -> {
                sheet.diPala(s, d, co, i, w, ch, n, r, hit, specialAbility);
            }
            case "Sorcerer" -> {
                sheet.diSorc(s, d, co, i, w, ch, n, r, hit);
            }
            case "Warlock" -> {
                sheet.diLock(s, d, co, i, w, ch, n, r, hit);
            }
            case "Wizard" -> {
                sheet.diWizard(s, d, co, i, w, ch, n, r, hit);
            }
        }

    }

    public void resetClicked(ActionEvent actionEvent) {
    }
}

package main.DnD;

import main.ClassArchetype;
import main.Dice;

public class BCDMRW implements ClassArchetype {
    String name;
    int str, dex, con, intel, wis, cha, ac, hp;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /* Base ability scores */

    @Override
    public Integer getStr() {
        return str;
    }
    @Override
    public void setStr(int str) {
        this.str = str;
    }

    @Override
    public Integer getDex() {
        return dex;
    }
    @Override
    public void setDex(int dex) {
        this.dex = dex;
    }

    @Override
    public Integer getCon() {
        return con;
    }
    @Override
    public void setCon(int con) {
        this.con = con;
    }

    @Override
    public Integer getInt() {
        return intel;
    }
    @Override
    public void setInt(int intel) {
        this.intel = intel;
    }

    @Override
    public Integer getWis() {
        return wis;
    }
    @Override
    public void setWis(int wis) {
        this.wis = wis;
    }

    @Override
    public Integer getCha() {
        return cha;
    }
    @Override
    public void setCha(int cha) {
        this.cha = cha;
    }

    /* Derived character stats */
    @Override
    public Integer getAC() {
        return ac;
    }
    @Override
    public void setAC(int dex) {
        switch (dex) {
            case 3 -> this.ac = 6;
            case 4, 5 -> this.ac = 7;
            case 6, 7 -> this.ac = 8;
            case 8, 9 -> this.ac = 9;
            case 12, 13 -> this.ac = 11;
            case 14, 15 -> this.ac = 12;
            case 16, 17 -> this.ac = 13;
            case 18, 19 -> this.ac = 14;
            case 20 -> this.ac = 15;
            default -> this.ac = 10;
        }
    }

    @Override
    public Integer getHP() {
        return hp;
    }
    @Override
    public void setHP(int con) {
        Dice roll = new Dice();
        int value = roll.d8();
        switch (con){
            case 3:
                if (value - 4 <= 0)
                    this.hp = 1;
                else
                    this.hp = value - 4;
                break;
            case 4:
            case 5:
                if (value - 3 <= 0)
                    this.hp = 1;
                else
                    this.hp = value - 3;
                break;
            case 6:
            case 7:
                if (value - 2 <= 0)
                    this.hp = 1;
                else
                    this.hp = value - 2;
                break;
            case 8:
            case 9:
                if (value - 1 <= 0)
                    this.hp = 1;
                else
                    this.hp = value - 1;
            case 12:
            case 13:
                this.hp = value + 1;
                break;
            case 14:
            case 15:
                this.hp = value + 2;
                break;
            case 16:
            case 17:
                this.hp = value + 3;
                break;
            case 18:
            case 19:
                this.hp = value + 4;
                break;
            case 20:
                this.hp = value + 5;
                break;
            default:
                this.hp = value;

        }

    }

    /* Bardic Inspiration */
    /* Charisma is the key stat for bards.
       This stat modifier shows how many inspiration dice
       a bard has to spread amongst the party each day */
    public Integer getInsp(int cha) {
        return switch (cha) {
            case 12, 13 -> 1;
            case 14, 15 -> 2;
            case 16, 17 -> 3;
            case 18, 19 -> 4;
            case 20 -> 5;
            default -> 0;
        };
    }

    /* Cleric Spellcasting */
    /* Wisdom is the key stat for clerics.
       This stat modifier shows how many initial spells a
       cleric may know from their spell list.  It is equal to
       the cleric's level + their wisdom bonus modifier */
    public Integer getSpells(int wis) {
        return switch(wis){
            case 12, 13 -> 2;
            case 14, 15 -> 3;
            case 16, 17 -> 4;
            case 18, 19 -> 5;
            case 20 -> 6;
            default -> 1;
        };
    }
}

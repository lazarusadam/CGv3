package main.DnD;

import main.ClassArchetype;
import main.Dice;

public class FPR implements ClassArchetype {
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
        int value = roll.d10();
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
    /* Paladin Specialty */
    /* A Paladin can sense strong evil around them like a
       strong odor.  It can be used a number of times per day
       depending upon the Paladin's charisma */
    public Integer getDS(int cha) {
        return switch(cha){
            case 12, 13 -> 2;
            case 14, 15 -> 3;
            case 16, 17 -> 4;
            case 18, 19 -> 5;
            case 20 -> 6;
            default -> 1;
        };
    }
}

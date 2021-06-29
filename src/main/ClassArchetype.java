/*
    Base interface class for the creation of the various character
    classes associated with Dungeons & Dragons and Pathfinder RPGs
 */

package main;

public interface ClassArchetype {

    String getName();
    void setName(String name);

    //Base Ability Scores
    Integer getStr();
    void setStr(int str);
    Integer getDex();
    void setDex(int dex);
    Integer getCon();
    void setCon(int con);
    Integer getInt();
    void setInt(int intel);
    Integer getWis();
    void setWis(int wis);
    Integer getCha();
    void setCha(int cha);

    //Derived Ability Scores
    Integer getAC();
    void setAC(int dex);
    Integer getHP();
    void setHP(int con);

}

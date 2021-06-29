package main.TestScreens;


import javafx.scene.control.Label;
import main.Dice;


public class dTestController {



    public Label lblResult;

    public void rolld4( ) {
        Dice roll = new Dice();
        int value;
        value = roll.d4();
        lblResult.setText(String.valueOf(value));
        
    }

    public void rolld20( ) {
        Dice roll = new Dice();
        int value;
        value = roll.d20();
        lblResult.setText(String.valueOf(value));
    }

    public void rolld12( ) {
        Dice roll = new Dice();
        int value;
        value = roll.d12();
        lblResult.setText(String.valueOf(value));
    }

    public void rolld10( ) {
        Dice roll = new Dice();
        int value;
        value = roll.d10();
        lblResult.setText(String.valueOf(value));
    }

    public void rolld8() {
        Dice roll = new Dice();
        int value;
        value = roll.d8();
        lblResult.setText(String.valueOf(value));
    }

    public void rolld6() {
        Dice roll = new Dice();
        int value;
        value = roll.d6();
        lblResult.setText(String.valueOf(value));
    }
}

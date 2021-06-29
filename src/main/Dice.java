/*
    Random roll generator using the 6 base dice used in d20 system RPGs.
 */

package main;

import java.util.Random;

public class Dice {
    Random dieRoll = new Random();

    public Dice(){
    }

    public int d4(){
        int die = dieRoll.nextInt(4) + 1;
        return die;
    }

    public int d6(){
        int die = dieRoll.nextInt(6) + 1;
        return die;
    }

    public int d8(){
        int die = dieRoll.nextInt(8) + 1;
        return die;
    }

    public int d10(){
        int die = dieRoll.nextInt(10) + 1;
        return die;
    }

    public int d12(){
        int die = dieRoll.nextInt(12) + 1;
        return die;
    }

    public int d20(){
        int die = dieRoll.nextInt(20) + 1;
        return die;
    }

}

package com.kaiyan;

import com.birdbrain.Finch;

public class SquareFinch {
    public static void main(String[] args) {
        Finch alston = new Finch();
        alston.setMotors(100,100);
        alston.playNote(55, 2);

        for (int i = 0; i<4; i++){
        alston.setMove("F",10,100);
        alston.setTurn("R",90,100);
       alston.setBeak(100, 0, 0);
       alston.getLight("L");
        }
        alston.setTail(2,0,0,100);
        alston.playNote(69, 2);
        alston.setMove("F", 10, 100);
        alston.setMove("B", 10, 100);
        alston.setMove("F", 10, 100);
        alston.setMove("B", 10, 100);
        alston.setMove("F", 10, 100);
        alston.setMove("B", 10, 100);
        alston.stop();
        alston.disconnect();
    }

}

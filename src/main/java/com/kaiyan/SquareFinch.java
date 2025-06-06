package com.kaiyan;

import com.birdbrain.Finch;

public class SquareFinch {
    public static void main(String[] args) {
        Finch alston = new Finch();
        //sets the robot motors to full speed
        alston.setMotors(100,100);
        //plays a note and gives the number of beats
        alston.playNote(55, 2);

//Turns on the beak lights and moves forward and right
        for (int i = 0; i<4; i++){
        alston.setMove("F",10,100);
        alston.setTurn("R",90,100);
       alston.setBeak(100, 0, 0);
       alston.getLight("L");
        }

        //sets the tail to a color and plays a sequence of movements
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

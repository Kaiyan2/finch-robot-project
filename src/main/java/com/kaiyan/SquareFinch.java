package com.kaiyan;

import com.birdbrain.Finch;

public class SquareFinch {
    public static void main(String[] args) {
        Finch alston = new Finch();

        for (int i = 0; i<4; i++){
        alston.setMove("F",10,100);
        alston.setTurn("R",90,100);
        }
        alston.stop();
        alston.disconnect();
    }
}

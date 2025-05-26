package org.fuerzadon.com.chessboard;

public class main {
    public static void main(String[] args) {
        //int chessboard[][] = new int[8][8];

        int[][] cheeboard = {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0}
        };

        int r = 3, c = 3;

        methods.fullChessboard(cheeboard, r, c);
    }
}

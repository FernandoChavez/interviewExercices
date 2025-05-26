package org.fuerzadon.com.chessboard;

public class methods2 {

    public static void fullChessboard(int [][] chessboard, int row, int column){
        placeQueenAndMark(chessboard, row, column);
        int[]safePosition = findSafePosition(chessboard);

        while(safePosition[0] != -1 && safePosition[1] != -1){
            row=safePosition[0];
            column=safePosition[1];
            placeQueenAndMark(chessboard, row, column);
            safePosition = findSafePosition(chessboard);

        }

        printChessboard(chessboard);

    }

    public static int[] findSafePosition(int[][] chessboard){
        for(int r = 0; r<chessboard.length; r++){
            for(int c = 0; c<chessboard.length; c++){
                if(chessboard[r][c] == 0){
                    return new int[]{r,c};
                }
            }

        }

        return new int[] {-1, -1} ;

    }

    public static void printChessboard(int[][] chessboard){
        for(int r=0; r<chessboard.length; r++){
            for(int c=0; c<chessboard.length; c++){
                System.out.print(chessboard[r][c] + " ");
            }
            System.out.println();
        }
    }


    private static void placeQueenAndMark(int [][] chessboard, int row, int column){
        addQueen(chessboard, row, column);
        rangeAttack(chessboard, row, column);
    }


    public static void addQueen(int [][] chessboard, int row, int column){
        chessboard[row][column]=2;
    }

    private static void markDirection(int[][] board, int row, int col, int deltaRow, int deltaCol){
        int r = row+ deltaRow, c = col + deltaCol;
        while(r >= 0 && r< board.length && c>=0 && c< board.length){
            if(board[r][c] !=2){
                board[r][c]=1;
            }
            r+=deltaRow;
            c+=deltaCol;
        }
    }


    public static void rangeAttack(int [][] chessboard, int row, int column){

        //vertical
        markDirection(chessboard, row, column, -1, 0);
        markDirection(chessboard, row, column, 1, 0);
        //horizontal
        markDirection(chessboard, row, column, 0, -1);
        markDirection(chessboard, row, column, 0, 1);

        //Diagonal arriba-izquierda
        markDirection(chessboard, row, column, -1, -1);
        //Diagonal arriba-derecha
        markDirection(chessboard, row, column, -1, 1);
        //Diagonal abajo - izquierda
        markDirection(chessboard, row, column, 1, -1);
        //Diagnoal abajo-derecha
        markDirection(chessboard, row, column, 1, 1);


    }
}

package org.fuerzadon.com.chessboard;

public class methods {
    /*
        0-vacio,2-queen, 1.-queenRangeAttack

    */

    public static void fullChessboard(int [][] chessboard, int row, int column){
        addQueen(chessboard, row, column);
        rangeAttack(chessboard, row, column);
        int[]safePosition = findSafePosition(chessboard);

        while(safePosition[0] != -1 && safePosition[1] != -1){
            row=safePosition[0];
            column=safePosition[1];
            addQueen(chessboard, row, column);
            rangeAttack(chessboard, row, column);
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




    public static void addQueen(int [][] chessboard, int row, int column){
        chessboard[row][column]=2;
    }


    public static void rangeAttack(int [][] chessboard, int row, int column){

        // Vertical
        for(int r = 0; r<chessboard.length; r++){
            if(r!=row && chessboard[r][column] != 2){
                chessboard[r][column]=1;
            }
        }

        //Horizontal
        for(int c = 0; c<chessboard.length; c++){
            if(c!=column && chessboard[row][c] != 2){
                chessboard[row][c]=1;
            }
        }

        // Diagonal arriba-izquierda
        for(int r = row -1, c = column-1; r>=0 && c>=0; r--, c--){
            if(chessboard[r][c] != 2 ){
                chessboard[r][c] = 1;
            }
        }

        // Diagonal arriba-derecha
        for(int r = row-1, c=column +1; r>=0 && c<  chessboard.length; r--, c++){
            if(chessboard[r][c] != 2 ){
                chessboard[r][c] = 1;
            }
        }

        // Diagonal abajo-izquierda
        for(int r = row+1, c = column - 1; r<chessboard.length && c>=0; r++, c-- ){
            if(chessboard[r][c] != 2 ){
                chessboard[r][c] = 1;
            }
        }

        //Diagonal abajo-derecha
        for(int r = row + 1, c = column + 1; r<chessboard.length && c<chessboard.length; r++, c++){
            if(chessboard[r][c] != 2 ){
                chessboard[r][c] = 1;
            }
        }


    }
}

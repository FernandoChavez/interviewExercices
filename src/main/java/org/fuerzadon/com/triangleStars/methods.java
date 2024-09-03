package org.fuerzadon.com.triangleStars;

public class methods {
    public static void printStarTriangle2(int rows){
        for(int i = 1; i<=rows;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

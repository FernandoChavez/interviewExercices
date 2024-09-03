package org.fuerzadon.com.highestAverage;

public class Main {

    //create a 2 dimensional array with int values added
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        //create a 2 dimensional [4][7] array with int values added
        int[][] array2 = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28}
        };

        System.out.println(methods.findHighestAverage(array2));
    }
}

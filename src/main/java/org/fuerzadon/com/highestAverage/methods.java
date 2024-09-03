package org.fuerzadon.com.highestAverage;

public class methods {

    public static double findHighestAverage(int[][] array){
        double highestAverage = 0;
        for(int[] row : array){
            double sum = 0;
            for(int value : row){
                sum += value;
            }

            double average = sum / row.length;
            if(average > highestAverage){
                highestAverage = average;
            }
        }
        return highestAverage;
    }

}

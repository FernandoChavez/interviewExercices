package org.fuerzadon.com.arrayManipulation;

public class methods {
        public static int[] arrayManipulation(int [] array){

            int size = array.length;
            if(size<=1){
                return array;
            }

            int [] sum = new int[size];
            for(int i = 0; i<size; i++){
                if(i==0){
                    sum[i]=array[i] + array[i+1];
                } else if (i == size -1) {
                    sum[i]=array[i] + array[i-1];
                }else{
                    sum[i]=array[i] + array[i+1] + array[i-1];
                }
            }
            return sum;
        }

}

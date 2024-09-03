package org.fuerzadon.com.longestUniformSubstring;

public class methods {

    public static int[] findLongerUniformSubstring(String input){
        if(input==null || input.isEmpty()){
            return new int[]{-1, 0};
        }

        int maxLength=1;
        int maxStartIndex=0;
        int currentLength=1;
        int currentStartIndex=0;
        for(int i=1; i<input.length(); i++){
            if(input.charAt(i)==input.charAt(i -1)){
                currentLength++;
            }else{
                if(currentLength>maxLength){
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                }

                currentStartIndex = i;
                currentLength = 1;
            }
        }

        return new int[]{maxStartIndex, maxLength};
    }

}

package org.fuerzadon.com.reverseWord;

public class methods {
    public static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

    public static String reverseWord2(String word){
        if(word==null || word.isEmpty()){
            return null;
        }
        char[] wordArray = word.toCharArray();
        int n = wordArray.length;
        for(int i=0; i<n/2; i++){
            char temp = wordArray[i];
            wordArray[i] = wordArray[n-1-i];
            wordArray[n-1-i] = temp;
        }

        return new String(wordArray);
    }

}


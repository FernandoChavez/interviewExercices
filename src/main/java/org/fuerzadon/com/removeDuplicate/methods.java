package org.fuerzadon.com.removeDuplicate;

public class methods {

    public static String noRepetitiveChar(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(String.valueOf(word.charAt(i)))) {
                result += word.charAt(i);
            }
        }
        return result;
    }


    public static StringBuilder noRepetitiveCharStrBuilder(StringBuilder word) {
        StringBuilder result = new StringBuilder("");
        if(word == null || word.isEmpty())
            return result;

        //String result = "";

        for(int i = 0; i< word.length(); i++){
            if(result.indexOf(String.valueOf(word.charAt(i))) == -1){
                result.append(word.charAt(i));
            }
        }
        return result;
    }
}

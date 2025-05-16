package org.fuerzadon.com.removeDuplicate;

public class methods {

    public static String noRepetitiveChar(String word) {
        if(word==null || word.isEmpty()) {
            return "";
        }
        word.toLowerCase();
        String result = "";
        for(char c : word.toCharArray()) {
            if(!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        return result;
    }


    public static String noRepetitiveCharStrBuilder(String word) {
        StringBuilder result = new StringBuilder("");

        if(word == null || word.isEmpty())
            return result.toString();

        word=word.toLowerCase();
        //String result = "";

        for(int i = 0; i< word.length(); i++){
            if(result.indexOf(String.valueOf(word.charAt(i))) == -1){
                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }
}

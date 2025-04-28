package org.fuerzadon.com.largestSubstringUninterrumped;

public class methods {
    public static String norepetidos(String msg){

        if(msg.length()<=0){
            return "";
        }

        char [] arrayC = msg.toCharArray();
        StringBuilder current = new StringBuilder(), longest = new StringBuilder();

        for(char c : arrayC){
            String ch = String.valueOf(c);
            if(current.indexOf(ch) != -1){
                current = new StringBuilder(current.substring(current.indexOf(ch)+1));
            }
            current.append(ch);

            if(current.length()> longest.length()){
                longest= new StringBuilder(current);
            }
        }
        return longest.toString();
    }


    public static String norepetidos2(String msg){
        return "";
    }
}

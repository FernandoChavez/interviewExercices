package org.fuerzadon.com.largestSubstringUninterrumped;

public class methods {
    public static String norepetidos(String msg){

        if(msg.length()<=0){
            return "";
        }

        char [] arrayC = msg.toCharArray();
        StringBuilder newMsg = new StringBuilder(), largeUninterrupted = new StringBuilder();

        for(char c : arrayC){
            if(newMsg.indexOf(String.valueOf(c)) == -1){
                newMsg.append(c);
            }else{
                if(largeUninterrupted.length()<newMsg.length()){
                    largeUninterrupted = newMsg;
                }
                newMsg = new StringBuilder();
            }
        }
        return largeUninterrupted.toString();
    }
}

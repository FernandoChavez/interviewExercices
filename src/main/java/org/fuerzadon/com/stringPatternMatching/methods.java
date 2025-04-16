package org.fuerzadon.com.stringPatternMatching;

public class methods {
    public static int patternMatching(String pattern, String word){

        if(pattern.length()>word.length())
            return 0;

        int matching=0;
        String vocals = "aeiouAEIOU", wordP = "";

        char cWord[] = word.toCharArray();
        for(char c : cWord){
            if(vocals.contains(String.valueOf(c))){
                System.out.println("0");
                wordP += "0";
            }else{
                System.out.println("1");
                wordP += "1";
            }
        }
        /*
        for(int i =0; i<word.length(); i++){
            if(vocals.contains(String.valueOf(word.charAt(i)))){
                System.out.println("0");
                wordP += "0";
            }else{
                System.out.println("1");
                wordP += "1";
            }
        }
        */

        int cont = 0;
        int sizeWP = wordP.length();

        while(sizeWP>=pattern.length() && cont<sizeWP){
            if(wordP.contains(pattern)){
                wordP= wordP.replaceFirst(pattern, "");
                matching++;
            }
            cont++;
        }
        return matching;
    }
}

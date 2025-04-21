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


        /*
         StringBuilder wordP = new StringBuilder("");
		 char cWord[] =  word.toCharArray();
		 for(char c : cWord) {
			 if(vowels.contains(String.valueOf(c))) {
				 wordP.append("0");
			 }else {
				 wordP.append("1");
			 }
		 }


        * */

        int sizeP= pattern.length();

        for(int i =0; i<= wordP.length() - sizeP; i++){
            String sub = wordP.substring(i, i + sizeP);
            if(sub.equals(pattern)){
                matching++;
            }
        }

        return matching;
    }
}

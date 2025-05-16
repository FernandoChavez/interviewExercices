package org.fuerzadon.com.removeDuplicate;

public class Main {

        public static void main(String[] args) {
            String result = methods.noRepetitiveChar("aaabbbbbcc");

            String word = methods.noRepetitiveChar("aaabbbbbcc");
            String word2 =methods.noRepetitiveCharStrBuilder("edffhaDGADFGSDFA");


            System.out.println("String without repetitive characters: " + word);
            System.out.println("String without repetitive characters using StringBuilder: " + word2);
        }

}

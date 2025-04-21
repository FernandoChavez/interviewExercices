package org.fuerzadon.com.stringPatternMatching;

public class main {
    public static void main(String[] args) {

        //https://codesignal.com/blog/interview-prep/example-codesignal-questions/

        String pattern ="00";
        String word="aaaaaaaaaaaaaaaaba";

        System.out.println("Numero de coincidencias: "+ methods.patternMatching(pattern, word));
    }

}

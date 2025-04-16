package org.fuerzadon.com.stringPatternMatching;

public class main {
    public static void main(String[] args) {
        String pattern ="00";
        String word="aaaaaaaaaaaaaaaaba";

        System.out.println("Numero de coincidencias: "+ methods.patternMatching(pattern, word));
    }

}

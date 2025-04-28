package org.fuerzadon.com.longestUniformSubstring;

public class Main {

    public static void main(String[] args) {
        int[] result = methods.findLongerUniformSubstring("aaabbbbbcc");
        int[] result2 = methods.findLongerUniformSubstring("a");
        System.out.println("Longest uniform substring starts at: " + result[0] + " with length: " + result[1]);
    }
}

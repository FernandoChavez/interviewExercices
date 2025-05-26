package org.fuerzadon.com.divisibleby3;

public class methods {

    public static int countDivisibleBy3(int numero){
        String num = String.valueOf(numero);
        int count = 0;
        int n = num.length();

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<=n; j++){
                String sub = num.substring(i,j);

                //Ignorar substring que empiezan con '0', excepto si el substring es "0";
                if(sub.length() > 1 && sub.charAt(0)=='0'){
                    continue;
                }

                int value = Integer.parseInt(sub);

                if(value%3 ==0){
                    count++;
                }
            }
        }

        return count;

    }
}

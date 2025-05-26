package org.fuerzadon.com.drawYbimensionalarray;

import java.util.HashMap;
import java.util.Map;

public class methods {

    public void yfigure (int[][] biarray){

        int n = biarray.length, center = n/2;

        Map<Integer, Integer> freqy = new HashMap<>();

        // Posiciones en la Y
        for(int i = 0; i<= center; i++) {
            int val1 = biarray[i][i];
            int val2 = biarray[i][n - 1 - i];

            // identifico el valor localizado en val1 y val2, aumentando su contador
            freqy.put(val1, freqy.getOrDefault(val1, 0) + 1);
            if(i != center) {
                freqy.put(val2, freqy.getOrDefault(val2,0)+1);
            }

        }

        // Línea vertical desde el centro hacia abajo
        for(int i = center;i<n; i++){
            int val = biarray[i][center];
            freqy.put(val, freqy.getOrDefault(val,0)+1);
        }

        // Encontrar valor más frecuente en la Y
        int valy = freqy.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        /*
        for (String key : map.keySet()) {
            int value = map.get(key); // accede al valor usando la clave
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

         */

        // Paso 4: Contar valores fuera de la Y (excluyendo valY)
        Map<Integer, Integer> freqOut = new HashMap<>();

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!isInY(i, j, n)){

                }
            }
        }

    }


    private static boolean isInY(int i, int j, int n){
        int center = n/2;
        //Diagonal izquierza
        if(j==i && i<= center) return true;
        //Diagonal derecha
        if(j==n-1-i && i <= center) return true;
        //linea vertical
        if(j==center & i >= center) return true;

        return false;
    }
}

package Semana1.Taller1;

import java.util.Arrays;

// 3. Dado un arreglo lineal de números, sumar separadamente los pares y los impares.
public class Punto3 {
    public static void main(String[] args) {
        int[] b = new int[11];
        int max = 50;
        int min = 10;
        int sp = 0;
        int si = 0;

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        System.out.println("Arreglo generado:");
        System.out.println(Arrays.toString(b));
        System.out.println();

        StringBuilder pares = new StringBuilder();
        StringBuilder impares = new StringBuilder();


        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
         
                if (pares.length() > 0) pares.append(" + ");
                pares.append(b[i]);
                sp += b[i];
            } else {
                if (impares.length() > 0) impares.append(" + ");
                impares.append(b[i]);
                si += b[i];
            }
        }
        System.out.println("Suma pares   : " + (pares.length() == 0 ? "0" : pares) + " = " + sp);
        System.out.println("Suma impares : " + (impares.length() == 0 ? "0" : impares) + " = " + si);
    }
}
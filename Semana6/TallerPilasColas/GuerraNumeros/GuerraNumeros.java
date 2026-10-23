//8. Guerra de numeros (Cola)
//Enunciado. Dado un conjunto de enteros, sumar por separado pares e impares mientras se van
//desencolando. Retornar la diferencia absoluta entre la suma de impares y la suma de pares.
//Ejemplos de verificacion.
//Entrada: [2, 8, 7, 5] Salida esperada: 2 (Impares: 7+5=12, Pares: 2+8=10, Diferencia = |12-10| = 2)
//Entrada: [1, 3, 5, 9] Salida esperada: 18 (Impares: 18, Pares: 0)
//Entrada: [2, 4, 6, 8] Salida esperada: 20 (Impares: 0, Pares: 20)

package Semana6.TallerPilasColas.GuerraNumeros;

import java.util.*;

public class GuerraNumeros {
    public static void main(String[] args) {
        System.out.println("----------------- CASO 1 ----------------");
        Guerra.mostrar(new ArrayList<>(Arrays.asList(2, 8, 7, 5)));
        System.out.println("----------------- CASO 2 ----------------");
        Guerra.mostrar(new ArrayList<>(Arrays.asList(1, 3, 5, 9)));
        System.out.println("----------------- CASO 3 ----------------");
        Guerra.mostrar(new ArrayList<>(Arrays.asList(2, 4, 6, 8)));
    }
}

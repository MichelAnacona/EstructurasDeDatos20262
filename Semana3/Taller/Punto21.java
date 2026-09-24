package Semana3.Taller;

import Semana3.OperacionesMAtrices;

//CONSTRUIR UN VECTOR B CON LA SUMA DE LOS ELEMENTOS PARES DE CADA FILA DE UNA MATRIZ M*M

public class Punto21 {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        // llenar matriz
        int[][] matriz = objM.llenarMAtriz(4, 4, 1, 9);
        System.out.println(objM.imprimirMatriz(matriz));
        // construir vector B
        int[] b = objM.sumaParesFilas(matriz);
        System.out.println("Vector B:");
        System.out.println(objM.imprimirVector(b));
    }
}
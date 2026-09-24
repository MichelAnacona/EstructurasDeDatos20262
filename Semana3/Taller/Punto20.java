package Semana3.Taller;

import Semana3.OperacionesMAtrices;

//GENERAR UNA MATRIZ 10 x 10 CON CEROS EN LA DIAGONAL PRINCIPAL HACIA ARRIBA

public class Punto20 {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        // generar matriz
        int[][] matriz = objM.ceroDiagonalArriba(10, 1, 9);
        System.out.println(objM.imprimirMatriz(matriz));
    }
}
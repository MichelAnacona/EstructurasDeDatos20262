package Semana3.Taller;

import Semana3.OperacionesMAtrices;

//GENERAR UNA MATRIZ DE N x M CON CEROS, EXCEPTO LA DIAGONAL PRINCIPAL CON UNOS

public class Punto19 {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        // generar matriz
        int[][] matriz = objM.matrizDiagonal(4, 4);
        System.out.println(objM.imprimirMatriz(matriz));
    }
}
package Semana3;

public class EjecutarMetodos {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        // llenar matriz
        int [][] matriz = objM.llenarMAtriz(3, 3, 1, 9);
         System.out.println(objM.imprimirMatriz(matriz));
    }
}

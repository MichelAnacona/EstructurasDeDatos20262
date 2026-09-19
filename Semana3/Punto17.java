//SUMAR LOS ELEMENTOS DE CADA FILA Y CADA COLUMNA DE UNA MATRIZ

public class Punto17 {
     public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        // llenar matriz
        int [][] matriz = objM.llenarMAtriz(3, 3, 1, 9);
        System.out.println(objM.SumaFilasColumnas(matriz));
         System.out.println(objM.imprimirMatriz(matriz));
    }
}

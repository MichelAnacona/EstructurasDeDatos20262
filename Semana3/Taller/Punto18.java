package Semana3.Taller;

import Semana3.OperacionesMAtrices;

//del 18 al 26
//CALCULAR LA TABLA DE MULTIPLICAR DEL 1 AL 10 ALMACENANDO LOS VALORES EN UNA TABLA

public class Punto18 {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        
        int[][] tabla = objM.tablaMultiplicar(10);
        System.out.println(objM.imprimirTablaMultiplicar(tabla));
    }
}
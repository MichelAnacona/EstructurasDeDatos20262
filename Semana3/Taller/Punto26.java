package Semana3.Taller;

import Semana3.OperacionesMAtrices;

//VENTAS DE 8 MODELOS DE CUADERNOS DURANTE 30 DIAS EN UNA PAPELERIA

public class Punto26 {
    public static void main(String[] args) {
        OperacionesMAtrices objM = new OperacionesMAtrices();
        String[] modelos = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] distribuidoras = {"Norma", "Caribe", "Alpes", "Norma", "Caribe", "Alpes", "Norma", "Caribe"};
        int[] precios = {3500, 4200, 2800, 5000, 3900, 4500, 3000, 6000};

        // filas: modelos (8), columnas: dias (30) -> cantidad de cuadernos vendidos
        int[][] ventas = objM.llenarMAtriz(8, 30, 0, 20);
        // dinero recaudado = cantidad vendida * precio del modelo
        int[][] recaudo = objM.recaudoPorModelo(ventas, precios);

        // a. total recaudado por modelo
        int[] totalModelo = objM.totalesPorFila(recaudo);
        System.out.println("a. Total recaudado por modelo en los 30 dias:");
        for (int i = 0; i < totalModelo.length; i++) {
            System.out.println("   Modelo " + modelos[i] + " (" + distribuidoras[i] + ", $" + precios[i]
                    + "): $" + totalModelo[i]);
        }

        // b. total recaudado por dia
        int[] totalDia = objM.totalesPorColumna(recaudo);
        System.out.println("\nb. Total recaudado por dia:");
        for (int j = 0; j < totalDia.length; j++) {
            System.out.println("   Dia " + (j + 1) + ": $" + totalDia[j]);
        }

        // c. modelo que mas dinero produjo
        int modeloMayor = objM.posicionMayor(totalModelo);
        System.out.println("\nc. Modelo que mas dinero produjo: " + modelos[modeloMayor]
                + " (" + distribuidoras[modeloMayor] + ") con $" + totalModelo[modeloMayor]);
    }
}
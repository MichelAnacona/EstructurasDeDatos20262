//5. Segundo numero mas grande (Cola y/o Pila)
//Enunciado. Dado un arreglo de enteros (al menos dos), determinar el segundo mayor. Procesa los
//elementos usando inicialmente una cola (y si deseas, apoya el seguimiento con una pila) para
//mantener max1 y max2 durante el recorrido.
//Ejemplos de verificacion.
//Entrada: [10, 40, 30, 20, 50] Salida esperada: 40
//Entrada: [5, 5, 5, 5, 9] Salida esperada: 5
//Entrada: [-3, -1, -7, -2] Salida esperada: -2

package Semana6.TallerPilasColas.SegundoMayor;

import java.util.*;

public class SegundoMayor {
    public static void main(String[] args) {
        System.out.println("----------------- CASO 1 ----------------");
        Mayores.mostrar(new ArrayList<>(Arrays.asList(10, 40, 30, 20, 50)));
        System.out.println("----------------- CASO 2 ----------------");
        Mayores.mostrar(new ArrayList<>(Arrays.asList(5, 5, 5, 5, 9)));
        System.out.println("----------------- CASO 3 ----------------");
        Mayores.mostrar(new ArrayList<>(Arrays.asList(-3, -1, -7, -2)));
    }
}

//4. Formateo de numero telefonico (Cola)
//Enunciado. Dado un arreglo de 10 digitos, construir la cadena con formato (ddd) ddd-dddd
//consumiendo los digitos en orden FIFO desde una cola. Validar que se entreguen exactamente 10 digitos.
//Ejemplos de verificacion.
//Entrada: [1,2,3,4,5,6,7,8,9,0] Salida esperada: (123) 456-7890
//Entrada: [3,0,0,1,2,3,4,5,6,7] Salida esperada: (300) 123-4567

package Semana6.TallerPilasColas.FormatoTelefono;

import java.util.*;

public class FormatoTelefono {
    public static void main(String[] args) {
        System.out.println("----------------- CASO 1 ----------------");
        Telefono.mostrar(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)));
        System.out.println("----------------- CASO 2 ----------------");
        Telefono.mostrar(new ArrayList<>(Arrays.asList(3, 0, 0, 1, 2, 3, 4, 5, 6, 7)));
        System.out.println("----------------- CASO INVALIDO ----------------");
        Telefono.mostrar(new ArrayList<>(Arrays.asList(3, 0, 0, 1, 2)));
    }
}

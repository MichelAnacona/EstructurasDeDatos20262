//2. Pan similar (Deque como cola de doble extremo)
//Enunciado. Representa un sandwich como una secuencia: pan– relleno– pan. Dados dos sandwiches, verificar si usan el mismo pan al inicio y al final.
//Ejemplos de verificacion.
//Entrada: S1 = [“pan blanco”, “lechuga”, “pan blanco”], S2 = [“pan blanco”, “tomate”, “pan blanco”]Salida esperada: true
//Entrada: S1 = [“pan integral”, “queso”, “pan integral”], S2 = [“pan blanco”, “queso”, “pan integral”]
//Salida esperada: false
package Semana6.TallerPilasColas.PanSimilar;

import java.util.*;

public class Sandwish {

    public static void verificarPan(Deque<String> s1) {

        if (s1.isEmpty()) {
            System.out.println(("No"));
        }
        // Comparar el pan del inicio y del final
        if (s1.peekFirst().equals(s1.peekLast())) {
            System.out.println((s1+"|"+s1.peekFirst()+"|"+s1.peekFirst()+"|"+s1.peekLast()));
            System.out.println(("si"));
        }
        return;
    }
}

//2. Pan similar (Deque como cola de doble extremo)
//Enunciado. Representa un sandwich como una secuencia: pan - relleno - pan. Dados dos sandwiches,
//verificar si usan el mismo pan al inicio y al final.
//Ejemplos de verificacion.
//Entrada: S1 = ["pan blanco", "lechuga", "pan blanco"], S2 = ["pan blanco", "tomate", "pan blanco"]
//Salida esperada: true
//Entrada: S1 = ["pan integral", "queso", "pan integral"], S2 = ["pan blanco", "queso", "pan integral"]
//Salida esperada: false

package Semana6.TallerPilasColas.PanSimilar;

import java.util.*;

public class PanSimilar {
    public static void main(String[] args) {
        System.out.println("----------------- CASO 1 ----------------");
        Deque<String> s1 = Sandwish.crearSandwich(new ArrayList<>(Arrays.asList("pan blanco", "lechuga", "pan blanco")));
        Deque<String> s2 = Sandwish.crearSandwich(new ArrayList<>(Arrays.asList("pan blanco", "tomate", "pan blanco")));
        Sandwish.mostrar(s1, s2);

        System.out.println("----------------- CASO 2 ----------------");
        Deque<String> s3 = Sandwish.crearSandwich(new ArrayList<>(Arrays.asList("pan integral", "queso", "pan integral")));
        Deque<String> s4 = Sandwish.crearSandwich(new ArrayList<>(Arrays.asList("pan blanco", "queso", "pan integral")));
        Sandwish.mostrar(s3, s4);
    }
}

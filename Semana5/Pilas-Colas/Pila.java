
import java.util.*;

/**
 * Pila
 */
public class Pila {

    public static void main(String[] arg) {
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(5);
        pila.push(8);
        pila.push(10);
        pila.push(2);
        pila.push(20);
        pila.push(15);
        pila.push(1);

        String vacia = "";
        if (pila.empty()) {

           vacia = "Si esta Vacia";
        }else{
             vacia = "No esta Vacia";
        }
        
        System.out.println("La pila esta vacia? ------>" + vacia);
        System.out.println("Tope de la Pila " + pila.peek());
        System.out.println("post:" + pila.search(10));
        System.out.println("Elementos de la pila" + pila);
        //Eliminar dos elementos de la pila
        pila.pop();//1
        pila.pop();//15
        
        System.out.println("Elementos de la pila" + pila);
        //Tamaño de la pila
        System.out.println("Tamaño de la pila:" + pila.size());

    }
}
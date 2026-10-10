import java.util.*;

public class Colas {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        System.out.println("La Cola esta vacia" + " " + (cola.isEmpty() ? "Esta vacia" : "No esta vacia"));
        // Agregar Elementos a la cola
        cola.add("Pedro");
        cola.add("Juan");
        cola.add("Maria");
        cola.add("Miguel");
        cola.add("Daniel");

        // Mostrar elementos de la cola
        System.out.println(cola);
        // Mostrar quien esta en la cabeza de la cola
        System.out.println(cola.peek());
        System.out.println(cola.element());
        // Eliminar dos elementos de la cola
        cola.poll();
        cola.remove();
        System.out.println("Elementos de la cola" + " " + cola);
        System.out.println("La Cola esta vacia" + " " + (cola.isEmpty() ? "Esta vacia" : "No esta vacia"));
        // Validar si un elemento esta dentro de la cola
        System.out.println(cola.contains("Daniel"));
        System.out.println(cola.contains("Pedro"));
    }
}

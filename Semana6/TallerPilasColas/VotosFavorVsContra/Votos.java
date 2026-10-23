package Semana6.TallerPilasColas.VotosFavorVsContra;

import java.util.*;

public class Votos {

    // Metodo que crea la cola de votos: cada voto a favor es +1 y cada voto en contra es -1
    public static Queue<Integer> crearCola(int upvotes, int downvotes) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 0; i < upvotes; i++) {
            cola.offer(1);
        }
        for (int i = 0; i < downvotes; i++) {
            cola.offer(-1);
        }
        return cola;
    }

    // Metodo que procesa la cola sumando cada voto hasta vaciarla
    public static int procesar(Queue<Integer> cola) {
        int total = 0;
        while (!cola.isEmpty()) {
            total += cola.poll();
        }
        return total;
    }

    // Metodo que muestra la entrada y la salida de cada caso
    public static void mostrar(int upvotes, int downvotes) {
        Queue<Integer> cola = crearCola(upvotes, downvotes);
        System.out.println("Votos en cola: " + cola.size());
        int resultado = procesar(cola);
        System.out.println("Entrada: upvotes = " + upvotes + ", downvotes = " + downvotes
                + " -> Salida: " + resultado);
        System.out.println("Cola vacia al final: " + cola.isEmpty());
    }
}

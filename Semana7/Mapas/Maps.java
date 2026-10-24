package Semana7.Mapas;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> estudiantes = new HashMap<>();
        estudiantes.put(856589,"Michel");
        estudiantes.put(856581,"Nathalia");
        estudiantes.put(856582,"Jeison");
      
            System.out.println("Tamaño del mapa ==>>" + " " + estudiantes.size());
            System.out.println("esta vacio el mapa?? ==>>" + " " + estudiantes.isEmpty());
            System.out.println("El mapa ==>>" + " " + estudiantes);
            System.out.println(estudiantes.containsKey(856589));
            System.out.println(estudiantes.containsValue("Michel"));
            System.out.println(estudiantes.remove(856581));
            // System.out.println(estudiantes.replace(856589,"Michel Anacona"));
            System.out.println(estudiantes.replace(856589,"Michel Anacona Noguera"));
            System.out.println(estudiantes);

            Iterator est = estudiantes.keySet().iterator();
           
           for (Integer key : estudiantes.keySet()) {
            System.out.println("Clave: " + key + " --> Valor: " + estudiantes.get(key));
        }
        
        /*
        Iterator est = estudiantess.keySet().iterator();
        while(est.hasNext()){
        Integer key = (Integer) est.next();
        System.out.println("Clave: " + key + " Valor: " + estudiantess.get(key));
        }
        */  
    }
}

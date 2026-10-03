public class Main {
    public static void main(String[] args) {
        Trabajador obj1 = new Trabajador(1, "juan", "perez", 30, 1000.0);
        Trabajador obj2 = new Trabajador(2, "steven", "noguera", 30, 2000.0);
        Trabajador obj3 = new Trabajador(3, "natalia", "esta niña", 26, 2000.0);
    
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.getNombre());
        
        //Arreglo de objetos
        
        Trabajador[] trabajadores = new Trabajador[3];
        trabajadores[0] = obj1;
        trabajadores[1] = obj2;
        trabajadores[2] = obj3;

        //sumar los salarioBases de los trabajadores
        double totalsalarioBases = obj1.calcularsalarioBases(trabajadores);
        double promedioEdades = obj1.promedioEdades(trabajadores);
        System.out.println("Cantidad de trabajadores: " + " " + trabajadores.length);
        System.out.println("La suma de los salarioBases de mis trabajadores es:" + " " + totalsalarioBases);
        System.out.println("El promedio de edades de mis trabajadores es:" + " " + promedioEdades);


        //Creacion de los objetos operario y vendedor
        Trabajador obOperario1 = new Operario(1, "michel", "Anacona", 30, 15000, 40);
        Trabajador obVendedor1 = new Vendedor(256, "Steven", "Noguera", 31, 1000000, 20);
        Trabajador obOperario2 = new Operario(2, "Jose", "Anacona", 30, 100000, 20);
        Trabajador obVendedor2 = new Vendedor(257, "Frank", "Noguera", 32, 1000000, 40);
        
        System.out.println("----------------- POLIFORMISMO----------------");
        //System.out.println("Pago total :" + obOperario1.pagar());
        //System.out.println("Pago total :" + obVendedor1.pagar());

        // creacion de arreglo de un nuevo trabajadores
        Trabajador[] e = new Trabajador[4];
        e[0] = obOperario1;
        e[1] = obVendedor1;
        e[2] = obOperario2;
        e[3] = obVendedor2;

        for(int i = 0; i < e.length; i++){
            System.out.println("Salario mes: " + e[i].pagar());
        }
        
    }
}
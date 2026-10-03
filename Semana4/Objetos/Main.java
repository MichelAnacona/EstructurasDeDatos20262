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
        
    }
}
public class Trabajador {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;

    // Constructor
    public Trabajador(int id, String nombre, String apellido, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Metodo para calcular

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", salarioBase=" + salarioBase + '}';
    }

    // Metodo que permite calcular el total de los salarioBases de todos los
    // trabajadores
    public double calcularsalarioBases(Trabajador[] t) {
        double sumasalarioBase = 0.0;
        for (int i = 0; i < t.length; i++) {
            sumasalarioBase += t[i].getSalarioBase();
        }
        return sumasalarioBase;
    }
    public double promedioEdades(Trabajador[] t) {
        double promedioEdades = 0.0;
        double sumaEdades = 0.0;
        for (int i = 0; i < t.length; i++) {
            sumaEdades += t[i].getEdad();
            promedioEdades = sumaEdades / t.length;
        }
        return promedioEdades;
    }

    public double pagar(){
        return 0.0;
    }

}
public class Vendedor extends Trabajador {
    private int comision;

    // Constructor
    public Vendedor(int id, String nombre, String apellido, int edad, double salarioBase,int comision) {
   super(id, nombre, apellido, edad, salarioBase);
        this.comision = comision;
    }

public double pagar(){
        return getSalarioBase() * ( 1 + (100 / comision));
    }
}
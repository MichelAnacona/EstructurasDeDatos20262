package Semana5.Taller.Actividad2;

import java.util.*;

//Cada producto debe tener código, nombre, precio y cantidad disponible.
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
                + '}';
    }

    // Requerimientos:
    // • Registrar productos en posiciones específicas.
    // • Mostrar los productos indicando fila y columna.
    // • Buscar un producto por código.
    // • Calcular el valor total del inventario.
    // • Identificar el producto con mayor cantidad disponible y contar las
    // posiciones vacías.

    public Producto[][] llenarMatriz(int i, int j, Producto p) {
        Producto[][] m = new Producto[3][4];
        for (int k = 0; k < m.length; k++) {
            for (int l = 0; l < m[0].length; l++) {
                m[i][j] = p;
            }
        }
        return m;
    }

    public Producto leerMatriz(int f, int c, Scanner sc) {
        Producto[][] m = new Producto[f][c];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == f && j == c) {
                    Producto p = m[f][c];
                }
            }
            return p;
        }

    }
}
package Semana1;

public class Ejecutar {
    public static void main(String[] args) {
        // Declaración del arreglo-array-vector (Forma 1)
        int[] a = { 5, 6, 8, 9, 10, 25, 19, 3, 6, 22, 2 };
        for (int i = 0; i < a.length; i++) {
            
            System.out.println("a[" + i + "]=" + a[i]);
        }

        // Sumar todos los elementos del arreglo a
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("suma =" + sum);
        // Declaración del arreglo-array-vector (Forma 2)
        int[] b = new int[11];
        int max = 50;
        int min = 10;

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * (max - min - 1) + min);
        }
        // Mostrar array B
        for (int i = 0; i < b.length; i++) {
            
            System.out.println("b[" + i + "]=" + b[i]);
        }
        // Mostrar array B elevado al cuadrado cada elemento
        for (int i = 0; i < b.length; i++) {
            
            System.out.println("elemento "+ i + " -->"+ b[i] + " " + "*"+ b[i] + Math.pow(b[i],2) );
        }

    }
}

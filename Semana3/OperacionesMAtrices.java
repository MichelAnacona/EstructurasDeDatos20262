package Semana3;

public class OperacionesMAtrices {
    public int[][] llenarMAtriz(int f, int c, int min, int max) {
        int[][] m = new int[f][c];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) (Math.random() * (max - min - 1) + min);
            }
        }
        return m;
    }

    public String imprimirMatriz(int[][] m) {
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            cad += "|";
            for (int j = 0; j < m[0].length; j++) {
                cad += m[i][j] + "|";
                ;
            }
            cad += "\n";
        }
        return cad;
    }

    public String SumaFilasColumnas(int[][] m) {
        String cad = "";

        int sumaFilas, sumaColumnas;
        for (int i = 0; i < m.length; i++) {
            sumaFilas = 0;
            sumaColumnas = 0;
            for (int j = 0; j < m[0].length; j++) {
                sumaFilas += m[i][j];
                sumaColumnas += m[j][i];

            }
            cad += "suma Fila" + " " + i + ": ---->" + " " + sumaFilas + "\n";
            cad += "suma Columna" + " " + i + ": ---->" + " " + sumaColumnas + "\n";
        }
        return cad;
    }

    public int[][] tablaMultiplicar(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (i + 1) * (j + 1);
            }
        }
        return m;
    }

    public String imprimirTablaMultiplicar(int[][] m) {
        String cad = "  X |";
        for (int j = 0; j < m[0].length; j++) {
            cad += String.format("%4d|", j + 1);
        }
        cad += "\n";
        for (int i = 0; i < m.length; i++) {
            cad += String.format("%3d |", i + 1);
            for (int j = 0; j < m[0].length; j++) {
                cad += String.format("%4d|", m[i][j]);
            }
            cad += "\n";
        }
        return cad;
    }

    public int[][] matrizDiagonal(int n, int m) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }

    public int[][] ceroDiagonalArriba(int n, int min, int max) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i <= j) {
                    mat[i][j] = 0;
                } else {
                    mat[i][j] = (int) (Math.random() * (max - min + 1) + min);
                }
            }
        }
        return mat;
    }

    public int[] sumaParesFilas(int[][] m) {
        int[] b = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] % 2 == 0) {
                    suma += m[i][j];
                }
            }
            b[i] = suma;
        }
        return b;
    }

    public String imprimirVector(int[] v) {
        String cad = "|";
        for (int i = 0; i < v.length; i++) {
            cad += v[i] + "|";
        }
        return cad;
    }
}
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
    public String imprimirMatriz(int [][] m) {
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

    public String SumaFilasColumnas(int [][] m) {
        String cad = "";
        
        int sumaFilas, sumaColumnas;
        for (int i = 0; i < m.length; i++) {
            sumaFilas = 0;
            sumaColumnas = 0;
            for (int j = 0; j < m[0].length; j++) {
                sumaFilas += m[i][j];
                sumaColumnas += m[j][i];
        
            }
            cad += "suma Fila" + " " + i + ": ---->"+ " " + sumaFilas + "\n";
            cad += "suma Columna" + " " + i + ": ---->"+ " " + sumaColumnas + "\n";
        }
        return cad;
    }

}
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Matrices      
*/
// ============================================================================//
// ============================================================================//

public class CJ49_Matrices {

    public static void imprimir(String titulo, int[][] m) {
        System.out.println(titulo);
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }

    public static int[][] sumar(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        return r;
    }

    public static int[][] porEscalar(int[][] a, int k) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                r[i][j] = a[i][j] * k;
            }
        }
        return r;
    }

    // Multiplicación: (m x n) * (n x p) = (m x p)
    public static int[][] multiplicar(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return r;
    }

    public static int[][] identidad(int n) {
        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++) {
            r[i][i] = 1;
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   MATRICES EN JAVA
                             =========================================""");

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{10, 20, 30}, {40, 50, 60}};

        System.out.println();
        imprimir("Matriz A (2x3):", a);
        imprimir("Matriz B (2x3):", b);

        System.out.println();
        imprimir("A + B:", sumar(a, b));
        System.out.println();
        imprimir("A x 3 (por escalar):", porEscalar(a, 3));

        // Multiplicación: A (2x3) por C (3x2) = resultado (2x2)
        int[][] c = {{1, 4}, {2, 5}, {3, 6}};
        System.out.println();
        imprimir("Matriz C (3x2):", c);
        System.out.println();
        imprimir("A x C (2x2):", multiplicar(a, c));

        // Suma por filas y por columnas
        System.out.println("\n--- Sumas de A ---");
        for (int i = 0; i < a.length; i++) {
            int suma = 0;
            for (int j = 0; j < a[i].length; j++) suma += a[i][j];
            System.out.println("Suma de la fila " + i + ": " + suma);
        }
        for (int j = 0; j < a[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < a.length; i++) suma += a[i][j];
            System.out.println("Suma de la columna " + j + ": " + suma);
        }

        // Mayor elemento y su posición
        int mayor = a[0][0], fMayor = 0, cMayor = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > mayor) {
                    mayor = a[i][j];
                    fMayor = i;
                    cMayor = j;
                }
            }
        }
        System.out.println("\nMayor de A: " + mayor + " en [" + fMayor + "][" + cMayor + "]");

        System.out.println();
        imprimir("Matriz identidad 4x4:", identidad(4));

        // Matriz llena con una fórmula: tabla de multiplicar 5x5
        int[][] tabla = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println();
        imprimir("Tabla de multiplicar 5x5:", tabla);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MATRICES                        ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
    }
}

//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Matrices      
*/
// ============================================================================//
// ============================================================================//
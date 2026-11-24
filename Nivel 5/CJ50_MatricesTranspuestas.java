//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Matrices transpuestas      
*/
// ============================================================================//
// ============================================================================//

public class CJ50_MatricesTranspuestas {

    public static void imprimir(String titulo, int[][] m) {
        System.out.println(titulo);
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    // La transpuesta intercambia filas por columnas: t[j][i] = m[i][j]
    // Una matriz (f x c) se convierte en (c x f)
    public static int[][] transponer(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;
        int[][] t = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    // En una matriz CUADRADA se puede transponer en el mismo lugar
    public static void transponerEnSitio(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }

    // Simétrica: es igual a su transpuesta (m[i][j] == m[j][i])
    public static boolean esSimetrica(int[][] m) {
        if (m.length != m[0].length) {
            return false;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   MATRICES TRANSPUESTAS
                             =========================================""");

        // 1. Matriz rectangular 2x3 -> transpuesta 3x2
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println();
        imprimir("Matriz A (2x3):", a);
        System.out.println();
        imprimir("Transpuesta de A (3x2):", transponer(a));

        // 2. La transpuesta de la transpuesta es la original
        System.out.println();
        imprimir("(A^T)^T = A:", transponer(transponer(a)));

        // 3. Matriz cuadrada transpuesta en el mismo lugar
        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println();
        imprimir("Matriz B (3x3):", b);
        transponerEnSitio(b);
        System.out.println();
        imprimir("B transpuesta en sitio:", b);

        // 4. Matrices simétricas
        int[][] s = {
            {1, 7, 3},
            {7, 4, 5},
            {3, 5, 9}
        };
        System.out.println("\n¿B es simétrica? " + esSimetrica(b));
        System.out.println("¿S es simétrica? " + esSimetrica(s));

        // 5. Aplicación: convertir filas en columnas de una tabla de datos
        int[][] ventas = {
            {100, 200, 150},   // producto 0 en 3 meses
            {300, 250, 400}    // producto 1 en 3 meses
        };
        System.out.println();
        imprimir("Ventas por producto (filas) y mes (columnas):", ventas);
        System.out.println();
        imprimir("Ventas por mes (filas) y producto (columnas):", transponer(ventas));

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MATRICES TRANSPUESTAS           ║
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
 - Lección   : Matrices transpuestas      
*/
// ============================================================================//
// ============================================================================//
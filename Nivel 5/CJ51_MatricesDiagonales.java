//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Matrices diagonales      
*/
// ============================================================================//
// ============================================================================//

public class CJ51_MatricesDiagonales {

    public static void imprimir(String titulo, int[][] m) {
        System.out.println(titulo);
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    // Diagonal principal: de arriba-izquierda a abajo-derecha (i == j)
    public static int sumaDiagonalPrincipal(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    // Diagonal secundaria: de arriba-derecha a abajo-izquierda (i + j == n - 1)
    public static int sumaDiagonalSecundaria(int[][] m) {
        int n = m.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += m[i][n - 1 - i];
        }
        return suma;
    }

    // Matriz diagonal: todo fuera de la diagonal principal es 0
    public static boolean esDiagonal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i != j && m[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esIdentidad(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int esperado = (i == j) ? 1 : 0;
                if (m[i][j] != esperado) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   MATRICES DIAGONALES
                             =========================================""");

        // Matriz 4x4 con los números del 1 al 16
        int n = 4;
        int[][] m = new int[n][n];
        int contador = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = contador++;
            }
        }
        System.out.println();
        imprimir("Matriz M (4x4):", m);

        // 1. Mostrar las diagonales
        System.out.print("\nDiagonal principal:  ");
        for (int i = 0; i < n; i++) System.out.print(m[i][i] + " ");
        System.out.print("\nDiagonal secundaria: ");
        for (int i = 0; i < n; i++) System.out.print(m[i][n - 1 - i] + " ");
        System.out.println();

        // 2. Sumas (la suma de la principal se llama TRAZA)
        System.out.println("\nTraza (suma diagonal principal): " + sumaDiagonalPrincipal(m));
        System.out.println("Suma diagonal secundaria:        " + sumaDiagonalSecundaria(m));

        // 3. Triángulo superior e inferior
        System.out.print("\nTriángulo superior (j > i): ");
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                System.out.print(m[i][j] + " ");
        System.out.print("\nTriángulo inferior (j < i): ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                System.out.print(m[i][j] + " ");
        System.out.println();

        // 4. Dibujar la matriz marcando las diagonales
        System.out.println("\nMarcando las diagonales ([x] principal, (x) secundaria):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.printf("[%2d]", m[i][j]);
                } else if (i + j == n - 1) {
                    System.out.printf("(%2d)", m[i][j]);
                } else {
                    System.out.printf(" %2d ", m[i][j]);
                }
            }
            System.out.println();
        }

        // 5. Matriz diagonal e identidad
        int[][] d = {
            {5, 0, 0},
            {0, 8, 0},
            {0, 0, 2}
        };
        int[][] id = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println();
        imprimir("Matriz D:", d);
        System.out.println("¿D es diagonal?  " + esDiagonal(d));
        System.out.println("¿D es identidad? " + esIdentidad(d));
        System.out.println("¿I es identidad? " + esIdentidad(id));
        System.out.println("¿M es diagonal?  " + esDiagonal(m));

        // 6. Construir una matriz diagonal a partir de valores
        int[] valores = {3, 6, 9, 12};
        int[][] construida = new int[valores.length][valores.length];
        for (int i = 0; i < valores.length; i++) {
            construida[i][i] = valores[i];
        }
        System.out.println();
        imprimir("Matriz diagonal construida:", construida);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MATRICES DIAGONALES             ║
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
 - Lección   : Matrices diagonales      
*/
// ============================================================================//
// ============================================================================//
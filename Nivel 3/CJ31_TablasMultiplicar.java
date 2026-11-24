//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Tablas de multiplicar      
*/
// ============================================================================//
// ============================================================================//

public class CJ31_TablasMultiplicar {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t TABLAS DE MULTIPLICAR
                             =========================================""");

        // 1. Una tabla con for
        int numero = 7;
        System.out.println("\n--- Tabla del " + numero + " (for) ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 2. Una tabla con while
        System.out.println("\n--- Tabla del 3 (while) ---");
        int j = 1;
        while (j <= 10) {
            System.out.println("3 x " + j + " = " + (3 * j));
            j++;
        }

        // 3. Tabla en orden inverso
        System.out.println("\n--- Tabla del 4 al revés ---");
        for (int i = 10; i >= 1; i--) {
            System.out.println("4 x " + i + " = " + (4 * i));
        }

        // 4. Todas las tablas del 1 al 10 (ciclos anidados)
        System.out.println("\n--- Todas las tablas del 1 al 3 ---");
        for (int t = 1; t <= 3; t++) {
            System.out.println("Tabla del " + t);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("  %2d x %2d = %3d%n", t, i, t * i);
            }
        }

        // 5. Matriz de multiplicación (tabla pitagórica 10 x 10)
        System.out.println("\n--- Tabla pitagórica ---");
        System.out.print("     ");
        for (int c = 1; c <= 10; c++) {
            System.out.printf("%4d", c);
        }
        System.out.println("\n     " + "-".repeat(40));
        for (int fila = 1; fila <= 10; fila++) {
            System.out.printf("%3d |", fila);
            for (int c = 1; c <= 10; c++) {
                System.out.printf("%4d", fila * c);
            }
            System.out.println();
        }

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: TABLAS DE MULTIPLICAR           ║
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
 - Lección   : Tablas de multiplicar      
*/
// ============================================================================//
// ============================================================================//
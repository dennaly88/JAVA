//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Factoriales      
*/
// ============================================================================//
// ============================================================================//

public class CJ29_Factoriales {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t FACTORIALES EN JAVA
                             =========================================""");

        
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("\n" + n + "! = " + factorial);

    
        System.out.print("\n" + n + "! = ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + (i > 1 ? " x " : ""));
        }
        System.out.println(" = " + factorial);

        
        int m = 7;
        long fact = 1;
        int contador = m;
        while (contador > 1) {
            fact *= contador;
            contador--;
        }
        System.out.println("\n" + m + "! (con while) = " + fact);

        
        System.out.println("\n--- Factoriales del 0 al 15 ---");
        long f = 1;
        for (int i = 0; i <= 15; i++) {
            if (i > 0) {
                f *= i;
            }
            System.out.printf("%2d! = %d%n", i, f);
        }

        
        System.out.println("\nEl mayor factorial que cabe en long es 20!");
        long grande = 1;
        for (int i = 1; i <= 20; i++) {
            grande *= i;
        }
        System.out.println("20! = " + grande);

        
        int total = 10, elegidos = 3;
        long f1 = 1, f2 = 1, f3 = 1;
        for (int i = 1; i <= total; i++) f1 *= i;
        for (int i = 1; i <= elegidos; i++) f2 *= i;
        for (int i = 1; i <= total - elegidos; i++) f3 *= i;
        System.out.println("\nCombinaciones C(10, 3) = " + (f1 / (f2 * f3)));

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: FACTORIALES                     ║
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
 - Lección   : Factoriales      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Números primos      
*/
// ============================================================================//
// ============================================================================//

public class CJ28_NumerosPrimos {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t NÚMEROS PRIMOS EN JAVA
                             =========================================""");

        
        int numero = 29;
        boolean esPrimo = numero > 1;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println("\n¿" + numero + " es primo? " + esPrimo);

    
        System.out.println("\n--- Primos del 1 al 50 ---");
        int cantidad = 0;
        for (int n = 2; n <= 50; n++) {
            boolean primo = true;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(n + " ");
                cantidad++;
            }
        }
        System.out.println("\nTotal de primos: " + cantidad);


        System.out.println("\n--- Primos gemelos hasta 50 ---");
        int anterior = 2;
        for (int n = 3; n <= 50; n++) {
            boolean primo = true;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                if (n - anterior == 2) {
                    System.out.println("(" + anterior + ", " + n + ")");
                }
                anterior = n;
            }
        }

        
        int valor = 360;
        int resto = valor;
        System.out.print("\nFactores primos de " + valor + ": ");
        for (int f = 2; f <= resto; f++) {
            while (resto % f == 0) {
                System.out.print(f + " ");
                resto /= f;
            }
        }
        System.out.println();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: NÚMEROS PRIMOS                  ║
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
 - Lección   : Números primos      
*/
// ============================================================================//
// ============================================================================//
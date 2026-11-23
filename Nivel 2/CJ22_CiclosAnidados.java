//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ciclos anidados      
*/
// ============================================================================//
// ============================================================================//

public class CJ22_CiclosAnidados {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   CICLOS ANIDADOS EN JAVA
                             =========================================""");

        
        System.out.println("\n--- Filas y columnas ---");
        for (int fila = 1; fila <= 3; fila++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("[" + fila + "," + col + "] ");
            }
            System.out.println();
        }

        
        System.out.println("\n--- Tablas del 1 al 5 ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        
        System.out.println("\n--- Triángulo ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4. Triángulo invertido de números
        System.out.println("\n--- Triángulo invertido ---");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    
        System.out.println("\n--- Pirámide ---");
        int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int espacio = 1; espacio <= altura - i; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 1; estrella <= 2 * i - 1; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }

    
        System.out.println("\n--- break con etiqueta ---");
        externo:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j == 12) {
                    System.out.println("Encontrado: " + i + " x " + j + " = 12");
                    break externo;
                }
            }
        }

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN DE LA LECCIÓN: CICLOS ANIDADOS   ║
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
 - Lección   : Ciclos anidados      
*/
// ============================================================================//
// ============================================================================//

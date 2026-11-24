//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Números pares e impares      
*/
// ============================================================================//
// ============================================================================//

public class CJ27_ParesImpares {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t NÚMEROS PARES E IMPARES
                             =========================================""");

        
        int numero = 27;
        System.out.println("\nEl número " + numero + " es " + (numero % 2 == 0 ? "PAR" : "IMPAR"));

        
        System.out.println("\n--- Del 1 al 20 ---");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }


        int cantidadPares = 0, cantidadImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                cantidadPares++;
                sumaPares += i;
            } else {
                cantidadImpares++;
                sumaImpares += i;
            }
        }

        System.out.println("\n--- Del 1 al 100 ---");
        System.out.println("Cantidad de pares:   " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Suma de pares:       " + sumaPares);
        System.out.println("Suma de impares:     " + sumaImpares);

        
        System.out.println("\n--- Pares del 2 al 30 ---");
        for (int i = 2; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

    
        System.out.println("\n--- Impares del 1 al 29 ---");
        for (int i = 1; i <= 29; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: PARES E IMPARES                 ║
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
 - Lección   : Números pares e impares      
*/
// ============================================================================//
// ============================================================================//

//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : break y continue      
*/
// ============================================================================//
// ============================================================================//

public class CJ21_BreakContinue {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   BREAK Y CONTINUE EN JAVA
                             =========================================""");

        
        System.out.println("\n--- break: se detiene al llegar a 5 ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

    
        System.out.println("\n--- continue: salta el 5 ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("\n--- Solo números impares ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

    
        int encontrado = -1;
        for (int i = 51; i <= 100; i++) {
            if (i % 7 == 0) {
                encontrado = i;
                break;
            }
        }
        System.out.println("\nPrimer múltiplo de 7 mayor que 50: " + encontrado);

        int n = 1;
        while (true) {
            if (n * n > 50) {
                break;
            }
            n++;
        }
        System.out.println("Primer número cuyo cuadrado supera 50: " + n);

    
        String texto = "PROGRAMACION";
        char buscada = 'G';
        int posicion = -1;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == buscada) {
                posicion = i;
                break;
            }
        }
        System.out.println("La letra '" + buscada + "' está en la posición: " + posicion);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN DE LA LECCIÓN: BREAK Y CONTINUE  ║
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
 - Lección   : break y continue      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Series numéricas      
*/
// ============================================================================//
// ============================================================================//

public class CJ30_SeriesNumericas {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t SERIES NUMÉRICAS EN JAVA
                             =========================================""");

        
        System.out.println("\n--- Fibonacci (12 términos) ---");
        long a = 0, b = 1;
        for (int i = 1; i <= 12; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();

       
        System.out.println("\n--- Potencias de 2 ---");
        for (int i = 0; i <= 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();

       
        System.out.println("\n--- Cuadrados perfectos ---");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();

     
        System.out.println("\n--- Números triangulares ---");
        int triangular = 0;
        for (int i = 1; i <= 10; i++) {
            triangular += i;
            System.out.print(triangular + " ");
        }
        System.out.println();

       
        System.out.println("\n--- Serie alternada hasta 10 ---");
        int alternada = 0;
        for (int i = 1; i <= 10; i++) {
            alternada += (i % 2 == 0) ? -i : i;
        }
        System.out.println("1 - 2 + 3 - 4 + ... - 10 = " + alternada);

     
        double armonica = 0;
        for (int i = 1; i <= 10; i++) {
            armonica += 1.0 / i;
        }
        System.out.printf("%nSerie armónica (10 términos): %.4f%n", armonica);

        
        System.out.println("\n--- Progresión aritmética (inicio 5, razón 3) ---");
        for (int i = 0, t = 5; i < 8; i++, t += 3) {
            System.out.print(t + " ");
        }
        System.out.println("\n\n--- Progresión geométrica (inicio 2, razón 3) ---");
        for (int i = 0, t = 2; i < 8; i++, t *= 3) {
            System.out.print(t + " ");
        }
        System.out.println();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: SERIES NUMÉRICAS                ║
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
 - Lección   : Series numéricas      
*/
// ============================================================================//
// ============================================================================//
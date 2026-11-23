//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ciclo for      
*/
// ============================================================================//
// ============================================================================//

public class CJ18_CicloFor {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   CICLO FOR EN JAVA
                             =========================================""");

        
        System.out.println("\n--- Contar del 1 al 5 ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

    
        System.out.println("\n--- Cuenta regresiva ---");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue!");

    
        System.out.println("\n--- Números pares del 2 al 10 ---");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("\nSuma del 1 al 100: " + suma);

    
        String curso = "JAVA";
        System.out.println("\n--- Letras de " + curso + " ---");
        for (int i = 0; i < curso.length(); i++) {
            System.out.println("Posición " + i + ": " + curso.charAt(i));
        }

        
        int numero = 5;
        System.out.println("\n--- Tabla del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN DE LA LECCIÓN: CICLO FOR         ║
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
 - Lección   : Ciclo for      
*/
// ============================================================================//
// ============================================================================//

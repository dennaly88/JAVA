//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ciclo do-while      
*/
// ============================================================================//
// ============================================================================//

import java.util.Scanner;

public class CJ20_CicloDoWhile {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   CICLO DO-WHILE EN JAVA
                             =========================================""");

        System.out.println("\n--- Contar del 1 al 5 ---");
        int i = 1;
        do {
            System.out.println("Vuelta: " + i);
            i++;
        } while (i <= 5);

        int x = 10;
        do {
            System.out.println("\nSe ejecuta una vez aunque x = " + x + " no cumple x < 5");
        } while (x < 5);

    
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""

                    ╔═══════════════════════════════════════╗
                    ║  MENÚ                                 ║
                    ╚═══════════════════════════════════════╝
                    1. Saludar
                    2. Mostrar curso
                    3. Salir""");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("¡Hola, bienvenido al curso!");
                case 2 -> System.out.println("Curso de JAVA 2026 ♨️");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 3);

        
        int nota;
        do {
            System.out.print("\nIngresa una nota entre 0 y 20: ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 20) {
                System.out.println("Nota inválida, intenta de nuevo.");
            }
        } while (nota < 0 || nota > 20);
        System.out.println("Nota registrada: " + nota);

        sc.close();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN DE LA LECCIÓN: CICLO DO-WHILE    ║
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
 - Lección   : Ciclo do-while      
*/
// ============================================================================//
// ============================================================================//

//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Menús interactivos      
*/
// ============================================================================//
// ============================================================================//

import java.util.Scanner;

public class CJ33_MenusInteractivos {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t MENÚS INTERACTIVOS EN JAVA
                             =========================================""");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""

                    ╔═══════════════════════════════════════╗
                    ║  CALCULADORA                          ║
                    ╚═══════════════════════════════════════╝
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Potencia
                    6. Salir""");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Error: escribe un número del 1 al 6.");
                sc.next();
                opcion = 0;
                continue;
            }
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Primer número: ");
                double x = sc.nextDouble();
                System.out.print("Segundo número: ");
                double y = sc.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (x + y));
                    case 2 -> System.out.println("Resultado: " + (x - y));
                    case 3 -> System.out.println("Resultado: " + (x * y));
                    case 4 -> {
                        if (y == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + (x / y));
                        }
                    }
                    case 5 -> System.out.println("Resultado: " + Math.pow(x, y));
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 6);

        sc.close();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MENÚS INTERACTIVOS              ║
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
 - Lección   : Menús interactivos      
*/
// ============================================================================//
// ============================================================================//
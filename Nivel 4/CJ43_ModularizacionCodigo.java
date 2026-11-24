//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Modularización del código      
*/
// ============================================================================//
// ============================================================================//

import java.util.Locale;
import java.util.Scanner;

public class CJ43_ModularizacionCodigo {

    
    static double nota1, nota2, nota3;
    static boolean notasRegistradas = false;

    
    static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Error: escribe un número entero.");
            sc.next();
        }
    }

    static double leerDecimal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            }
            System.out.println("Error: escribe un número válido.");
            sc.next();
        }
    }

    static double leerNota(Scanner sc, String mensaje) {
        double nota;
        do {
            nota = leerDecimal(sc, mensaje);
            if (!esNotaValida(nota)) {
                System.out.println("La nota debe estar entre 0 y 20.");
            }
        } while (!esNotaValida(nota));
        return nota;
    }

    
    static boolean esNotaValida(double nota) {
        return nota >= 0 && nota <= 20;
    }

    static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String clasificar(double promedio) {
        if (promedio >= 18) return "Excelente";
        if (promedio >= 15) return "Bueno";
        if (promedio >= 10) return "Regular";
        return "Deficiente";
    }

    static double celsiusAFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    // ---------------- Salida de datos ----------------
    static void mostrarBanner() {
        System.out.println("""
                            =========================================
                             \t   MODULARIZACIÓN DEL CÓDIGO
                             =========================================""");
    }

    static void mostrarMenu() {
        System.out.println("""

                ╔═══════════════════════════════════════╗
                ║  SISTEMA DE NOTAS                     ║
                ╚═══════════════════════════════════════╝
                1. Registrar 3 notas
                2. Ver promedio y clasificación
                3. Convertir °C a °F
                4. Salir""");
    }

    static void mostrarResultado(double promedio) {
        System.out.printf("Notas: %.1f | %.1f | %.1f%n", nota1, nota2, nota3);
        System.out.printf("Promedio: %.2f -> %s%n", promedio, clasificar(promedio));
        System.out.println(promedio >= 10 ? "Estado: APROBADO" : "Estado: REPROBADO");
    }

    
    static void opcionRegistrar(Scanner sc) {
        nota1 = leerNota(sc, "Nota 1: ");
        nota2 = leerNota(sc, "Nota 2: ");
        nota3 = leerNota(sc, "Nota 3: ");
        notasRegistradas = true;
        System.out.println("Notas registradas correctamente.");
    }

    static void opcionPromedio() {
        if (!notasRegistradas) {
            System.out.println("Primero debes registrar las notas (opción 1).");
            return;
        }
        mostrarResultado(calcularPromedio(nota1, nota2, nota3));
    }

    static void opcionTemperatura(Scanner sc) {
        double c = leerDecimal(sc, "Temperatura en °C: ");
        System.out.printf("%.1f °C = %.1f °F%n", c, celsiusAFahrenheit(c));
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        mostrarBanner();

        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero(sc, "Elige una opción: ");

            switch (opcion) {
                case 1 -> opcionRegistrar(sc);
                case 2 -> opcionPromedio();
                case 3 -> opcionTemperatura(sc);
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MODULARIZACIÓN DEL CÓDIGO       ║
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
 - Lección   : Modularización del código      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Validaciones      
*/
// ============================================================================//
// ============================================================================//

import java.util.Scanner;

public class CJ32_Validaciones {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t VALIDACIONES EN JAVA
                             =========================================""");

        Scanner sc = new Scanner(System.in);

        int edad;
        while (true) {
            System.out.print("\nIngresa tu edad (1-120): ");
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                if (edad >= 1 && edad <= 120) {
                    break;
                }
                System.out.println("Error: la edad debe estar entre 1 y 120.");
            } else {
                System.out.println("Error: debes escribir un número entero.");
                sc.next(); // descarta el texto incorrecto
            }
        }
        System.out.println("Edad válida: " + edad);
        sc.nextLine(); // limpia el salto de línea pendiente

        // 2. Validar texto no vacío
        String nombre;
        do {
            System.out.print("\nIngresa tu nombre: ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("Error: el nombre no puede estar vacío.");
            }
        } while (nombre.isEmpty());
        System.out.println("Nombre válido: " + nombre);

        // 3. Validar correo (reglas simples)
        String correo;
        boolean correoValido;
        do {
            System.out.print("\nIngresa tu correo: ");
            correo = sc.nextLine().trim();
            correoValido = correo.contains("@") && correo.indexOf('@') > 0
                    && correo.indexOf('.', correo.indexOf('@')) > correo.indexOf('@') + 1;
            if (!correoValido) {
                System.out.println("Error: formato de correo inválido.");
            }
        } while (!correoValido);
        System.out.println("Correo válido: " + correo);

        // 4. Validar contraseña con 3 intentos
        String claveCorrecta = "Java2026";
        int intentos = 3;
        boolean acceso = false;
        while (intentos > 0) {
            System.out.print("\nContraseña (intentos restantes " + intentos + "): ");
            String clave = sc.nextLine();
            if (clave.equals(claveCorrecta)) {
                acceso = true;
                break;
            }
            intentos--;
            System.out.println("Contraseña incorrecta.");
        }
        System.out.println(acceso ? "ACCESO CONCEDIDO" : "ACCESO BLOQUEADO");

        sc.close();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: VALIDACIONES                    ║
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
 - Lección   : Validaciones      
*/
// ============================================================================//
// ============================================================================//
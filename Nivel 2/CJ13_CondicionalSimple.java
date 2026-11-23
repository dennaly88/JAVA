
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Condicional Simple (IF) 
*/
// ============================================================================//
// ============================================================================//


import java.util.Scanner;

public class CJ13_CondicionalSimple {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                            =========================================
                             \t    CONDICIONAL SIMPLE (IF)
                             =========================================""");

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  VERIFICACIÓN DE DESCUENTO            ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);

        System.out.print("Ingrese el monto total de su compra ($): ");
        double montoCompra = teclado.nextDouble();

        if (montoCompra > 100.00) {
            System.out.println("¡Felicidades! Por superar los $100 obtienes ENVÍO GRATIS.");
        }

        System.out.println("Gracias por su compra. Fin del proceso.");
        teclado.close();
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
 - Lección   : Condicional Simple (IF) 
*/
// ============================================================================//
// ============================================================================//
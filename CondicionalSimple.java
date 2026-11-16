/* <!--------------------------------------------------------------------------------------------------------|

|------------------------------------------------------------------------------------------------------------|
| @Author   :  DANNY JOSE JIMENEZ GUTIERREZ                                                                  |
| CEDULA    :  16.029.567                                                                                    |
| TELEFONO  :  0424-281-44-55                                                                                |
| CORREO    :  DENNALY88@GMAIL.COM                                                                           |
|------------------------------------------------------------------------------------------------------------|
|  CURSO    : CURSO DE JAVA                                                                                  |
|  DESARROLLADOR WEB                                                                                         |
|  MIRANDA , CUA  2026                                                                                       |
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/

import java.util.Scanner;

public class CondicionalSimple {
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

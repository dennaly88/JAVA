
/*----------------------------------------------------------------------------------------------------------------
| @Author   : DANNY JOSE JIMENEZ GUTIERREZ
| CEDULA    : 16.029.567
| TELEFONO  : 0424-281-44-55
| CORREO    : DENNALY88@GMAIL.COM
|----------------------------------------------------------------------------------------------------------------
| CURSO     : CURSO DE JAVA
| DESARROLLADOR WEB
| MIRANDA, CUA 2026
----------------------------------------------------------------------------------------------------------------*/

/*
 * CONDICIONAL DOBLE IF-ELSE
 *
 * Permite evaluar una condición y ejecutar un bloque
 * cuando es verdadera (if) y otro cuando es falsa (else).
 *
 */

import java.util.Scanner;

public class CondicionalDobleIfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                =========================================
                    CONDICIONAL DOBLE IF-ELSE
                =========================================
                """);

        // Entrada de datos
        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {

            System.out.println("\nEl número " + numero + " es PAR.");

        } else {

            System.out.println("\nEl número " + numero + " es IMPAR.");

        }

        System.out.println("\n=========================================");
        System.out.println("          FIN DEL PROGRAMA");
        System.out.println("=========================================");

        entrada.close();
    }
}

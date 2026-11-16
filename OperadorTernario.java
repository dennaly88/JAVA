

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
 * OPERADOR TERNARIO
 *
 * Es una forma abreviada de escribir una condición if-else.
 *
 * Sintaxis:
 *
 * variable = (condicion) ? valorVerdadero : valorFalso;
 *
 */

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                =========================================
                       OPERADOR TERNARIO
                =========================================
                """);

  
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

       
        String resultado = (edad >= 18)
                ? "MAYOR DE EDAD"
                : "MENOR DE EDAD";

        String acceso = (edad >= 18)
                ? "ACCESO PERMITIDO"
                : "ACCESO DENEGADO";

     
        System.out.println("\n=========================================");
        System.out.println("              RESULTADO");
        System.out.println("=========================================");
        System.out.println("Edad ingresada: " + edad);
        System.out.println("Clasificación: " + resultado);
        System.out.println("Estado: " + acceso);

        entrada.close();
    }
}

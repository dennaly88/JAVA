
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
|  TEMA  :   Condicional Múltiple ELSE-IF                                                                    | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/



import java.util.Scanner;

public class CJ14_CondicionalMultipleElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                =========================================
                   CONDICIONAL MULTIPLE ELSE-IF
                =========================================
                """);

        System.out.print("Ingrese la nota del estudiante (0-20): ");
        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 20) {

            System.out.println("ERROR: La nota debe estar entre 0 y 20.");

        } else if (nota >= 18) {

            System.out.println("Clasificación: EXCELENTE.");

        } else if (nota >= 15) {

            System.out.println("Clasificación: MUY BUENO.");

        } else if (nota >= 10) {

            System.out.println("Clasificación: APROBADO.");

        } else {

            System.out.println("Clasificación: REPROBADO.");

        }

        System.out.println("\nNota registrada: " + nota);

        entrada.close();
    }
}

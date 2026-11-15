
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

public class SumarNumeros {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Ingrese el primer numero: ");
            double numero1 = entrada.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            double numero2 = entrada.nextDouble();

            double suma = numero1 + numero2;

            System.out.println("La suma es: " + suma);
        }
    }
}

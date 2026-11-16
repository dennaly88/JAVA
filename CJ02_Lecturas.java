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
|  TEMA  :   Lecturas                                                                                        | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/


import java.util.Scanner;

public class CJ02_Lecturas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


          String mensajeS = """
                ╔═══════════════════════════════════════╗
                ║           INGRESE LOS DATOS           ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensajeS);

        System.out.print("Ingresa tu nombre completo: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingresa tu estatura en metros (ej. 1,75): ");
        double estatura = teclado.nextDouble();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = teclado.nextBoolean();




         String mensaje = """
                ╔═══════════════════════════════════════╗
                ║           DATOS REGISTRADOS           ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
    


        System.out.printf("Nombre:     %s%n", nombre);
        System.out.printf("Edad:       %d años%n", edad);
        System.out.printf("Estatura:   %.2f m%n", estatura);
        System.out.printf("Estudiante: %b%n", esEstudiante);

        teclado.close();
    }
}


//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Switch 
*/
// ============================================================================//
// ============================================================================//


import java.util.Scanner;

public class CJ16_Switch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                =========================================
                       SISTEMA DE OPERACIONES
                =========================================
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                =========================================
                """);

       
        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("\n=========================================");

        
        switch (opcion) {

            case 1:
                System.out.println("Operación: SUMA");
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Operación: RESTA");
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Operación: MULTIPLICACIÓN");
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 != 0) {
                    System.out.println("Operación: DIVISIÓN");
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("ERROR: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("ERROR: Opción no válida.");

        }

        System.out.println("=========================================");

        entrada.close();
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
 - Lección   : Switch 
*/
// ============================================================================//
// ============================================================================//
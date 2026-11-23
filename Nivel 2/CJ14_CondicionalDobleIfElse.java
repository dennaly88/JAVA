
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Condicional Doble (IF-ELSE)
*/
// ============================================================================//
// ============================================================================//

import java.util.Scanner;

public class CJ14_CondicionalDobleIfElse {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                =========================================
                    CONDICIONAL DOBLE IF-ELSE
                =========================================
                """);

    
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
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Condicional Doble (IF-ELSE)
*/
// ============================================================================//
// ============================================================================//
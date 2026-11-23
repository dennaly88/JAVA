
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operador Ternario 
*/
// ============================================================================//
// ============================================================================//


import java.util.Scanner;

public class CJ17_OperadorTernario {

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

//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operador Ternario 
*/
// ============================================================================//
// ============================================================================//
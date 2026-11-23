
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Estructura de un Programa en Java      
*/
// ============================================================================//
// ============================================================================//


import java.util.Scanner; 


public class CJ04_Estructura {

   
    public static void main(String[] args) {
        
        
        String nombreUsuario = "";
        

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("=========================================");
        System.out.println("   ¡Bienvenido al programa básico en Java! ");
        System.out.println("=========================================");
        System.out.print("Por favor, ingresa tu nombre: ");
        
     
        nombreUsuario = scanner.nextLine();
        
        
        saludarUsuario(nombreUsuario);
        
      
        scanner.close();
    }

  
    public static void saludarUsuario(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println("¡Hola, " + nombre + "!");
        } else {
            System.out.println("¡Hola, invitado misterioso!");
        }
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
 - Lección   : Estructura de un Programa en Java      
*/
// ============================================================================//
// ============================================================================//
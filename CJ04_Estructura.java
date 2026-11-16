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
|  TEMA  :   Estructura de un Programa en Java                                                               | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/





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

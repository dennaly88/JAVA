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

public class Variables {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   VARIABLES EN JAVA
                             =========================================""");

        
        String estudiante = "DANNY JOSE JIMENEZ GUTIERREZ";
        int moduloActual = 1;
        double notaExamen = 18.5;

        System.out.println("Estudiante: " + estudiante);
        System.out.println("Módulo inicial: " + moduloActual);
        System.out.println("Nota inicial: " + notaExamen);

        
        moduloActual = 5;
        notaExamen = 20.0;

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  DATOS ACTUALIZADOS                   ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("Módulo actualizado: " + moduloActual);
        System.out.println("Nota final: " + notaExamen);
    }
}

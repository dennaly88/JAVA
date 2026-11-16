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
|  TEMA  :   Constantes en Java                                                                              | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/

public class CJ06_Constantes {
    public static void main(String[] args) {
       
        System.out.println("""
        =========================================
            \t   CONSTANTES EN JAVA
        =========================================""");

        
        final String INSTITUCION = "CURSO DE JAVA - MIRANDA, CÚA";
        final int ANIO_CURSO = 2026;
        final double PORCENTAJE_IVA = 0.16;

      

        double precioBase = 100.0;
        double totalConIva = precioBase + (precioBase * PORCENTAJE_IVA);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  VALORES FIJOS DEL SISTEMA            ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("Sede: " + INSTITUCION);
        System.out.println("Año lectivo: " + ANIO_CURSO);
        System.out.println("Total calculado con IVA (16%): " + totalConIva);
    }
}


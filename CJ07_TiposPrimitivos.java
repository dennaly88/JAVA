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
|  TEMA  :   Tipos Primitivos                                                                                | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/



public class CJ07_TiposPrimitivos {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   TIPOS DE DATOS PRIMITIVOS
                             =========================================""");

       
        byte edad = 38;                     // 8 bits (-128 a 127)
        short anio = 2026;                  // 16 bits
        int cedula = 16029567;              // 32 bits (el más usado)
        long telefono = 4242814455L;        // 64 bits (requiere 'L' al final)

      
        float promedio = 19.75f;            // 32 bits (requiere 'f' al final)
        double saldo = 1540.8599;           // 64 bits (mayor precisión)

      
        char inicial = 'D';                 // Un solo carácter en comillas simples
        boolean esDesarrollador = true;     // Solo admite true o false

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  LOS 8 TIPOS PRIMITIVOS EN JAVA       ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("byte    : " + edad);
        System.out.println("short   : " + anio);
        System.out.println("int     : " + cedula);
        System.out.println("long    : " + telefono);
        System.out.println("float   : " + promedio);
        System.out.println("double  : " + saldo);
        System.out.println("char    : " + inicial);
        System.out.println("boolean : " + esDesarrollador);
    }
}

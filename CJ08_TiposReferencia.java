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
|  TEMA  :   Tipos de Referencia                                                                             | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/

import java.util.Arrays;

public class CJ08_TiposReferencia {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   TIPOS DE DATOS DE REFERENCIA
                             =========================================""");

        // 1. String (Cadena de texto - es una Clase)
        String nombreCompleto = "DANNY JOSE JIMENEZ GUTIERREZ";
        String ubicacion = new String("Miranda, Cúa");

        // 2. Arreglos (Arrays)
        String[] tecnologias = {"HTML", "CSS", "JavaScript", "Java"};

        // 3. Clases Envoltorio (Wrappers de primitivos)
        Integer nivelCurso = 8;
        Double calificacion = 20.0;

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  OBJETOS Y ARREGLOS EN MEMORIA        ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("String (Nombre)   : " + nombreCompleto);
        System.out.println("String (Ubicación): " + ubicacion);
        System.out.println("Array (Stack)     : " + Arrays.toString(tecnologias));
        System.out.println("Wrapper Integer   : " + nivelCurso);
        System.out.println("Wrapper Double    : " + calificacion);
    }
}

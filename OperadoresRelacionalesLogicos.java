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

public class OperadoresRelacionalesLogicos {
    public static void main(String[] args) {
        /* 
           Los operadores relacionales comparan dos valores y devuelven un booleano.
           Los operadores lógicos combinan expresiones booleanas (AND, OR, NOT).
        */
        System.out.println("""
                            =========================================
                             \t   OPERADORES RELACIONALES Y LÓGICOS
                             =========================================""");

        int nota = 18;
        int asistencias = 90;
        boolean proyectoEntregado = true;

        String bannerRelacionales = """
                ╔═══════════════════════════════════════╗
                ║  1. OPERADORES RELACIONALES           ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(bannerRelacionales);
        System.out.println("¿Nota igual a 20? (==)       : " + (nota == 20));
        System.out.println("¿Nota diferente de 10? (!=)  : " + (nota != 10));
        System.out.println("¿Nota mayor o igual a 15?(>=): " + (nota >= 15));
        System.out.println("¿Asistencias menor a 80? (<) : " + (asistencias < 80));

        String bannerLogicos = """
                ╔═══════════════════════════════════════╗
                ║  2. OPERADORES LÓGICOS                ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(bannerLogicos);
        // AND (&&): Ambas condiciones deben ser verdaderas
        boolean apruebaCurso = (nota >= 15) && (asistencias >= 80);
        // OR (||): Al menos una condición debe ser verdadera
        boolean tieneMencion = (nota == 20) || proyectoEntregado;
        // NOT (!): Invierte el valor lógico
        boolean reprobado = !apruebaCurso;

        System.out.println("¿Aprueba curso? (AND &&)     : " + apruebaCurso);
        System.out.println("¿Tiene mención? (OR ||)      : " + tieneMencion);
        System.out.println("¿Está reprobado? (NOT !)     : " + reprobado);
    }
}


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
|  TEMA  :   Operadores Aritméticos                                                                          | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/


public class CJ09_OperadoresAritmeticos {
    public static void main(String[] args) {
        
        System.out.println("""
                            =========================================
                             \t   OPERADORES ARITMÉTICOS
                             =========================================""");

        int num1 = 20;
        int num2 = 6;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int divisionEntera = num1 / num2;
        int modulo = num1 % num2; // Resto de la división

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  RESULTADOS MATEMÁTICOS (20 y 6)      ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("Suma (+)             : " + suma);
        System.out.println("Resta (-)            : " + resta);
        System.out.println("Multiplicación (*)   : " + multiplicacion);
        System.out.println("División entera (/)  : " + divisionEntera);
        System.out.println("Módulo / Resto (%)   : " + modulo);

        // Operadores unarios (incremento y decremento)
        int contador = 10;
        contador++; // Equivale a contador = contador + 1
        System.out.println("Incremento (10++)    : " + contador);
        contador--; // Equivale a contador = contador - 1
        System.out.println("Decremento (11--)    : " + contador);
    }
}

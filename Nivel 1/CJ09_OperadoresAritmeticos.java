
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operadores Aritméticos   
*/
// ============================================================================//
// ============================================================================//

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
        int modulo = num1 % num2; 

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

        
        int contador = 10;
        contador++; 
        System.out.println("Incremento (10++)    : " + contador);
        contador--; 
        System.out.println("Decremento (11--)    : " + contador);
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
 - Lección   : Operadores Aritméticos   
*/
// ============================================================================//
// ============================================================================//
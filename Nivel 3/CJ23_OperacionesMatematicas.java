
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operaciones matemáticas      
*/
// ============================================================================//
// ============================================================================//

public class CJ23_OperacionesMatematicas {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t OPERACIONES MATEMÁTICAS EN JAVA
                             =========================================""");

        int a = 17;
        int b = 5;

        System.out.println("\n--- Operaciones básicas (a = 17, b = 5) ---");
        System.out.println("Suma:             " + (a + b));
        System.out.println("Resta:            " + (a - b));
        System.out.println("Multiplicación:   " + (a * b));
        System.out.println("División entera:  " + (a / b));
        System.out.println("División decimal: " + ((double) a / b));
        System.out.println("Residuo (módulo): " + (a % b));

        System.out.println("\n--- Clase Math ---");
        System.out.println("Potencia 2^10:      " + Math.pow(2, 10));
        System.out.println("Raíz cuadrada de 144: " + Math.sqrt(144));
        System.out.println("Raíz cúbica de 27:    " + Math.cbrt(27));
        System.out.println("Valor absoluto -25:   " + Math.abs(-25));
        System.out.println("Máximo entre 8 y 12:  " + Math.max(8, 12));
        System.out.println("Mínimo entre 8 y 12:  " + Math.min(8, 12));
        System.out.println("Hipotenusa (3, 4):    " + Math.hypot(3, 4));

        System.out.println("\n--- Redondeos con 7.45 ---");
        double valor = 7.45;
        System.out.println("round: " + Math.round(valor));
        System.out.println("ceil:  " + Math.ceil(valor));
        System.out.println("floor: " + Math.floor(valor));

        System.out.println("\n--- Número aleatorio del 1 al 10 ---");
        int aleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Número: " + aleatorio);

        System.out.println("\n--- Precedencia de operadores ---");
        System.out.println("2 + 3 * 4     = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4   = " + ((2 + 3) * 4));

        System.out.println("\n--- Incremento y decremento ---");
        int n = 10;
        n++;
        System.out.println("n++ -> " + n);
        n--;
        n -= 3;
        n *= 2;
        System.out.println("después de n--, n -= 3, n *= 2 -> " + n);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: OPERACIONES MATEMÁTICAS         ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
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
 - Lección   : Operaciones matemáticas      
*/
// ============================================================================//
// ============================================================================//
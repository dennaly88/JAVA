//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Sobrecarga de métodos      
*/
// ============================================================================//
// ============================================================================//

public class CJ39_SobrecargaMetodos {

 
    public static int sumar(int a, int b) {
        System.out.print("[SUMA DE DOS ENTEROS] ");
        return a + b;
    }

    public static double sumar(double a, double b) {
        System.out.print("[SUMA DE DOS DECIMALES] ");
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        System.out.print("[SUMA DE TRES ENTEROS] ");
        return a + b + c;
    }

    public static String sumar(String a, String b) {
        System.out.print("[SUMA DE DOS CADENAS] ");
        return a + b;
    }

    
    public static double area(double radio) {
        return Math.PI * radio * radio; 
    }

    public static double area(double base, double altura) {
        return base * altura; 
    }

    public static double area(double ladoA, double ladoB, double ladoC) {
        double s = (ladoA + ladoB + ladoC) / 2; 
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public static void imprimir(int valor) {
        System.out.println("Entero: " + valor);
    }

    public static void imprimir(double valor) {
        System.out.println("Decimal: " + valor);
    }

    public static void imprimir(String valor) {
        System.out.println("Texto: " + valor);
    }

    public static void imprimir(char valor) {
        System.out.println("Carácter: " + valor);
    }

    public static void imprimir(boolean valor) {
        System.out.println("Booleano: " + valor);
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   SOBRECARGA DE MÉTODOS
                             =========================================""");

    
        System.out.println(sumar(3, 4));
        System.out.println(sumar(2.5, 3.5));
        System.out.println(sumar(1, 2, 3));
        System.out.println(sumar("Hola ", "Java"));

        
        System.out.println(sumar(5, 2.5));

        System.out.println();
        System.out.printf("Área círculo (r=3):          %.2f%n", area(3));
        System.out.printf("Área rectángulo (4 x 5):     %.2f%n", area(4, 5));
        System.out.printf("Área triángulo (3, 4, 5):    %.2f%n", area(3, 4, 5));

        System.out.println();
        imprimir(42);
        imprimir(3.14);
        imprimir("Java");
        imprimir('J');
        imprimir(true);

        
        System.out.println("\nprintln(int), println(double), println(String)... son sobrecargas.");

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: SOBRECARGA DE MÉTODOS           ║
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
 - Lección   : Sobrecarga de métodos      
*/
// ============================================================================//
// ============================================================================//
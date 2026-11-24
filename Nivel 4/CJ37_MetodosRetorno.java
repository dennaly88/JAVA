//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Métodos con retorno      
*/
// ============================================================================//
// ============================================================================//

public class CJ37_MetodosRetorno {

    
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int mayorDeTres(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        return mayor;
    }

    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double promedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String clasificarNota(double nota) {
        if (nota >= 18) return "Excelente";
        if (nota >= 15) return "Bueno";
        if (nota >= 10) return "Regular";
        return "Deficiente";
    }


    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if ("aeiouAEIOU".indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   MÉTODOS CON RETORNO
                             =========================================""");

        
        int resultado = sumar(12, 30);
        System.out.println("sumar(12, 30) = " + resultado);
        System.out.println("dividir(10, 4) = " + dividir(10, 4));
        System.out.println("¿8 es par? " + esPar(8));
        System.out.println("¿7 es par? " + esPar(7));
        System.out.println("Mayor de 14, 92, 37: " + mayorDeTres(14, 92, 37));
        System.out.println("10! = " + factorial(10));

        double prom = promedio(18, 15.5, 20);
        System.out.printf("Promedio: %.2f -> %s%n", prom, clasificarNota(prom));

        System.out.println("¿29 es primo? " + esPrimo(29));
        System.out.println("¿30 es primo? " + esPrimo(30));
        System.out.println("Vocales en 'Programacion en Java': " + contarVocales("Programacion en Java"));
        System.out.println("25 °C = " + celsiusAFahrenheit(25) + " °F");

        
        System.out.println("\nsumar(sumar(1, 2), sumar(3, 4)) = " + sumar(sumar(1, 2), sumar(3, 4)));

        
        System.out.print("Primos del 1 al 30: ");
        for (int i = 1; i <= 30; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MÉTODOS CON RETORNO             ║
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
 - Lección   : Métodos con retorno      
*/
// ============================================================================//
// ============================================================================//
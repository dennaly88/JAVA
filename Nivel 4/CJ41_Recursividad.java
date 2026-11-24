//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Recursividad      
*/
// ============================================================================//
// ============================================================================//

public class CJ41_Recursividad {

    

    public static long factorial(int n) {
        if (n <= 1) {                 
            return 1;
        }
        return n * factorial(n - 1);  
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumaHasta(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaHasta(n - 1);
    }

    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static void cuentaRegresiva(int n) {
        if (n == 0) {
            System.out.println("¡Despegue!");
            return;
        }
        System.out.print(n + "... ");
        cuentaRegresiva(n - 1);
    }

    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static String invertir(String texto) {
        if (texto.length() <= 1) {
            return texto;
        }
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static boolean esPalindromo(String texto) {
        if (texto.length() <= 1) {
            return true;
        }
        if (texto.charAt(0) != texto.charAt(texto.length() - 1)) {
            return false;
        }
        return esPalindromo(texto.substring(1, texto.length() - 1));
    }

    
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public static String aBinario(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }
        return aBinario(n / 2) + (n % 2);
    }

    
    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        hanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   RECURSIVIDAD EN JAVA
                             =========================================""");

        System.out.println("factorial(6)    = " + factorial(6));
        System.out.println("sumaHasta(100)  = " + sumaHasta(100));
        System.out.println("potencia(2, 10) = " + potencia(2, 10));
        System.out.println("sumaDigitos(98765) = " + sumaDigitos(98765));
        System.out.println("mcd(48, 18)     = " + mcd(48, 18));
        System.out.println("12 en binario   = " + aBinario(12));

        System.out.print("\nFibonacci: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println();
        cuentaRegresiva(5);

        System.out.println("\ninvertir(\"JAVA\") = " + invertir("JAVA"));
        System.out.println("¿\"reconocer\" es palíndromo? " + esPalindromo("reconocer"));
        System.out.println("¿\"programa\" es palíndromo?  " + esPalindromo("programa"));

        System.out.println("\n--- Torres de Hanoi con 3 discos ---");
        hanoi(3, 'A', 'C', 'B');

       

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: RECURSIVIDAD                    ║
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
 - Lección   : Recursividad      
*/
// ============================================================================//
// ============================================================================//
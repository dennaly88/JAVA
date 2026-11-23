//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ciclo while      
*/
// ============================================================================//
// ============================================================================//

public class CJ19_CicloWhile {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   CICLO WHILE EN JAVA
                             =========================================""");

        
        System.out.println("\n--- Contar del 1 al 5 ---");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        
        System.out.println("\n--- Cuenta regresiva ---");
        int segundos = 3;
        while (segundos > 0) {
            System.out.println(segundos + "...");
            segundos--;
        }
        System.out.println("¡Listo!");

        
        int numero = 98765;
        int copia = numero;
        int digitos = 0;
        while (copia > 0) {
            copia /= 10;
            digitos++;
        }
        System.out.println("\nEl número " + numero + " tiene " + digitos + " dígitos");


        copia = numero;
        int sumaDigitos = 0;
        while (copia > 0) {
            sumaDigitos += copia % 10;
            copia /= 10;
        }
        System.out.println("Suma de sus dígitos: " + sumaDigitos);

        int valor = 10;
        while (valor < 5) {
            System.out.println("Esto nunca se imprime");
        }
        System.out.println("\nEl while no se ejecutó porque la condición era falsa");

    
        double ahorro = 0;
        double meta = 1000;
        int meses = 0;
        while (ahorro < meta) {
            ahorro += 150;
            meses++;
        }
        System.out.println("\nMeses para ahorrar " + meta + ": " + meses);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN DE LA LECCIÓN: CICLO WHILE       ║
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
 - Lección   : Ciclo while      
*/
// ============================================================================//
// ============================================================================//

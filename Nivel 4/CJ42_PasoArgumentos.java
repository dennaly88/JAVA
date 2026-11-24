//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Paso de argumentos      
*/
// ============================================================================//
// ============================================================================//

public class CJ42_PasoArgumentos {

  
    public static void incrementar(int n) {
        n++;
        System.out.println("  Dentro del método: n = " + n);
    }

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("  Dentro del método: a = " + a + ", b = " + b);
    }

    
    public static void cambiarTexto(String texto) {
        texto = texto + " MODIFICADO";
        System.out.println("  Dentro del método: " + texto);
    }

  
    public static void agregarTexto(StringBuilder sb) {
        sb.append(" MODIFICADO");
        System.out.println("  Dentro del método: " + sb);
    }

   
    public static void reasignar(StringBuilder sb) {
        sb = new StringBuilder("OBJETO NUEVO");
        System.out.println("  Dentro del método: " + sb);
    }

    
    public static int duplicar(int n) {
        return n * 2;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   PASO DE ARGUMENTOS
                             =========================================""");

        System.out.println("\n--- Primitivos (por valor) ---");
        int numero = 10;
        System.out.println("Antes: numero = " + numero);
        incrementar(numero);
        System.out.println("Después: numero = " + numero + "  (no cambió)");

        System.out.println("\n--- Intercambio fallido ---");
        int x = 1, y = 2;
        intercambiar(x, y);
        System.out.println("Fuera del método: x = " + x + ", y = " + y + "  (no se intercambiaron)");

        System.out.println("\n--- String (inmutable) ---");
        String curso = "JAVA";
        cambiarTexto(curso);
        System.out.println("Después: curso = " + curso + "  (no cambió)");

        System.out.println("\n--- StringBuilder (objeto mutable) ---");
        StringBuilder sb = new StringBuilder("JAVA");
        agregarTexto(sb);
        System.out.println("Después: sb = " + sb + "  (SÍ cambió)");

        System.out.println("\n--- Reasignar la referencia ---");
        StringBuilder otro = new StringBuilder("ORIGINAL");
        reasignar(otro);
        System.out.println("Después: otro = " + otro + "  (no cambió)");

        System.out.println("\n--- Devolver el resultado ---");
        numero = duplicar(numero);
        System.out.println("numero = duplicar(numero) -> " + numero);

      
        System.out.println("\n--- Argumentos de main ---");
        System.out.println("Cantidad recibida: " + args.length);
        for (String argumento : args) {
            System.out.println("  Argumento: " + argumento);
        }
       

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: PASO DE ARGUMENTOS              ║
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
 - Lección   : Paso de argumentos      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ámbito de variables      
*/
// ============================================================================//
// ============================================================================//

public class CJ40_AmbitoVariables {

    
    static int contadorLlamadas = 0;
    static String curso = "JAVA 2026";
    static final double IVA = 0.16;

    
    static int valor = 100;

    public static void registrarLlamada() {
        contadorLlamadas++; 
        System.out.println("Llamadas registradas: " + contadorLlamadas);
    }

    public static void metodoUno() {
        int local = 10;
        System.out.println("metodoUno -> local = " + local + " | curso = " + curso);
    }

    public static void metodoDos() {
        int local = 99; 
        System.out.println("metodoDos -> local = " + local);
        
    }


    public static int calcularTotal(double precio) {
        return (int) (precio + precio * IVA);
    }


    public static void mostrarSombreado() {
        int valor = 5;
        System.out.println("Local:  valor = " + valor);
        System.out.println("Clase:  valor = " + CJ40_AmbitoVariables.valor);
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   ÁMBITO DE VARIABLES
                             =========================================""");

        
        registrarLlamada();
        registrarLlamada();
        registrarLlamada();

        
        System.out.println();
        metodoUno();
        metodoDos();

        
        System.out.println();
        int edad = 20;
        if (edad >= 18) {
            String mensaje = "Mayor de edad";
            System.out.println(mensaje);
        }
       
        for (int i = 1; i <= 3; i++) {
            System.out.print("i = " + i + "  ");
        }
        System.out.println();
        

        
        int ultimo = 0;
        for (int j = 1; j <= 5; j++) {
            ultimo = j;
        }
        System.out.println("Último valor de j: " + ultimo);

        
        System.out.println();
        mostrarSombreado();

       
        System.out.println("\nPrecio 100 + IVA = " + calcularTotal(100));

      

        String mensajeFinal = """
                ╔═══════════════════════════════════════╗
                ║  FIN: ÁMBITO DE VARIABLES             ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensajeFinal);
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
 - Lección   : Ámbito de variables      
*/
// ============================================================================//
// ============================================================================//
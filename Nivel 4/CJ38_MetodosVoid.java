//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Métodos void      
*/
// ============================================================================//
// ============================================================================//

public class CJ38_MetodosVoid {

    
    public static void mostrarBanner(String titulo) {
        System.out.println("=========================================");
        System.out.println(" " + titulo);
        System.out.println("=========================================");
    }

    public static void mostrarMenu() {
        System.out.println("""
                1. Sumar
                2. Restar
                3. Salir""");
    }

    public static void mostrarTabla(int numero) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    
    public static void verificarEdad(int edad) {
        if (edad < 0) {
            System.out.println("Edad inválida");
            return; 
        }
        if (edad >= 18) {
            System.out.println("Edad " + edad + ": mayor de edad");
        } else {
            System.out.println("Edad " + edad + ": menor de edad");
        }
    }

    public static void mostrarRecibo(String cliente, double monto) {
        double iva = monto * 0.16;
        System.out.println("--- RECIBO ---");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Monto: %.2f | IVA: %.2f | Total: %.2f%n", monto, iva, monto + iva);
    }

    
    public static void mensajeSegunHora(int hora) {
        if (hora < 12) {
            System.out.println("Buenos días");
        } else if (hora < 19) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }

    public static int cuadrado(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        mostrarBanner("MÉTODOS VOID EN JAVA");

        mostrarMenu();
        System.out.println();
        mostrarTabla(4);

        System.out.println();
        verificarEdad(25);
        verificarEdad(15);
        verificarEdad(-3);

        System.out.println();
        mostrarRecibo("Danny Jimenez", 250);

        System.out.println();
        mensajeSegunHora(9);
        mensajeSegunHora(15);
        mensajeSegunHora(21);

       
        int c = cuadrado(6);
        System.out.println("\ncuadrado(6) = " + c);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MÉTODOS VOID                    ║
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
 - Lección   : Métodos void      
*/
// ============================================================================//
// ============================================================================//
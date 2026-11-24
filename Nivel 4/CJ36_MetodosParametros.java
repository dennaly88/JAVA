//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Métodos con parámetros      
*/
// ============================================================================//
// ============================================================================//

public class CJ36_MetodosParametros {

    
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". ¡Bienvenido!");
    }

    
    public static void presentarEstudiante(String nombre, int edad, String curso) {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Curso: " + curso);
    }

    public static void mostrarSuma(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void mostrarAreaRectangulo(double base, double altura) {
        System.out.printf("Rectángulo %.1f x %.1f -> Área: %.2f%n", base, altura, base * altura);
    }

    public static void calcularIMC(double pesoKg, double alturaMetros) {
        double imc = pesoKg / (alturaMetros * alturaMetros);
        System.out.printf("Peso: %.1f kg | Altura: %.2f m | IMC: %.2f%n", pesoKg, alturaMetros, imc);
    }

    
    public static void imprimirLinea(char simbolo, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    public static void mostrarTabla(int numero) {
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   MÉTODOS CON PARÁMETROS
                             =========================================""");

        
        saludar("Danny");
        saludar("María");

        System.out.println();
        presentarEstudiante("Danny Jimenez", 30, "JAVA 2026");

        System.out.println();
        mostrarSuma(10, 25);
        mostrarSuma(-4, 9);

        System.out.println();
        mostrarAreaRectangulo(8, 5.5);
        calcularIMC(72, 1.75);

        System.out.println();
        imprimirLinea('=', 30);
        imprimirLinea('*', 15);
        imprimirLinea('-', 40);

        System.out.println();
        mostrarTabla(6);

        
        int x = 7;
        int y = 3;
        System.out.println();
        mostrarSuma(x, y * 2);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: MÉTODOS CON PARÁMETROS          ║
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
 - Lección   : Métodos con parámetros      
*/
// ============================================================================//
// ============================================================================//
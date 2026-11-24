//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Declaración de métodos      
*/
// ============================================================================//
// ============================================================================//

public class CJ35_DeclaracionMetodos {

   
 
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al Curso de JAVA 2026 ♨️");
    }


    public static void mostrarBanner() {
        System.out.println("""
                =========================================
                 \t   DECLARACIÓN DE MÉTODOS
                =========================================""");
    }

    
    public static void dibujarLinea() {
        System.out.println("-----------------------------------------");
    }


    public static void presentarCurso() {
        dibujarLinea();
        saludar();
        System.out.println("Estás aprendiendo métodos en Java.");
        dibujarLinea();
    }

    
    public static int obtenerAnioCurso() {
        return 2026;
    }

    
    public static void main(String[] args) {

        mostrarBanner();

        
        saludar();

        
        System.out.println();
        saludar();
        saludar();

        System.out.println();
        presentarCurso();

        System.out.println("Año del curso: " + obtenerAnioCurso());

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: DECLARACIÓN DE MÉTODOS          ║
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
 - Lección   : Declaración de métodos      
*/
// ============================================================================//
// ============================================================================//
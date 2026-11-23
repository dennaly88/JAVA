
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operadores Relacionales y Lógicos  
*/
// ============================================================================//
// ============================================================================//

public class  CJ10_OperadoresRelacionalesLogicos {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   OPERADORES RELACIONALES Y LÓGICOS
                             =========================================""");

        int nota = 18;
        int asistencias = 90;
        boolean proyectoEntregado = true;

        String bannerRelacionales = """
                ╔═══════════════════════════════════════╗
                ║  1. OPERADORES RELACIONALES           ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(bannerRelacionales);
        System.out.println("¿Nota igual a 20? (==)       : " + (nota == 20));
        System.out.println("¿Nota diferente de 10? (!=)  : " + (nota != 10));
        System.out.println("¿Nota mayor o igual a 15?(>=): " + (nota >= 15));
        System.out.println("¿Asistencias menor a 80? (<) : " + (asistencias < 80));

        String bannerLogicos = """
                ╔═══════════════════════════════════════╗
                ║  2. OPERADORES LÓGICOS                ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(bannerLogicos);
        
        boolean apruebaCurso = (nota >= 15) && (asistencias >= 80);
        
        boolean tieneMencion = (nota == 20) || proyectoEntregado;
        
        boolean reprobado = !apruebaCurso;

        System.out.println("¿Aprueba curso? (AND &&)     : " + apruebaCurso);
        System.out.println("¿Tiene mención? (OR ||)      : " + tieneMencion);
        System.out.println("¿Está reprobado? (NOT !)     : " + reprobado);
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
 - Lección   : Operadores Relacionales y Lógicos  
*/
// ============================================================================//
// ============================================================================//
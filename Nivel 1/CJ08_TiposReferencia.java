
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Tipos de Referencia  
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ08_TiposReferencia {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   TIPOS DE DATOS DE REFERENCIA
                             =========================================""");

        
        String nombreCompleto = "DANNY JOSE JIMENEZ GUTIERREZ";
        String ubicacion = new String("Miranda, Cúa");

        
        String[] tecnologias = {"HTML", "CSS", "JavaScript", "Java"};

        
        Integer nivelCurso = 8;
        Double calificacion = 20.0;

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  OBJETOS Y ARREGLOS EN MEMORIA        ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("String (Nombre)   : " + nombreCompleto);
        System.out.println("String (Ubicación): " + ubicacion);
        System.out.println("Array (Stack)     : " + Arrays.toString(tecnologias));
        System.out.println("Wrapper Integer   : " + nivelCurso);
        System.out.println("Wrapper Double    : " + calificacion);
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
 - Lección   : Tipos de Referencia  
*/
// ============================================================================//
// ============================================================================//
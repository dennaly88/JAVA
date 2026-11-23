
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Conversión de Tipos de Datos 
*/
// ============================================================================//
// ============================================================================//

public class CJ12_ConversionTipos {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   CONVERSIÓN DE TIPOS DE DATOS
                             =========================================""");

    
        int entero = 150;
        double decimalAutomatico = entero;

        double precioExacto = 99.95;
        int precioTruncado = (int) precioExacto; // Se pierden los decimales

        String textoEdad = "38";
        String textoNota = "19.5";
        int edadConvertida = Integer.parseInt(textoEdad);
        double notaConvertida = Double.parseDouble(textoNota);

        int codigo = 2026;
        String codigoTexto = String.valueOf(codigo);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  EJEMPLOS DE CASTING Y PARSEO         ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("Implícito (int a double)   : " + decimalAutomatico);
        System.out.println("Explícito (99.95 a int)    : " + precioTruncado);
        System.out.println("String a int (+2 años)     : " + (edadConvertida + 2));
        System.out.println("String a double (+0.5 pts) : " + (notaConvertida + 0.5));
        System.out.println("int a String (concatenado) : Año_" + codigoTexto);
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
 - Lección   : Conversión de Tipos de Datos 
*/
// ============================================================================//
// ============================================================================//
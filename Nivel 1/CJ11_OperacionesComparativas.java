//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Operaciones comparativas      
*/
// ============================================================================//
// ============================================================================//

public class CJ11_OperacionesComparativas {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t OPERACIONES COMPARATIVAS EN JAVA
                             =========================================""");

        // ------------------------------------------------------------
        // 1. Comparación de números enteros
        // ------------------------------------------------------------
        int notaMinima = 10;
        int notaEstudiante = 18;

        System.out.println("\n--- Números enteros ---");
        System.out.println("Nota mínima: " + notaMinima);
        System.out.println("Nota estudiante: " + notaEstudiante);
        System.out.println("¿Son iguales?      " + (notaEstudiante == notaMinima));
        System.out.println("¿Son diferentes?   " + (notaEstudiante != notaMinima));
        System.out.println("¿Es mayor?         " + (notaEstudiante > notaMinima));
        System.out.println("¿Es menor?         " + (notaEstudiante < notaMinima));
        System.out.println("¿Mayor o igual?    " + (notaEstudiante >= notaMinima));
        System.out.println("¿Menor o igual?    " + (notaEstudiante <= notaMinima));

        // ------------------------------------------------------------
        // 2. Comparación de números decimales
        // ------------------------------------------------------------
        double precioA = 19.99;
        double precioB = 25.50;

        System.out.println("\n--- Números decimales ---");
        System.out.println("Precio A: " + precioA);
        System.out.println("Precio B: " + precioB);
        System.out.println("¿A es menor que B? " + (precioA < precioB));
        System.out.println("¿A es igual a B?   " + (precioA == precioB));

        // Cuidado: los double no siempre son exactos
        double suma = 0.1 + 0.2;
        System.out.println("\n0.1 + 0.2 = " + suma);
        System.out.println("¿0.1 + 0.2 == 0.3? " + (suma == 0.3));
        System.out.println("¿Diferencia muy pequeña? " + (Math.abs(suma - 0.3) < 0.0001));

        // ------------------------------------------------------------
        // 3. Comparación de caracteres (char)
        // ------------------------------------------------------------
        char letra1 = 'A';
        char letra2 = 'B';

        System.out.println("\n--- Caracteres ---");
        System.out.println("¿'A' == 'B'? " + (letra1 == letra2));
        System.out.println("¿'A' < 'B'?  " + (letra1 < letra2));
        System.out.println("Código de 'A': " + (int) letra1);
        System.out.println("Código de 'B': " + (int) letra2);

        // ------------------------------------------------------------
        // 4. Comparación de booleanos
        // ------------------------------------------------------------
        boolean aprobado = true;
        boolean inscrito = false;

        System.out.println("\n--- Booleanos ---");
        System.out.println("¿aprobado == inscrito? " + (aprobado == inscrito));
        System.out.println("¿aprobado != inscrito? " + (aprobado != inscrito));

        // ------------------------------------------------------------
        // 5. Comparación de Strings: == vs equals()
        // ------------------------------------------------------------
        String curso1 = "JAVA";
        String curso2 = "JAVA";
        String curso3 = new String("JAVA");
        String curso4 = "java";

        System.out.println("\n--- Strings ---");
        System.out.println("curso1 == curso2:       " + (curso1 == curso2));
        System.out.println("curso1 == curso3:       " + (curso1 == curso3));
        System.out.println("curso1.equals(curso3):  " + curso1.equals(curso3));
        System.out.println("curso1.equals(curso4):  " + curso1.equals(curso4));
        System.out.println("curso1.equalsIgnoreCase(curso4): " + curso1.equalsIgnoreCase(curso4));
        System.out.println("curso1.compareTo(curso4): " + curso1.compareTo(curso4));

        // ------------------------------------------------------------
        // 6. Resultado guardado en una variable boolean
        // ------------------------------------------------------------
        boolean estaAprobado = notaEstudiante >= notaMinima;

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  RESULTADO DE LA COMPARACIÓN          ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("¿Estudiante aprobado? " + estaAprobado);
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
 - Lección   : Operaciones comparativas      
*/
// ============================================================================//
// ============================================================================//
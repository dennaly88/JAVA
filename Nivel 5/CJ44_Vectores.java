
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Vectores      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ44_Vectores {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   VECTORES (ARREGLOS) EN JAVA
                             =========================================""");

        // Un vector (arreglo) guarda VARIOS valores del MISMO tipo
        // con un tamaño FIJO. Los índices empiezan en 0.

        // 1. Declarar con tamaño (se llena con valores por defecto)
        int[] numeros = new int[5];
        System.out.println("\nValores por defecto int[]: " + Arrays.toString(numeros));

        // 2. Asignar y leer por índice
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println("Después de asignar:        " + Arrays.toString(numeros));
        System.out.println("Primer elemento:  " + numeros[0]);
        System.out.println("Último elemento:  " + numeros[numeros.length - 1]);

        // 3. Declarar con valores iniciales
        double[] notas = {18.5, 15.0, 20.0, 12.5};
        String[] cursos = {"JAVA", "Python", "SQL"};
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        boolean[] asistencia = new boolean[3];

        System.out.println("\nnotas:      " + Arrays.toString(notas));
        System.out.println("cursos:     " + Arrays.toString(cursos));
        System.out.println("vocales:    " + Arrays.toString(vocales));
        System.out.println("asistencia: " + Arrays.toString(asistencia) + "  (boolean por defecto = false)");

        // 4. Longitud: length (sin paréntesis, es un atributo)
        System.out.println("\nTamaño de notas:  " + notas.length);
        System.out.println("Tamaño de cursos: " + cursos.length);

        // 5. Modificar un elemento
        cursos[1] = "Node.js";
        System.out.println("cursos modificado: " + Arrays.toString(cursos));

        // 6. Valores por defecto: int=0, double=0.0, boolean=false, String/objetos=null
        String[] nombres = new String[2];
        System.out.println("String[] por defecto: " + Arrays.toString(nombres));

        // 7. Copiar un arreglo
        int[] original = {1, 2, 3};
        int[] referencia = original;              // NO es copia: apuntan al mismo arreglo
        int[] copia = Arrays.copyOf(original, 3); // copia real e independiente

        original[0] = 99;
        System.out.println("\noriginal:   " + Arrays.toString(original));
        System.out.println("referencia: " + Arrays.toString(referencia) + "  (cambió también)");
        System.out.println("copia:      " + Arrays.toString(copia) + "  (no cambió)");

        // 8. Utilidades de Arrays
        int[] relleno = new int[6];
        Arrays.fill(relleno, 7);
        System.out.println("\nArrays.fill:   " + Arrays.toString(relleno));
        System.out.println("¿Son iguales?  " + Arrays.equals(new int[]{1, 2}, new int[]{1, 2}));
        System.out.println("¿Son == ?      " + (new int[]{1, 2} == new int[]{1, 2}) + "  (== compara referencias)");

        // 9. ERROR común: índice fuera de rango
        // numeros[5] = 60;   // ArrayIndexOutOfBoundsException (índices válidos: 0 a 4)

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: VECTORES                        ║
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
 - Lección   : Vectores      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Arreglos bidimensionales      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ48_ArreglosBidimensionales {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   ARREGLOS BIDIMENSIONALES
                             =========================================""");

        // Un arreglo 2D es un arreglo de arreglos: filas y columnas
        // matriz[fila][columna]

        // 1. Declarar con tamaño: 3 filas x 4 columnas
        int[][] tabla = new int[3][4];
        System.out.println("\nFilas:    " + tabla.length);
        System.out.println("Columnas: " + tabla[0].length);

        // 2. Asignar valores
        tabla[0][0] = 5;
        tabla[1][2] = 8;
        tabla[2][3] = 1;
        System.out.println("Con valores por defecto: " + Arrays.deepToString(tabla));

        // 3. Declarar con valores iniciales
        int[][] notas = {
            {18, 15, 20},   // estudiante 0
            {12, 14, 10},   // estudiante 1
            {17, 19, 16},   // estudiante 2
            {9, 11, 13}     // estudiante 3
        };

        // 4. Recorrer con ciclos anidados
        System.out.println("\n--- Notas (4 estudiantes x 3 materias) ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Estudiante " + i + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%4d", notas[i][j]);
            }
            System.out.println();
        }

        // 5. Recorrer con for-each
        System.out.println("\n--- for-each ---");
        for (int[] fila : notas) {
            for (int nota : fila) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        // 6. Promedio por estudiante (por FILA)
        System.out.println("\n--- Promedio por estudiante ---");
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            System.out.printf("Estudiante %d: %.2f%n", i, suma / (double) notas[i].length);
        }

        // 7. Promedio por materia (por COLUMNA)
        System.out.println("\n--- Promedio por materia ---");
        for (int j = 0; j < notas[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            System.out.printf("Materia %d: %.2f%n", j, suma / (double) notas.length);
        }

        // 8. Arreglo irregular (cada fila con distinta longitud)
        int[][] irregular = new int[3][];
        irregular[0] = new int[]{1};
        irregular[1] = new int[]{2, 3};
        irregular[2] = new int[]{4, 5, 6};
        System.out.println("\nIrregular: " + Arrays.deepToString(irregular));

        // 9. Arreglo 2D de Strings
        String[][] horario = {
            {"Lunes", "JAVA"},
            {"Martes", "SQL"},
            {"Miércoles", "Spring"}
        };
        System.out.println();
        for (String[] fila : horario) {
            System.out.println(fila[0] + " -> " + fila[1]);
        }

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: ARREGLOS BIDIMENSIONALES        ║
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
 - Lección   : Arreglos bidimensionales      
*/
// ============================================================================//
// ============================================================================//
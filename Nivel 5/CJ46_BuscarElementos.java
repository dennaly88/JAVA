//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Buscar elementos      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ46_BuscarElementos {

    // Búsqueda lineal: devuelve la posición o -1 si no existe
    public static int buscar(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarTexto(String[] arreglo, String texto) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(texto)) { // Strings: equals, no ==
                return i;
            }
        }
        return -1;
    }

    public static int buscarUltima(int[] arreglo, int valor) {
        for (int i = arreglo.length - 1; i >= 0; i--) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int contarOcurrencias(int[] arreglo, int valor) {
        int contador = 0;
        for (int n : arreglo) {
            if (n == valor) contador++;
        }
        return contador;
    }

    public static int posicionDelMayor(int[] arreglo) {
        int pos = 0;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > arreglo[pos]) pos = i;
        }
        return pos;
    }

    public static int posicionDelMenor(int[] arreglo) {
        int pos = 0;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[pos]) pos = i;
        }
        return pos;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   BUSCAR ELEMENTOS EN ARREGLOS
                             =========================================""");

        int[] numeros = {14, 8, 21, 8, 35, 2, 8, 19};
        System.out.println("\nArreglo: " + Arrays.toString(numeros));

        // 1. Primera posición
        int pos = buscar(numeros, 35);
        System.out.println("\nbuscar(35)  -> posición " + pos);
        System.out.println("buscar(100) -> posición " + buscar(numeros, 100) + "  (-1 = no existe)");

        // 2. Existe / no existe
        if (buscar(numeros, 21) != -1) {
            System.out.println("El 21 SÍ está en el arreglo");
        }

        // 3. Primera y última aparición, y conteo
        System.out.println("\nPrimera posición del 8: " + buscar(numeros, 8));
        System.out.println("Última posición del 8:  " + buscarUltima(numeros, 8));
        System.out.println("Veces que aparece el 8: " + contarOcurrencias(numeros, 8));

        // 4. Posiciones de todas las apariciones
        System.out.print("Todas las posiciones del 8: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 8) System.out.print(i + " ");
        }
        System.out.println();

        // 5. Mayor y menor con su posición
        int pMayor = posicionDelMayor(numeros);
        int pMenor = posicionDelMenor(numeros);
        System.out.println("\nMayor: " + numeros[pMayor] + " (posición " + pMayor + ")");
        System.out.println("Menor: " + numeros[pMenor] + " (posición " + pMenor + ")");

        // 6. Buscar en un arreglo de Strings
        String[] cursos = {"JAVA", "Python", "SQL", "Spring"};
        System.out.println("\nbuscarTexto(\"sql\")    -> " + buscarTexto(cursos, "sql"));
        System.out.println("buscarTexto(\"Docker\") -> " + buscarTexto(cursos, "Docker"));

        // 7. Búsqueda binaria (SOLO funciona en arreglos ORDENADOS)
        int[] ordenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("\nOrdenado: " + Arrays.toString(ordenado));
        System.out.println("Arrays.binarySearch(23) -> posición " + Arrays.binarySearch(ordenado, 23));
        System.out.println("(Se implementa a mano en la lección 55)");

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: BUSCAR ELEMENTOS                ║
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
 - Lección   : Buscar elementos      
*/
// ============================================================================//
// ============================================================================//
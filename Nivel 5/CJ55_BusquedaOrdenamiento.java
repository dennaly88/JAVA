//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Algoritmos de búsqueda y ordenamiento      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;
import java.util.Random;

public class CJ55_BusquedaOrdenamiento {

    static long comparaciones = 0;

    // ---------------- BÚSQUEDA ----------------
    public static int busquedaLineal(int[] a, int valor) {
        for (int i = 0; i < a.length; i++) {
            comparaciones++;
            if (a[i] == valor) return i;
        }
        return -1;
    }

    // Binaria: SOLO en arreglos ORDENADOS. Descarta la mitad en cada paso.
    public static int busquedaBinaria(int[] a, int valor) {
        int inicio = 0;
        int fin = a.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            comparaciones++;
            if (a[medio] == valor) {
                return medio;
            } else if (a[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static int binariaRecursiva(int[] a, int valor, int inicio, int fin) {
        if (inicio > fin) return -1;
        int medio = (inicio + fin) / 2;
        if (a[medio] == valor) return medio;
        if (a[medio] < valor) return binariaRecursiva(a, valor, medio + 1, fin);
        return binariaRecursiva(a, valor, inicio, medio - 1);
    }

    // ---------------- ORDENAMIENTO ----------------
    public static void burbuja(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean huboCambio = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                comparaciones++;
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                    huboCambio = true;
                }
            }
            if (!huboCambio) break; // ya está ordenado
        }
    }

    public static void seleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < a.length; j++) {
                comparaciones++;
                if (a[j] < a[menor]) menor = j;
            }
            int t = a[i]; a[i] = a[menor]; a[menor] = t;
        }
    }

    // Inserción: toma cada elemento y lo inserta en su lugar dentro de la parte ya ordenada
    public static void insercion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int clave = a[i];
            int j = i - 1;
            while (j >= 0) {
                comparaciones++;
                if (a[j] > clave) {
                    a[j + 1] = a[j];
                    j--;
                } else {
                    break;
                }
            }
            a[j + 1] = clave;
        }
    }

    // QuickSort: elige un pivote y divide en menores y mayores (recursivo)
    public static void quickSort(int[] a, int bajo, int alto) {
        if (bajo < alto) {
            int pivote = a[alto];
            int i = bajo - 1;
            for (int j = bajo; j < alto; j++) {
                comparaciones++;
                if (a[j] <= pivote) {
                    i++;
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
            }
            int t = a[i + 1]; a[i + 1] = a[alto]; a[alto] = t;
            int p = i + 1;
            quickSort(a, bajo, p - 1);
            quickSort(a, p + 1, alto);
        }
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   BÚSQUEDA Y ORDENAMIENTO
                             =========================================""");

        // ---- Búsqueda ----
        int[] ordenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("\nArreglo ordenado: " + Arrays.toString(ordenado));

        comparaciones = 0;
        int p1 = busquedaLineal(ordenado, 72);
        System.out.println("Lineal  (72): posición " + p1 + " | comparaciones: " + comparaciones);

        comparaciones = 0;
        int p2 = busquedaBinaria(ordenado, 72);
        System.out.println("Binaria (72): posición " + p2 + " | comparaciones: " + comparaciones);

        System.out.println("Binaria recursiva (23): posición " + binariaRecursiva(ordenado, 23, 0, ordenado.length - 1));
        System.out.println("Binaria (100): posición " + busquedaBinaria(ordenado, 100) + "  (-1 = no existe)");

        // ---- Ordenamiento con un arreglo pequeño ----
        int[] datos = {64, 25, 12, 90, 3, 47, 18, 55};
        System.out.println("\nDesordenado: " + Arrays.toString(datos));

        int[] c1 = datos.clone(); burbuja(c1);
        int[] c2 = datos.clone(); seleccion(c2);
        int[] c3 = datos.clone(); insercion(c3);
        int[] c4 = datos.clone(); quickSort(c4, 0, c4.length - 1);
        System.out.println("Burbuja:   " + Arrays.toString(c1));
        System.out.println("Selección: " + Arrays.toString(c2));
        System.out.println("Inserción: " + Arrays.toString(c3));
        System.out.println("QuickSort: " + Arrays.toString(c4));

        // ---- Comparación con 2000 números aleatorios (semilla fija) ----
        Random azar = new Random(42);
        int[] grande = new int[2000];
        for (int i = 0; i < grande.length; i++) {
            grande[i] = azar.nextInt(100000);
        }

        System.out.println("\n--- Comparaciones al ordenar 2000 números ---");
        int[] g;

        g = grande.clone(); comparaciones = 0; burbuja(g);
        System.out.printf("Burbuja:   %,10d%n", comparaciones);
        g = grande.clone(); comparaciones = 0; seleccion(g);
        System.out.printf("Selección: %,10d%n", comparaciones);
        g = grande.clone(); comparaciones = 0; insercion(g);
        System.out.printf("Inserción: %,10d%n", comparaciones);
        g = grande.clone(); comparaciones = 0; quickSort(g, 0, g.length - 1);
        System.out.printf("QuickSort: %,10d%n", comparaciones);

        // Buscar en el arreglo grande ya ordenado
        int objetivo = g[1500];
        comparaciones = 0; busquedaLineal(g, objetivo);
        long lineal = comparaciones;
        comparaciones = 0; busquedaBinaria(g, objetivo);
        System.out.println("\nBuscando un valor entre 2000 números ordenados:");
        System.out.println("Lineal:  " + lineal + " comparaciones");
        System.out.println("Binaria: " + comparaciones + " comparaciones");

        System.out.println("""

                Resumen:
                - Burbuja, selección e inserción: lentos en arreglos grandes (~n²).
                - QuickSort: mucho más rápido en general (~n log n).
                - Binaria: muy rápida, pero exige el arreglo ordenado.
                - En la práctica se usa Arrays.sort() y Arrays.binarySearch().""");

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: BÚSQUEDA Y ORDENAMIENTO         ║
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
 - Lección   : Algoritmos de búsqueda y ordenamiento      
*/
// ============================================================================//
// ============================================================================//
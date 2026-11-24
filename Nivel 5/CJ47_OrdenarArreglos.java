//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Ordenar arreglos      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ47_OrdenarArreglos {

    // Burbuja: compara pares vecinos e intercambia si están desordenados
    public static void burbuja(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Selección: busca el menor del resto y lo coloca en su posición
    public static void seleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[posMenor]) {
                    posMenor = j;
                }
            }
            int temp = a[i];
            a[i] = a[posMenor];
            a[posMenor] = temp;
        }
    }

    public static void invertir(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   ORDENAR ARREGLOS
                             =========================================""");

        int[] datos = {64, 25, 12, 90, 3, 47, 18};
        System.out.println("\nOriginal: " + Arrays.toString(datos));

        // 1. Burbuja (se ordena una COPIA para no perder el original)
        int[] a1 = Arrays.copyOf(datos, datos.length);
        burbuja(a1);
        System.out.println("Burbuja:   " + Arrays.toString(a1));

        // 2. Selección
        int[] a2 = Arrays.copyOf(datos, datos.length);
        seleccion(a2);
        System.out.println("Selección: " + Arrays.toString(a2));

        // 3. Método de Java: Arrays.sort (rápido y listo para usar)
        int[] a3 = Arrays.copyOf(datos, datos.length);
        Arrays.sort(a3);
        System.out.println("Arrays.sort: " + Arrays.toString(a3));

        // 4. Orden descendente: ordenar y luego invertir
        invertir(a3);
        System.out.println("Descendente: " + Arrays.toString(a3));

        // 5. Ordenar Strings (orden alfabético)
        String[] nombres = {"Pedro", "Ana", "Luis", "Danny", "Beatriz"};
        Arrays.sort(nombres);
        System.out.println("\nNombres ordenados: " + Arrays.toString(nombres));

        // 6. Ordenar decimales
        double[] notas = {15.5, 9.0, 20.0, 12.75, 18.0};
        Arrays.sort(notas);
        System.out.println("Notas ordenadas:   " + Arrays.toString(notas));

        // 7. Ordenar solo una parte (posiciones 2 a 5, el final no se incluye)
        int[] parcial = {9, 8, 7, 6, 5, 4, 3, 2};
        Arrays.sort(parcial, 2, 6);
        System.out.println("\nOrden parcial [2,6): " + Arrays.toString(parcial));

        // 8. Mediana (requiere arreglo ordenado)
        int[] muestra = {7, 1, 9, 4, 5};
        Arrays.sort(muestra);
        System.out.println("Mediana de " + Arrays.toString(muestra) + " = " + muestra[muestra.length / 2]);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: ORDENAR ARREGLOS                ║
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
 - Lección   : Ordenar arreglos      
*/
// ============================================================================//
// ============================================================================//
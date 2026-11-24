//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Recorrer arreglos      
*/
// ============================================================================//
// ============================================================================//

import java.util.Arrays;

public class CJ45_RecorrerArreglos {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   RECORRER ARREGLOS
                             =========================================""");

        int[] numeros = {12, 7, 25, 3, 18, 30, 9};

        // 1. for clásico: da acceso al ÍNDICE y permite modificar
        System.out.println("\n--- for clásico ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // 2. for-each: más simple cuando solo necesitas leer los valores
        System.out.println("\n--- for-each ---");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 3. while
        System.out.println("\n--- while ---");
        int k = 0;
        while (k < numeros.length) {
            System.out.print(numeros[k] + " ");
            k++;
        }
        System.out.println();

        // 4. En orden inverso
        System.out.println("\n--- Inverso ---");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // 5. Cálculos con acumuladores
        int suma = 0;
        int mayor = numeros[0];
        int menor = numeros[0];
        int pares = 0;
        for (int n : numeros) {
            suma += n;
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
            if (n % 2 == 0) pares++;
        }
        System.out.println("\nSuma:     " + suma);
        System.out.println("Promedio: " + (suma / (double) numeros.length));
        System.out.println("Mayor:    " + mayor);
        System.out.println("Menor:    " + menor);
        System.out.println("Pares:    " + pares);

        // 6. Modificar elementos: usa for clásico (for-each NO modifica el arreglo)
        int[] dobles = Arrays.copyOf(numeros, numeros.length);
        for (int i = 0; i < dobles.length; i++) {
            dobles[i] = dobles[i] * 2;
        }
        System.out.println("\nDuplicados: " + Arrays.toString(dobles));

        int[] intento = {1, 2, 3};
        for (int n : intento) {
            n = n * 10; // modifica solo la copia local 'n'
        }
        System.out.println("for-each no modifica: " + Arrays.toString(intento));

        // 7. Solo posiciones pares (paso de 2)
        System.out.print("\nÍndices pares: ");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // 8. Recorrer arreglo de Strings
        String[] dias = {"Lunes", "Martes", "Miércoles"};
        System.out.println();
        for (int i = 0; i < dias.length; i++) {
            System.out.println((i + 1) + ". " + dias[i]);
        }

        // 9. Invertir el arreglo en el mismo lugar (intercambiando extremos)
        int[] vec = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < vec.length / 2; i++) {
            int temp = vec[i];
            vec[i] = vec[vec.length - 1 - i];
            vec[vec.length - 1 - i] = temp;
        }
        System.out.println("\nInvertido: " + Arrays.toString(vec));

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: RECORRER ARREGLOS               ║
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
 - Lección   : Recorrer arreglos      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Contadores y acumuladores      
*/
// ============================================================================//
// ============================================================================//

public class CJ34_ContadoresAcumuladores {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t CONTADORES Y ACUMULADORES
                             =========================================""");

        // Contador: cuenta cuántas veces ocurre algo (se incrementa de 1 en 1)
        // Acumulador: va sumando (o multiplicando) valores distintos
        int contadorPares = 0;
        int contadorMultiplos5 = 0;
        int sumaTotal = 0;
        long producto = 1;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
            if (i % 5 == 0) {
                contadorMultiplos5++;
            }
            sumaTotal += i;
            if (i <= 10) {
                producto *= i;
            }
        }

        System.out.println("\n--- Números del 1 al 20 ---");
        System.out.println("Cantidad de pares:        " + contadorPares);
        System.out.println("Cantidad de múltiplos de 5: " + contadorMultiplos5);
        System.out.println("Suma acumulada:           " + sumaTotal);
        System.out.println("Producto del 1 al 10:     " + producto);
        System.out.println("Promedio:                 " + (sumaTotal / 20.0));

        // Contar vocales y consonantes en un texto
        String texto = "Curso de Java 2026";
        int vocales = 0, consonantes = 0, digitos = 0, espacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            } else if (Character.isLetter(c)) {
                consonantes++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else if (c == ' ') {
                espacios++;
            }
        }
        System.out.println("\n--- Texto: \"" + texto + "\" ---");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);

        // Mayor y menor con acumuladores de comparación (ventas simuladas)
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int total = 0;
        int cantidadVentas = 0;
        for (int dia = 1; dia <= 6; dia++) {
            int venta = (dia * 137) % 500 + 50; // venta simulada
            if (venta > mayor) mayor = venta;
            if (venta < menor) menor = venta;
            total += venta;
            cantidadVentas++;
        }
        System.out.println("\n--- Ventas de la semana (simuladas) ---");
        System.out.println("Mayor venta: " + mayor);
        System.out.println("Menor venta: " + menor);
        System.out.println("Total:       " + total);
        System.out.println("Promedio:    " + (total / (double) cantidadVentas));

        // Cuántos términos hacen falta para que la suma supere 1000
        int suma = 0;
        int terminos = 0;
        while (suma <= 1000) {
            terminos++;
            suma += terminos;
        }
        System.out.println("\nSe necesitan " + terminos + " términos (1+2+3+...) para superar 1000 (suma = " + suma + ")");

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: CONTADORES Y ACUMULADORES       ║
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
 - Lección   : Contadores y acumuladores      
*/
// ============================================================================//
// ============================================================================//
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Promedios y calificaciones      
*/
// ============================================================================//
// ============================================================================//

public class CJ25_PromediosCalificaciones {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t PROMEDIOS Y CALIFICACIONES
                             =========================================""");

        String estudiante = "DANNY JOSE JIMENEZ GUTIERREZ";
        double nota1 = 18.5;
        double nota2 = 15.0;
        double nota3 = 20.0;
        double nota4 = 12.5;

        double suma = nota1 + nota2 + nota3 + nota4;
        double promedio = suma / 4;

        System.out.println("\nEstudiante: " + estudiante);
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3 + " | " + nota4);
        System.out.printf("Suma:     %.2f%n", suma);
        System.out.printf("Promedio: %.2f%n", promedio);

    
        double mayor = Math.max(Math.max(nota1, nota2), Math.max(nota3, nota4));
        double menor = Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);

        
        if (promedio >= 10) {
            System.out.println("Condición: APROBADO");
        } else {
            System.out.println("Condición: REPROBADO");
        }

        
        String escala;
        if (promedio >= 18) {
            escala = "A (Excelente)";
        } else if (promedio >= 15) {
            escala = "B (Bueno)";
        } else if (promedio >= 10) {
            escala = "C (Regular)";
        } else {
            escala = "D (Deficiente)";
        }
        System.out.println("Escala: " + escala);

        
        double ponderado = nota1 * 0.30 + nota2 * 0.20 + nota3 * 0.30 + nota4 * 0.20;
        System.out.printf("%nPromedio ponderado (30%%, 20%%, 30%%, 20%%): %.2f%n", ponderado);

        // Promedio de 5 notas con un ciclo
        System.out.println("\n--- Promedio de los números 10, 12, 14, 16, 18 ---");
        double acumulador = 0;
        int cantidad = 0;
        for (int nota = 10; nota <= 18; nota += 2) {
            acumulador += nota;
            cantidad++;
        }
        System.out.println("Promedio: " + (acumulador / cantidad));

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: PROMEDIOS Y CALIFICACIONES      ║
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
 - Lección   : Promedios y calificaciones      
*/
// ============================================================================//
// ============================================================================//
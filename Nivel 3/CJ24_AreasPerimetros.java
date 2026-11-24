
//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Cálculo de áreas y perímetros      
*/
// ============================================================================//
// ============================================================================//

public class CJ24_AreasPerimetros {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t ÁREAS Y PERÍMETROS EN JAVA
                             =========================================""");

    
        double lado = 6;
        System.out.println("\n--- Cuadrado (lado = " + lado + ") ---");
        System.out.printf("Área:      %.2f%n", lado * lado);
        System.out.printf("Perímetro: %.2f%n", 4 * lado);

    
        double base = 8;
        double altura = 5;
        System.out.println("\n--- Rectángulo (base = 8, altura = 5) ---");
        System.out.printf("Área:      %.2f%n", base * altura);
        System.out.printf("Perímetro: %.2f%n", 2 * (base + altura));

        
        double ladoA = 3, ladoB = 4, ladoC = 5;
        double baseT = 4, alturaT = 3;
        System.out.println("\n--- Triángulo (lados 3, 4, 5) ---");
        System.out.printf("Área:      %.2f%n", (baseT * alturaT) / 2);
        System.out.printf("Perímetro: %.2f%n", ladoA + ladoB + ladoC);

        
        double radio = 7;
        System.out.println("\n--- Círculo (radio = " + radio + ") ---");
        System.out.printf("Área:      %.2f%n", Math.PI * Math.pow(radio, 2));
        System.out.printf("Perímetro (circunferencia): %.2f%n", 2 * Math.PI * radio);

      
        double baseMayor = 10, baseMenor = 6, alturaTr = 4;
        System.out.println("\n--- Trapecio (bases 10 y 6, altura 4) ---");
        System.out.printf("Área: %.2f%n", ((baseMayor + baseMenor) * alturaTr) / 2);

        
        System.out.println("\n--- Volúmenes ---");
        System.out.printf("Cubo (lado 6):     %.2f%n", Math.pow(lado, 3));
        System.out.printf("Esfera (radio 7):  %.2f%n", (4.0 / 3) * Math.PI * Math.pow(radio, 3));

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: ÁREAS Y PERÍMETROS              ║
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
 - Lección   : Cálculo de áreas y perímetros      
*/
// ============================================================================//
// ============================================================================//
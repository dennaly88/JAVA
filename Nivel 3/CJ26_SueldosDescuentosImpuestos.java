//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Sueldos, descuentos e impuestos      
*/
// ============================================================================//
// ============================================================================//

public class CJ26_SueldosDescuentosImpuestos {
    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t SUELDOS, DESCUENTOS E IMPUESTOS
                             =========================================""");

    
        String empleado = "DANNY JOSE JIMENEZ GUTIERREZ";
        double sueldoBase = 1200.00;
        double horasExtras = 10;
        double valorHora = 8.50;
        double bono = 100.00;

        double pagoExtras = horasExtras * valorHora;
        double totalIngresos = sueldoBase + pagoExtras + bono;

        double seguroSocial = totalIngresos * 0.04;   
        double impuestoRenta = totalIngresos * 0.10;  
        double totalDescuentos = seguroSocial + impuestoRenta;
        double sueldoNeto = totalIngresos - totalDescuentos;

        System.out.println("\nEmpleado: " + empleado);
        System.out.println("--- INGRESOS ---");
        System.out.printf("Sueldo base:    %10.2f%n", sueldoBase);
        System.out.printf("Horas extras:   %10.2f%n", pagoExtras);
        System.out.printf("Bono:           %10.2f%n", bono);
        System.out.printf("Total ingresos: %10.2f%n", totalIngresos);
        System.out.println("--- DESCUENTOS ---");
        System.out.printf("Seguro social (4%%): %10.2f%n", seguroSocial);
        System.out.printf("Impuesto (10%%):     %10.2f%n", impuestoRenta);
        System.out.printf("Total descuentos:   %10.2f%n", totalDescuentos);
        System.out.println("-----------------------------------");
        System.out.printf("SUELDO NETO:        %10.2f%n", sueldoNeto);

        
        double precio = 250.00;
        double porcentajeDescuento = 20;
        double descuento = precio * porcentajeDescuento / 100;
        double precioConDescuento = precio - descuento;

        System.out.println("\n--- Compra con descuento ---");
        System.out.printf("Precio original:     %.2f%n", precio);
        System.out.printf("Descuento (%.0f%%):    %.2f%n", porcentajeDescuento, descuento);
        System.out.printf("Precio con descuento: %.2f%n", precioConDescuento);

        
        double iva = precioConDescuento * 0.16;
        double totalPagar = precioConDescuento + iva;
        System.out.println("\n--- IVA (16%) ---");
        System.out.printf("IVA:            %.2f%n", iva);
        System.out.printf("Total a pagar:  %.2f%n", totalPagar);

    
        double aumento = sueldoBase * 0.15;
        System.out.println("\n--- Aumento del 15% ---");
        System.out.printf("Nuevo sueldo base: %.2f%n", sueldoBase + aumento);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: SUELDOS Y DESCUENTOS            ║
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
 - Lección   : Sueldos, descuentos e impuestos      
*/
// ============================================================================//
// ============================================================================//
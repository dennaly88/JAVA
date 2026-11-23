//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Escrituras     
*/
// ============================================================================//
// ============================================================================//

import javax.swing.JOptionPane;

public class CJ03_Escrituras {
    public static void main(String[] args) {
        
        
        String producto = "Audífonos Inalámbricos";
        int cantidad = 2;
        double precioUnitario = 35.50;
        double total = cantidad * precioUnitario;
        boolean stockDisponible = false;
        System.out.print("Iniciando módulo de facturación");
        System.out.print("... ");

        System.out.println("¡Módulo listo!");
        System.out.println("=========================================");

        System.out.printf("%-22s | %-5s | %-10s%n", "PRODUCTO", "CANT.", "TOTAL");
        System.out.println("-----------------------------------------");
        System.out.printf("%-22s | %-5d | $%8.2f%n", producto, cantidad, total);
        System.out.println("=========================================");

        if (!stockDisponible) {
            System.err.println("ALERTA DE INVENTARIO: Quedan pocas unidades en almacén.");
        }

        String mensajeVentana = "Factura generada con éxito.\nTotal cobrado: $" + String.format("%.2f", total);
        JOptionPane.showMessageDialog(
            null, 
            mensajeVentana, 
            "Comprobante de Venta", 
            JOptionPane.INFORMATION_MESSAGE
        );
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
 - Lección   : Escrituras     
*/
// ============================================================================//
// ============================================================================//
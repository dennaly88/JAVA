/* <!--------------------------------------------------------------------------------------------------------|
|------------------------------------------------------------------------------------------------------------|
| @Author   :  DANNY JOSE JIMENEZ GUTIERREZ                                                                  |
| CEDULA    :  16.029.567                                                                                    |
| TELEFONO  :  0424-281-44-55                                                                                |
| CORREO    :  DENNALY88@GMAIL.COM                                                                           |
|------------------------------------------------------------------------------------------------------------|
|  CURSO    : CURSO DE JAVA                                                                                  |
|  DESARROLLADOR WEB                                                                                         |
|  MIRANDA , CUA  2026                                                                                       |
|  TEMA  :   Conversión de Tipos de Datos                                                                    | 
-------------------------------------------------------------------------------------------------------------|
----------------------------------------------------------------------------------------------------------->*/

public class CJ11_ConversionTipos {
    public static void main(String[] args) {
       
        System.out.println("""
                            =========================================
                             \t   CONVERSIÓN DE TIPOS DE DATOS
                             =========================================""");

        // 1. Conversión Implícita (int -> double)
        int entero = 150;
        double decimalAutomatico = entero;

        // 2. Conversión Explícita / Casting manual (double -> int)
        double precioExacto = 99.95;
        int precioTruncado = (int) precioExacto; // Se pierden los decimales

        // 3. Conversión de String a tipos numéricos (Parseo)
        String textoEdad = "38";
        String textoNota = "19.5";
        int edadConvertida = Integer.parseInt(textoEdad);
        double notaConvertida = Double.parseDouble(textoNota);

        // 4. Conversión de número a String
        int codigo = 2026;
        String codigoTexto = String.valueOf(codigo);

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  EJEMPLOS DE CASTING Y PARSEO         ║
                ╚═══════════════════════════════════════╝
                """;
        System.out.print(mensaje);
        System.out.println("Implícito (int a double)   : " + decimalAutomatico);
        System.out.println("Explícito (99.95 a int)    : " + precioTruncado);
        System.out.println("String a int (+2 años)     : " + (edadConvertida + 2));
        System.out.println("String a double (+0.5 pts) : " + (notaConvertida + 0.5));
        System.out.println("int a String (concatenado) : Año_" + codigoTexto);
    }
}


//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Listas enlazadas      
*/
// ============================================================================//
// ============================================================================//

public class CJ54_ListasEnlazadas {

   
    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static Nodo cabeza = null;

    public static void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public static void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public static boolean eliminar(int valor) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }
        if (actual.siguiente == null) {
            return false;
        }
        actual.siguiente = actual.siguiente.siguiente; // se "salta" el nodo
        return true;
    }

    public static int buscar(int valor) {
        Nodo actual = cabeza;
        int posicion = 0;
        while (actual != null) {
            if (actual.dato == valor) {
                return posicion;
            }
            actual = actual.siguiente;
            posicion++;
        }
        return -1;
    }

    public static int tamanio() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public static void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }

    public static void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   LISTAS ENLAZADAS
                             =========================================""");

        System.out.println();
        insertarFinal(20);
        insertarFinal(30);
        insertarFinal(40);
        insertarInicio(10);
        System.out.print("Lista:    ");
        mostrar();
        System.out.println("Tamaño:   " + tamanio());

        System.out.println("\nPosición del 30: " + buscar(30));
        System.out.println("Posición del 99: " + buscar(99));

        System.out.println("\nEliminar 20 -> " + eliminar(20));
        System.out.print("Lista:    ");
        mostrar();
        System.out.println("Eliminar 10 (cabeza) -> " + eliminar(10));
        System.out.print("Lista:    ");
        mostrar();
        System.out.println("Eliminar 99 -> " + eliminar(99));

        insertarFinal(50);
        insertarFinal(60);
        System.out.print("\nLista:    ");
        mostrar();
        invertir();
        System.out.print("Invertida: ");
        mostrar();

        // Arreglo vs lista enlazada:
        //   Arreglo: acceso rápido por índice, tamaño fijo, insertar en medio es costoso.
        //   Lista:   tamaño dinámico, insertar/eliminar es fácil, acceso por índice es lento.

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: LISTAS ENLAZADAS                ║
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
 - Lección   : Listas enlazadas      
*/
// ============================================================================//
// ============================================================================//
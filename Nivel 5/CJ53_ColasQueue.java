//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Colas (Queue)      
*/
// ============================================================================//
// ============================================================================//

import java.util.LinkedList;
import java.util.Queue;

public class CJ53_ColasQueue {

    // COLA (Queue): estructura FIFO = "el primero en entrar es el primero en salir"
    // Como la fila de un banco: entras por el final y sales por el frente.
    // Aquí se implementa como cola CIRCULAR con un arreglo.

    static int[] cola = new int[5];
    static int frente = 0;   // posición del primer elemento
    static int fin = 0;      // posición donde entrará el próximo elemento
    static int cantidad = 0; // cuántos elementos hay

    public static boolean estaVacia() {
        return cantidad == 0;
    }

    public static boolean estaLlena() {
        return cantidad == cola.length;
    }

    // enqueue: encolar (agregar al final)
    public static void enqueue(int valor) {
        if (estaLlena()) {
            System.out.println("Cola llena: no se puede encolar " + valor);
            return;
        }
        cola[fin] = valor;
        fin = (fin + 1) % cola.length; // vuelve al inicio al llegar al final
        cantidad++;
        System.out.println("enqueue(" + valor + ")");
    }

    // dequeue: desencolar (sacar del frente)
    public static int dequeue() {
        if (estaVacia()) {
            System.out.println("Cola vacía: no hay nadie que atender");
            return -1;
        }
        int valor = cola[frente];
        frente = (frente + 1) % cola.length;
        cantidad--;
        return valor;
    }

    public static int peek() {
        return estaVacia() ? -1 : cola[frente];
    }

    public static void mostrar() {
        System.out.print("Cola (frente -> final): [");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(cola[(frente + i) % cola.length] + (i < cantidad - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   COLAS (QUEUE) EN JAVA
                             =========================================""");

        System.out.println();
        enqueue(101);
        enqueue(102);
        enqueue(103);
        mostrar();
        System.out.println("Primero en la fila (peek): " + peek());

        System.out.println("dequeue() -> " + dequeue());
        System.out.println("dequeue() -> " + dequeue());
        mostrar();

        // Cola circular: los espacios liberados al frente se reutilizan
        System.out.println("\n--- Reutilizando espacios (circular) ---");
        enqueue(104);
        enqueue(105);
        enqueue(106);
        enqueue(107); // ya está llena (capacidad 5)
        mostrar();

        // Simulación: turnos de atención en un banco
        System.out.println("\n--- Atención en el banco ---");
        while (!estaVacia()) {
            System.out.println("Atendiendo el turno #" + dequeue());
        }
        dequeue();

        // ADELANTO (Nivel 7): Java ya trae colas hechas en java.util
        Queue<String> colaJava = new LinkedList<>();
        colaJava.offer("Ana");
        colaJava.offer("Luis");
        colaJava.offer("Pedro");
        System.out.println("\nQueue de Java -> peek(): " + colaJava.peek() + ", poll(): " + colaJava.poll()
                + ", tamaño: " + colaJava.size());

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: COLAS (QUEUE)                   ║
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
 - Lección   : Colas (Queue)      
*/
// ============================================================================//
// ============================================================================//
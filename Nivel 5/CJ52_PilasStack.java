//=============================================================================//
//============================================================================//
/* 
 - Nombre    : Danny Jose Jimenez Gutierrez
 - Cedula    : 16.029.567
 - Telefono  : 0424.281.44.55
 - Profesión : Ingeniero en Informatica
 - Curso     : Curso de JAVA 2026 ♨️  
 - Lección   : Pilas (Stack)      
*/
// ============================================================================//
// ============================================================================//

import java.util.ArrayDeque;
import java.util.Deque;

public class CJ52_PilasStack {

  

    static int[] pila = new int[5];
    static int tope = -1; // -1 = pila vacía

    public static boolean estaVacia() {
        return tope == -1;
    }

    public static boolean estaLlena() {
        return tope == pila.length - 1;
    }

    // push: apilar un elemento
    public static void push(int valor) {
        if (estaLlena()) {
            System.out.println("Pila llena: no se puede apilar " + valor);
            return;
        }
        pila[++tope] = valor;
        System.out.println("push(" + valor + ")");
    }

    // pop: desapilar y devolver el elemento del tope
    public static int pop() {
        if (estaVacia()) {
            System.out.println("Pila vacía: no hay nada que sacar");
            return -1;
        }
        return pila[tope--];
    }

    // peek: ver el tope sin sacarlo
    public static int peek() {
        return estaVacia() ? -1 : pila[tope];
    }

    public static void mostrar() {
        System.out.print("Pila (base -> tope): [");
        for (int i = 0; i <= tope; i++) {
            System.out.print(pila[i] + (i < tope ? ", " : ""));
        }
        System.out.println("]");
    }

    // Aplicación 1: invertir un texto con una pila de caracteres
    public static String invertirTexto(String texto) {
        char[] p = new char[texto.length()];
        int t = -1;
        for (int i = 0; i < texto.length(); i++) {
            p[++t] = texto.charAt(i);
        }
        String resultado = "";
        while (t >= 0) {
            resultado += p[t--];
        }
        return resultado;
    }

    // Aplicación 2: verificar paréntesis balanceados
    public static boolean estaBalanceado(String expresion) {
        char[] p = new char[expresion.length()];
        int t = -1;
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                p[++t] = c;
            } else if (c == ')' || c == ']' || c == '}') {
                if (t == -1) return false;
                char abierto = p[t--];
                if ((c == ')' && abierto != '(') || (c == ']' && abierto != '[') || (c == '}' && abierto != '{')) {
                    return false;
                }
            }
        }
        return t == -1;
    }

    public static void main(String[] args) {

        System.out.println("""
                            =========================================
                             \t   PILAS (STACK) EN JAVA
                             =========================================""");

        System.out.println();
        push(10);
        push(20);
        push(30);
        mostrar();
        System.out.println("Tope (peek): " + peek());

        System.out.println("pop() -> " + pop());
        System.out.println("pop() -> " + pop());
        mostrar();

        push(40); push(50); push(60); push(70);
        push(80); // la pila tiene capacidad 5
        mostrar();

        System.out.println("\nVaciando la pila:");
        while (!estaVacia()) {
            System.out.print(pop() + " ");
        }
        System.out.println();
        pop();

        System.out.println("\n--- Aplicaciones ---");
        System.out.println("Invertir \"JAVA 2026\": " + invertirTexto("JAVA 2026"));
        System.out.println("¿\"(a + b) * [c - d]\" balanceado? " + estaBalanceado("(a + b) * [c - d]"));
        System.out.println("¿\"((a + b)\" balanceado?          " + estaBalanceado("((a + b)"));
        System.out.println("¿\"{[(x)]}\" balanceado?           " + estaBalanceado("{[(x)]}"));
        System.out.println("¿\"{[(x])}\" balanceado?           " + estaBalanceado("{[(x])}"));

        // ADELANTO (Nivel 7): Java ya trae pilas hechas en java.util
        Deque<Integer> pilaJava = new ArrayDeque<>();
        pilaJava.push(1);
        pilaJava.push(2);
        pilaJava.push(3);
        System.out.println("\nArrayDeque como pila -> pop(): " + pilaJava.pop() + ", peek(): " + pilaJava.peek());

        String mensaje = """
                ╔═══════════════════════════════════════╗
                ║  FIN: PILAS (STACK)                   ║
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
 - Lección   : Pilas (Stack)      
*/
// ============================================================================//
// ============================================================================//
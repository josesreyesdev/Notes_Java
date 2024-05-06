package jsr2.alura.university.main;

import jsr2.alura.university.models.pilas.Pila;

import java.util.Stack;

/* USABILIDAD: "PRIMER ELEMENTO EN ENTRAR ES EL ULTIMO EN SALIR"
*   Compiladores automatas, como el comando deshacer en editores de texto, código, imágenes, etc.
*      Se basa en baterias. También podemos jugar con las palabras e invertir el orden utilizando
*      las pilas.
*  */

public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila();

        // insertar
        pila.insert("Mauricio");
        System.out.println(pila);

        pila.insert("Guilherme");
        System.out.println(pila);

        System.out.println();

        // eliminar
        String remove1 = pila.remove();
        System.out.println(remove1);

        String remove2 = pila.remove();
        System.out.println(remove2);

        System.out.println(pila);

        // verifica si mi lista esta vacio
        System.out.println(pila.isEmpty());

        System.out.println();

        /* JAVA tiene su propia clase de pilas para agregar y eliminar */
        Stack<String> stack = new Stack<>();

        // add
        stack.push("Gab");
        stack.push("Diego");
        stack.push("Mauri");
        stack.push("Marcel");
        System.out.println(stack);

        // remove
        stack.pop(); // elimina el ultimo elemento
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        // peek() -> trae el ultimo elemento sin elimnarlo de la lista
        System.out.println(stack.peek());
    }
}

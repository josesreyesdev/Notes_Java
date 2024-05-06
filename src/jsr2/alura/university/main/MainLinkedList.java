package jsr2.alura.university.main;

import jsr2.alura.university.models.linkedList.LinkedList;

/* USABILIDAD:
*   proceso facil de hacer:
*   -> agregar un elemento en medio del array es un proceso facil, en este los
*   elementos estas uno al lado del otro en la memoria, pero uno apunta al siguiente.
*
*  */

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Agregar al principio
        System.out.println(list);
        list.addToTop("Mauricio");
        System.out.println(list);
        list.addToTop("Paulo");
        System.out.println(list);
        list.addToTop("Guilherme");
        System.out.println(list);

        System.out.println();

        // Agregar al final
        list.add("Marcelo");
        System.out.println(list);

        System.out.println();

        // Agregar en posicion espedifica
        list.addInPosition(2, "Gabriel");
        System.out.println(list);

        // Obtener en posicion especifica
        Object x = list.getElement(2);
        System.out.println(x);

        // Total de elementos
        System.out.println(list.size());

        // eliminar al principio
        list.removeToTop();
        System.out.println(list);

        // eliminar al final
        list.removeLast();
        System.out.println(list);

        list.addInPosition(2, "Pajin Boo");
        System.out.println(list);

        // eliminar en cualquier position
        list.remove(1);
        System.out.println(list);

        // Verificar si un elemento lo contiene la lista
        System.out.println(list.contains("Mauricio"));
        System.out.println(list.contains("danilo"));
    }
}

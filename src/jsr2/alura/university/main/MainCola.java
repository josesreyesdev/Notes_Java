package jsr2.alura.university.main;

/* USABILIDAD: "PRIMERO EN ENTRAR, PRIMERO EN SALIR"
*   "QueueOrCola"
*
*  */

import jsr2.alura.university.models.colas.QueueOrCola;

import java.util.LinkedList;
import java.util.Queue;

public class MainCola {
    public static void main(String[] args) {

        QueueOrCola cola = new QueueOrCola();

        // agregamos
        cola.insert("Meme Yamel");
        cola.insert("Guillermino");
        cola.insert("Diego");

        System.out.println(cola);

        System.out.println();

        // eliminar
        String remove1 = cola.remove();
        System.out.println("Student eliminado: " + remove1);

        System.out.println(cola);

        System.out.println("Lista vacia?: " + cola.isEmpty());

        System.out.println();

        /* LAS COLAS tiene sus propios metodos. */
        Queue<String> queueInJava = new LinkedList<>();

        // agregar
        queueInJava.add("Joshep");
        queueInJava.add("Mauri");
        System.out.println(queueInJava);

        // eliminar
        String remove01 = queueInJava.poll();
        System.out.println("Student eliminado: " + remove01);
        System.out.println(queueInJava);
    }
}

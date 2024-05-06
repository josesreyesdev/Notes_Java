package com00.first.java.ColeccionesWrappersLambdaExpressions.clases_anonimas_lambdas;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        /*
        Un Iterador es un objeto que tiene al menos dos métodos: hasNext() y next().
        Es decir, puede usarlo para preguntar si hay un próximo elemento y pedir el próximo elemento.
        La buena noticia es que funciona con TODAS las implementaciones y esa es la gran ventaja.
        * */

        List<String> nombres = new ArrayList<>();
        nombres.add("Super Mario");
        nombres.add("Yoshi");
        nombres.add("Donkey Kong");

        Iterator<String> it = nombres.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

         /* Iterator sobre un Set o conjunto */
        Set<String> nombres2 = new HashSet<>();
        nombres2.add("Super Mario");
        nombres2.add("Yoshi");
        nombres2.add("Donkey Kong");

        Iterator<String> it2 = nombres2.iterator();

        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}

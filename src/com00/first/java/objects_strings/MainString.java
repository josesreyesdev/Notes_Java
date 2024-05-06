package com00.first.java.objects_strings;

public class MainString {
    public static void main(String[] args) {
        String name = "Alura";

        //String name2 = new String("Alura");

        System.out.println("value name = "+ name);
        name = name.replace('A', 'a');
        System.out.println("value name = "+ name);

        name = name.concat(" cursos online");
        System.out.println("value name = "+ name);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        int size = name.length();
        System.out.println(name + " have " + size + " lengths");

        char letra = name.charAt(3);
        System.out.println("Letra: "+ letra);

        int indice = name.indexOf('e');
        System.out.println("'e' encontrado en el index: " + indice);

        //Concatenacion de una String con StringBuilder
        StringBuilder builder = new StringBuilder("Alura");
        builder.append("-");
        builder.append("me ");
        builder.append("subi ");
        builder.append("en el ");
        builder.append("onmibus ");
        builder.append("equivocado ");

        String text = builder.toString();
        System.out.println(text);

        /*
        * StringBuilder tambien implementa CharSequence, por tanto las clases Strings
        * saben como trabajar con StringBuilder y viceversa
        * */
        System.out.println();
        String alura = "ALURA";
        CharSequence cs = new StringBuilder("al");
        alura = alura.replace("AL", cs);
        System.out.println(alura);

        //Elimina el indice indicado
        System.out.println();
        String sub = alura.substring(1);
        System.out.println(sub);

        //Mostrando todos los caracteres linea por linea
        for (int i = 0; i < alura.length(); i++) {
            System.out.println( "Index["+i+"]" + " = " + alura.charAt(i));
        }
    }
}

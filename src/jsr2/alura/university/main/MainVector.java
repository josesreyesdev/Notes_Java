package jsr2.alura.university.main;

import jsr2.alura.university.models.vector.Student;
import jsr2.alura.university.models.vector.Vector;

/* USABILIDAD:
*   Procesos faciles de hacer:
*   -> Agregar al final del vector
*   -> Tomar un elemento aleatorio
*   -> Eliminar elementos
*
*   Procesos no faciles de hacer:
*   -> insertar un elemento en medio de la lista, ya que es muy costosa y un proceso de ejecución lento
*
* */

public class MainVector {
    public static void main(String[] args) {
        Student student1 = new Student("Juan");
        Student student2 = new Student("Jose");
        Student student3 = new Student("Diego");
        Student student4 = new Student("Danilo");

        Vector list = new Vector();

        // agregando un student
        list.add(student1);
        list.add(student2);
        list.add(student3);

        // total alumnos de mi lista
        System.out.println("Total de estudiantes: " + list.size());
        System.out.println(list);

        // verificar si mi lista contiene un estudiante
        System.out.println(list.contains(student3)); // true
        System.out.println(list.contains(student4)); // false

        System.out.println(list);

        // obtener un alumno en una posicion
        int position = 1;
        Student st = list.getStudent(position);
        System.out.println("Student en la position[" + position + "] : " + st);

        // agregar un student a una position especifica
        list.addInPosition(1, student4);
        System.out.println(list);

        // Quitar un student
        list.remove(1);
        System.out.println(list);

        // add 300 students
        for (int i = 0; i < 300; i++) {
            Student y = new Student("Joao" + i);
            list.add(y);
        }
        System.out.println();
        System.out.println(list);
    }
}

package jsr2.alura.university.models.colas;

import java.util.LinkedList;
import java.util.List;

public class QueueOrCola {

    private List<String> students = new LinkedList<>();

    // adiciona
    public void insert(String student) {
        students.add(student);
    }

    // eliminar
    public String remove() {
        return students.remove(0);
    }

    // Verificar ssi esta vacio
    public boolean isEmpty() {
        return students.isEmpty(); // students.size() == 0;
    }

    @Override
    public String toString() {
        return students.toString();
    }
}

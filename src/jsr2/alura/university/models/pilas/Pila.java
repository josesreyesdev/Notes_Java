package jsr2.alura.university.models.pilas;

import java.util.LinkedList;
import java.util.List;

public class Pila {

    private List<String> names = new LinkedList<>();

    // inserta uno tras otro
    public void insert(String name) {
        names.add(name);
    }

    // elimina uno tras otro
    public String remove() {
        return names.remove(names.size() - 1);
    }

    public boolean isEmpty() {
        return names.isEmpty(); // names.size() == 0;
    }

    @Override
    public String toString() {
        return names.toString();
    }
}

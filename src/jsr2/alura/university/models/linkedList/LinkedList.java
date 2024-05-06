package jsr2.alura.university.models.linkedList;

public class LinkedList {

    private CellOrCelda first = null;
    private int totalElements = 0;

    private CellOrCelda last = null; // ultimo

    // agregar al principio
    public void addToTop(Object element) {
        if (this.totalElements == 0) {
            CellOrCelda newCell = new CellOrCelda(element);
            this.first = newCell;
            this.last = newCell;

        } else {
            CellOrCelda newCell = new CellOrCelda(element, this.first);
            this.first.setPrevious(newCell);
            this.first = newCell;
        }

        this.totalElements++;
    }

    // agregar al final
    public void add(Object element) {
        if (this.totalElements == 0) {
            addToTop(element);
        } else {
            CellOrCelda newCell = new CellOrCelda(element);
            this.last.setNext(newCell);
            newCell.setPrevious(this.last);
            this.last = newCell;
            this.totalElements++;
        }
    }

    // agregar en posicion especifica
    public void addInPosition(int position, Object element) {

        if (position == 0 ) {
            addToTop(element);
        } else if (position == this.totalElements) {
            this.add(element);
        } else {
            CellOrCelda previous = findCell(position - 1);
            CellOrCelda next = previous.getNext();

            CellOrCelda newCell = new CellOrCelda(element, previous.getNext());
            newCell.setPrevious(previous);
            previous.setNext(newCell);
            next.setPrevious(newCell);
            this.totalElements++;
        }
    }

    private boolean positionOccupied(int position) {
        return position >= 0 && position < this.totalElements;
    }

    private CellOrCelda findCell(int position) {
        if (!positionOccupied(position)) {
            throw new IllegalArgumentException("Posición inexistente");
        }

        CellOrCelda current = first;

        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        return current;
    }

    // obtener elemento
    public Object getElement(int position) {
        return this.findCell(position).getElement();
    }

    // eliminar
    public void remove(int position) {
        if (position == 0) {
            this.removeToTop();
        } else if (position == this.totalElements - 1) {
            this.removeLast();
        } else {
            CellOrCelda previous = this.findCell(position - 1);
            CellOrCelda current = previous.getNext();
            CellOrCelda next = current.getNext();

            previous.setNext(next);
            next.setPrevious(previous);

            this.totalElements--;
        }
    }

    public void removeToTop() { // eliminar al principio
        if (this.totalElements == 0) {
            throw new IllegalArgumentException("Lista vacia");
        }

        this.first = this.first.getNext();
        this.totalElements--;

        if (this.totalElements == 0) {
            this.last = null;
        }
    }

    public void removeLast() {
        if (this.totalElements == 1) {
            this.removeToTop();
        } else {
            CellOrCelda penultima = this.last.getPrevious();
            penultima.setNext(null);
            this.last = penultima;
            this.totalElements--;
        }
    }

    // tamaño
    public int size(){
        return this.totalElements;
    }

    // Contiene
    public boolean contains(Object element) {

        CellOrCelda current = this.first;

        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public String toString() {
        if (this.totalElements == 0) {
            return "[]";
        }

        CellOrCelda current = first;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(current.getElement());
            builder.append(",");

            current = current.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}

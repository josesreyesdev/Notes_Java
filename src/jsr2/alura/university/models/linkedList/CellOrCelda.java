package jsr2.alura.university.models.linkedList;

public class CellOrCelda {

    private Object element;
    private CellOrCelda next;

    private CellOrCelda previous;

    public CellOrCelda(Object element) {
        this(element, null);
    }

    public CellOrCelda(Object element, CellOrCelda next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public CellOrCelda getNext() {
        return next;
    }

    public void setNext(CellOrCelda next) {
        this.next = next;
    }

    public CellOrCelda getPrevious() {
        return previous;
    }

    public void setPrevious(CellOrCelda previous) {
        this.previous = previous;
    }
}

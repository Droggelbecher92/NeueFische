package de.kittlaus.classes;

public class GenericLinkedList<T>{

    private final T value ;
    private T erstesItem;
    private T next;

    public GenericLinkedList(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public T getErstesItem() {
        return erstesItem;
    }

    public void setErstesItem(T erstesItem) {
        this.erstesItem = erstesItem;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }

    public boolean isEmpty() {
        return value == null;
    }


    public void add(T newValue) {
        if (isEmpty()) {
            setErstesItem(newValue);
        }
        while (getNext() != null) {
            getNext();
        }
        setNext(newValue);
    }

    public void remove(T valueToRemove) {
        if(specialCaseCheckerTurnsOn(valueToRemove)){
            return;
        }
        AnimalListItem current = head;
        int counter = 0;
        while (current.getValue()!=valueToRemove) {
            current = current.getNext();
            counter++;
        }
        AnimalListItem beforeToDelete = head;
        for (int i = 0; i >= counter; i++) {
            beforeToDelete = beforeToDelete.getNext();
        }
        beforeToDelete.setNext(current.getNext());
    }

    private boolean valueIsInList(T value) {
        T compareItem = erstesItem;
        while (getNext() != null) {
            if (getValue() == value) {
                return true;
            }
            compareItem = getNext();
        }
        return false;
    }

    private boolean specialCaseCheckerTurnsOn(T value) {
        if (isEmpty()) {
            return true;
        }
        if (getErstesItem() == value) {
            erstesItem = getNext();
            return true;
        }
        if (valueIsInList(value)) {
            return false;
        }
        return true;
    }

}

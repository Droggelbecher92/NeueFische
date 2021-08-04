package de.kittlaus.classes;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class AnimalList {

    GenericLinkedList<Animal> blob = new GenericLinkedList<>(new Animal("Peter"));


    public AnimalList(Animal whichAnimal) {
            AnimalListItem newItem = new AnimalListItem(whichAnimal);
        }




    @Override
    public String toString() {
        if (blob.isEmpty()) {
            return "";
        }
        StringBuilder completeString = new StringBuilder(blob.getErstesItem().getValue().getName());
        AnimalListItem toAdd = erstesItem.getNext();
        while (toAdd != null) {
            completeString.append(" -> ").append(toAdd.getValue().getName());
            toAdd = toAdd.getNext();
        }
        return completeString.toString();
    }





}
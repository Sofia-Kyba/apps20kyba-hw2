package ua.edu.ucu.collections;

import jdk.nashorn.internal.objects.annotations.Getter;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import java.util.LinkedList;

public class Queue {
    private ImmutableLinkedList items;

    public Queue(){
        this.items = new ImmutableLinkedList();
    }

    public Queue(ImmutableLinkedList items){
        this.items = items;
    }

    public Object peek(){
        return items.getFirst();
    }

    public Object dequeue(){
        Object peek = items.getFirst();
        items = items.removeFirst();
        return peek;
    }

    public void enqueue(Object e){
        items = items.addLast(e);
    }

    public ImmutableLinkedList getItems() {
        return items;
    }
}

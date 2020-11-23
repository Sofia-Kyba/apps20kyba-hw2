package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList items;

    public Stack(){
        this.items = new ImmutableLinkedList();
    }

    public Stack(ImmutableLinkedList items){
        this.items = items;
    }

    public Object peek(){
        return items.getFirst();
    }

    public Object pop(){
        Object peek = items.getFirst();
        items = items.removeFirst();
        return peek;
    }

    public void push(Object e){
        items = items.addFirst(e);
    }

    public ImmutableLinkedList getItems() {
        return items;
    }
}

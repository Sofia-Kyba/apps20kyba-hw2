package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList items;

    public Stack(){
        this.items = new ImmutableLinkedList();
    }

    public Object peek(){
        return items.getFirst();
    }

    public Object pop(){
        items = items.removeFirst();
        return items.getFirst();
    }

    public void push(Object e){
        items = items.addFirst(e);
    }


}

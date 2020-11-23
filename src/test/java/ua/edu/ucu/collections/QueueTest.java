package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableArrayList;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testPeek() {
        Integer [] intArray = {1, 5, 7};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Queue queue = new Queue(elements);
        Object actualResult = queue.peek();
        Object expected = 1;
        assertEquals(expected, actualResult);

    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testPeekEmpty() {
        Queue queue = new Queue();
        Object actualResult = queue.peek();
    }

    @Test
    public void testDequeue() {
        Integer [] intArray = {9, 77, 5, 0, 6};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Queue queue = new Queue(elements);
        Object actualResult = queue.dequeue();
        Object expected = 9;
        assertEquals(expected, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testDequeueEmpty() {
        Queue queue = new Queue();
        Object actualResult = queue.dequeue();
    }

    @Test
    public void testEnqueue() {
        Integer [] intArray = {1, 1, 23, 2};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Queue queue = new Queue(elements);
        queue.enqueue(55);
        String expected = "[1, 1, 23, 2, 55]";
        Object actualResult = queue.getItems().toString();
        assertEquals(expected, actualResult);
    }
}

package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPeek() {
        Integer [] intArray = {0, 1, 2};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Stack stack = new Stack(elements);
        Object actualResult = stack.peek();
        Object expected = 0;
        assertEquals(expected, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testPeekEmpty() {
        Stack stack = new Stack();
        Object actualResult = stack.peek();
    }

    @Test
    public void testPop() {
        Integer [] intArray = {9, 4, 1, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Stack stack = new Stack(elements);
        Object actualResult = stack.pop();
        Object expected = 9;
        assertEquals(expected, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testPopEmpty() {
        Stack stack = new Stack();
        Object actualResult = stack.pop();
    }

    @Test
    public void testPush() {
        Integer [] intArray = {1, 1, 23, 2};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Stack stack = new Stack(elements);
        stack.push(55);
        String expected = "[55, 1, 1, 23, 2]";
        Object actualResult = stack.getItems().toString();
        assertEquals(expected, actualResult);
    }

}

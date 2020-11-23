package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testMethodAdd() {
        Integer [] intArray = {1, 5};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.add(3).toString();
        String expectedResult = "[1, 5, 3]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodAddByIndex() {
        Integer [] intArray = {1, 11, 0, 8};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.add(2, 9).toString();
        String expectedResult = "[1, 11, 9, 0, 8]";
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodAddByIndexException() {
        ImmutableLinkedList elements = new ImmutableLinkedList();
        ImmutableLinkedList newElements = (ImmutableLinkedList) elements.add(8, 2);
    }

    @Test
    public void testMethodAddAll() {
        Integer[] intArray = {1, 5, 8};
        Integer[] intArray2 = {0, 8, 8};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.addAll(intArray2).toString();
        String expectedResult = "[1, 5, 8, 0, 8, 8]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodGet() {
        Integer[] intArray = {2, 9, 1, 1, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Object actualResult = elements.get(2);
        Object expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodGetException() {
        Integer[] intArray = {1, 5, 8};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Object actualResult = elements.get(10);
    }

    @Test
    public void testMethodRemove() {
        Integer [] intArray = {1, 1, 3, 1, 8};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.remove(4).toString();
        Object expectedResult = "[1, 1, 3, 1]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSet() {
        Integer [] intArray = {1, 4, 4, 11};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.set(3, 99).toString();
        Object expectedResult = "[1, 4, 4, 99]";
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodSetException() {
        Integer [] intArray = {1, 0, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.set(9, 1).toString();
    }

    @Test
    public void testMethodIndexOf() {
        Integer [] intArray = {0, 0, 33, 12, 99, 99, 5, 6};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        int actualResult = elements.indexOf(99);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodIndexOfException() {
        ImmutableLinkedList elements = new ImmutableLinkedList();
        int actualResult = elements.indexOf(23);
        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSize() {
        Integer [] intArray = {0, 6};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        int actualResult = elements.size();
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSize2() {
        ImmutableLinkedList elements = new ImmutableLinkedList();
        int actualResult = elements.size();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodClear() {
        Integer [] intArray = {99, 0, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.clear().toString();
        String expectedResult = "[]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodIsEmpty() {
        ImmutableLinkedList elements = new ImmutableLinkedList();
        boolean actualResult = elements.isEmpty();
        assertTrue(actualResult);
    }

    @Test
    public void testMethodIsEmpty2() {
        Integer [] intArray = {99};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        boolean actualResult = elements.isEmpty();
        assertFalse(actualResult);
    }

    @Test
    public void testMethodToArray() {
        Integer [] intArray = {6, 0, 1, 76, 0};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Object [] actualResult = elements.toArray();
        Object [] expectedResult = {6, 0, 1, 76, 0};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodAddFirst() {
        Integer [] intArray = {6, 0, 1, 0};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.addFirst(8).toString();
        String expectedResult = "[8, 6, 0, 1, 0]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodAddLast() {
        Integer [] intArray = {0};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.addLast(99).toString();
        String expectedResult = "[0, 99]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodGetFirst() {
        Integer [] intArray = {99, 87, 5, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Object actualResult = elements.getFirst();
        Object expectedResult = 99;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodGetLast() {
        Integer [] intArray = {99, 87, 5, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        Object actualResult = elements.getLast();
        Object expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodRemoveFirst() {
        Integer [] intArray = {8, 4, 4, 5, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.removeFirst().toString();
        String expectedResult = "[4, 4, 5, 1]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodRemoveLast() {
        Integer [] intArray = {9, 0, 4, 3, 1};
        ImmutableLinkedList elements = new ImmutableLinkedList(intArray);
        String actualResult = elements.removeLast().toString();
        String expectedResult = "[9, 0, 4, 3]";
        assertEquals(expectedResult, actualResult);
    }
}

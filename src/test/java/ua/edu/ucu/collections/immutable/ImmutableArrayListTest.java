package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testMethodAdd() {
        Integer [] intArray = {1, 5};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        String actualResult = elements.add(3).toString();
        String expectedResult = "[1, 5, 3]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodAddByIndex() {
        Integer [] intArray = {1, 5, 8};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        ImmutableArrayList newElements = (ImmutableArrayList) elements.add(0, 9);
        String expectedResult = "[9, 1, 5, 8]";
        String actualResult = newElements.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodAddByIndexException() {
        ImmutableArrayList elements = new ImmutableArrayList();
        ImmutableArrayList newElements = (ImmutableArrayList) elements.add(3, 9);
    }

    @Test
    public void testMethodAddAll() {
        Integer [] intArray = {1, 5, 8};
        Integer [] intArray2 = {0, 8, 8};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        ImmutableArrayList newElements = (ImmutableArrayList) elements.addAll(intArray2);
        String expectedResult = "[1, 5, 8, 0, 8, 8]";
        String actualResult = newElements.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodGet() {
        Integer[] intArray = {0, 4, 8, 0};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        Object actualResult = elements.get(2);
        Object expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodGetException() {
        Integer[] intArray = {1, 5, 8};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        Object actualResult = elements.get(10);
    }

    @Test
    public void testMethodRemove() {
        Integer [] intArray = {1, 5, 0, 7, 8};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        String actualResult = elements.remove(2).toString();
        String expectedResult = "[1, 5, 7, 8]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSet() {
        Integer [] intArray = {1, 1, 1, 7};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        String actualResult = elements.set(3, 1).toString();
        String expectedResult = "[1, 1, 1, 1]";
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMethodSetException() {
        Integer [] intArray = {1, 1, 1};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        String actualResult = elements.set(4, 1).toString();
    }

    @Test
    public void testMethodIndexOf() {
        Integer [] intArray = {5, 11, 6, 7};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        int actualResult = elements.indexOf(11);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodIndexOfException() {
        ImmutableArrayList elements = new ImmutableArrayList();
        int actualResult = elements.indexOf(11);
        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSize() {
        Integer [] intArray = {5, 11, 6, 7, 8, 13};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        int actualResult = elements.size();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodSize2() {
        ImmutableArrayList elements = new ImmutableArrayList();
        int actualResult = elements.size();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodClear() {
        Integer [] intArray = {12, 0, 0, 7, 8, 44};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        String actualResult = elements.clear().toString();
        String expectedResult = "[]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMethodIsEmpty() {
        ImmutableArrayList elements = new ImmutableArrayList();
        boolean actualResult = elements.isEmpty();
        assertTrue(actualResult);
    }

    @Test
    public void testMethodIsEmpty2() {
        Integer [] intArray = {5, 1};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        boolean actualResult = elements.isEmpty();
        assertFalse(actualResult);
    }

    @Test
    public void testMethodToArray() {
        Integer [] intArray = {6, 10, 9, 7, 8, 23};
        ImmutableArrayList elements = new ImmutableArrayList(intArray);
        Object [] actualResult = elements.toArray();
        Object [] expectedResult = {6, 10, 9, 7, 8, 23};
        assertArrayEquals(expectedResult, actualResult);
    }
}

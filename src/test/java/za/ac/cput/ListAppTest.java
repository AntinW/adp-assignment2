package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListAppTest {
    List list;
    @BeforeEach
    void setUp() {
        list = new LinkedList();
        list.add(0, "Apples");
        list.add(1, "Bananas");
        list.add(2, "Oranges");
    }
    @Test
    public void testListAdd(){
        list.add(3, "Peaches");
        assertTrue(list.contains("Peaches"));
    }
    @Test
    public void testListRemove(){
        list.remove("Apples");
        assertFalse(list.contains("Apples"));
    }
    @Test
    public void testListFind(){
        assertTrue(list.contains("Bananas"));
    }
}
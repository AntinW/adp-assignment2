package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CollectionAppTest {
    Collection<String> collection;
    @BeforeEach
    void setUp() {
        collection = new Stack();
        collection.add("Harry Potter");
        collection.add("Game of Thrones");
        collection.add("Magicians");
    }
    @Test
    public void testCollectionAdd(){
        collection.add("Twilight");
        assertTrue(collection.contains("Twilight"));
    }
    @Test
    public void testCollectionRemove(){
        collection.remove("Harry Potter");
        assertFalse(collection.contains("Harry Potter"));
    }
    @Test
    public void testCollectionFind(){
        assertTrue(collection.contains("Magicians"));
    }
}
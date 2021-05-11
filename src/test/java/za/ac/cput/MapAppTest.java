package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class MapAppTest
{
    Map<Integer, String> map;
    Set set;
    List list;
    Collection collection;


    @BeforeEach
    void setUp(){
        map = new HashMap();
        map.put(1, "Antin");

        set = new HashSet();
        list = new LinkedList();
        collection = new Stack();
    }
    @Test
    public void testMapAdd()
    {
        assertFalse(map.isEmpty());
    }
    @Test
    public void testMapRemove(){
        map.remove(1);
        assertTrue(map.isEmpty());
    }
    @Test
    public void testMapFind(){
        assertSame("Antin", map.get(1));
    }
}

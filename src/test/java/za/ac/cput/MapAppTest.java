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

    @BeforeEach
    void setUp(){
        map = new HashMap();
        map.put(1, "Antin");
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

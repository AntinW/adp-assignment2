package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetAppTest {
    Set<String> set;

    @BeforeEach
    void setUp() {
        set = new HashSet();
        set.add("Africa");
        set.add("Australia");
        set.add("Asia");
    }
    @Test
    public void testSetAdd(){
        set.add("America");
        assertTrue(set.contains("America"));
    }
    @Test
    public void testSetRemove(){
        set.remove("Australia");
        assertFalse(set.contains("Australia"));
    }
    @Test
    public void testSetFind(){
        assertTrue(set.contains("Asia"));
    }
}
package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class MapApp
{

    public static void main( String[] args )
    {
        Map map = new HashMap();
        map.put(1, "Antin Williams");
        map.put(2, "John Doe");
        System.out.println(map);
        System.out.println(map.get(1));
        map.remove(1);
    }
}

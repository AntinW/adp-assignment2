package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

    public static void main( String[] args )
    {
        Set set = new HashSet();
        set.add("Asia");
        set.add("Australia");
        set.add("America");
        set.add("Africa");
        set.remove("America");
        System.out.println("Does this set contain America?" + set.contains("America"));
    }



}

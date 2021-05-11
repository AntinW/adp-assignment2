package za.ac.cput;

import java.util.Collection;
import java.util.Stack;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new Stack();
        collection.add("Harry Potter");
        collection.add("Magicians");
        collection.add("Game of Thrones");
        collection.add("Twilight");
        collection.remove("Twilight");
        System.out.println("Does the stack contain Magicians? " + collection.contains("Magicians"));
    }
}

package za.ac.cput;

import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Apples");
        list.add("Bananas");
        list.add("Oranges");
        list.add("Peaches");
        list.remove("Peaches");
        System.out.println("Does list contain Peaches? " + list.contains("Peaches"));
    }
}

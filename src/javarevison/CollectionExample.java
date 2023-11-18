package javarevison;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
public class CollectionExample {

    public static void main(String[] args) {
        ArrayList<String> list = createList();
        System.out.println(checkColourIsAvailableInList(list, "Purple"));
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
    }

    public static boolean checkColourIsAvailableInList(ArrayList<String> list, String colourName) {
        for (String colour : list) {
            if (colour.equals(colourName)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList();
        list.add("Green");
        list.add("White");
        list.add("Red");
        list.add("Black");
        return list;
    }
}

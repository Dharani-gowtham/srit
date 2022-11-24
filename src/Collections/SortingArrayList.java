package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Karthick");
        list.add("Gopal");
        list.add("Johny");
        list.add("Thalapathy");
        list.add("Masood");
        list.add("Bala");

        Collections.sort(list);
        System.out.println(list);
    }
}

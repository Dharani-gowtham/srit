package Collections;

import java.util.ArrayList;

public class forEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Karthick");
        list.add("Gopal");
        list.add("Johny");
        list.add("Thalapathy");
        list.add("Masood");
        list.add("Bala");

        for (String name:list){
            System.out.println(name);
        }
    }
}

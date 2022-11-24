package Collections;

import java.util.Hashtable;
import java.util.Map;

public class SimpleHashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(100,"user1");
        hashtable.put(101,"user2");
        hashtable.put(102,"user3");

        for(Map.Entry value: hashtable.entrySet()){
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }
}

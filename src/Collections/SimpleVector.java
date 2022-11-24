package Collections;

import java.util.Vector;

public class SimpleVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Pig");
        vector.add("Monkey");
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Elephant");
        vector.addElement("Lion");
        vector.addElement("Leo");

        System.out.println(vector);
    }
}

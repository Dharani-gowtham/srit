import java.util.Hashtable;
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        // Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();


        v.addElement(1);
        v.addElement(2);

        h.put(1, "geeks");
        h.put(2, "4geeks");


        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

    }
}
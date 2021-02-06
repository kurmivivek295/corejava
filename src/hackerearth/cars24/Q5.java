package hackerearth.cars24;

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Q5
{
    public static void main(String[] args)
    {
        int hack_arr[] = new int[] { 4, 3, 2, 1 };
        Vector<Integer> hack_vector_obj = new Vector();
        Hashtable<Integer, String> hack_hashtable_obj = new Hashtable();
        hack_vector_obj.addElement(1);
        hack_vector_obj.addElement(2);
        hack_hashtable_obj.put(3, "Hi");
        hack_hashtable_obj.put(1, "Hello");
        System.out.println(hack_arr[0]);
        System.out.println(hack_vector_obj.elementAt(0));
        System.out.println(hack_hashtable_obj.get(1));
    }
}

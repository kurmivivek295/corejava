package hackerearth.cars24;

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Q3 {
    enum MyFruits
    {
        Apple, Mango, Banana, Strawberry
    }
    public static void main(String[] args)
    {
        EnumMap<MyFruits, String> myhackobj1 = new EnumMap<>(MyFruits.class);
        myhackobj1.put(MyFruits.Apple, "Red");
        myhackobj1.put(MyFruits.Mango, "Green");
        System.out.println("Set 1: " + myhackobj1);
        EnumMap<MyFruits, String> myhackobj2 = new EnumMap<>(MyFruits.class);
        myhackobj2.putAll(myhackobj1);
        myhackobj2.put(MyFruits.Banana, "Yellow");
        System.out.println("Set 2: " + myhackobj2);
    }
}
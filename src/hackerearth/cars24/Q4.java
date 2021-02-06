package hackerearth.cars24;

import java.util.*;
        import java.lang.*;
class HackClass<T>
{
    T hackobj;
    HackClass(T hackobj) { this.hackobj = hackobj; }
    public T hackfunc()
    {
        return this.hackobj;

    }
}
public class Q4
{
    public static void main (String[] args)
    {
        HackClass <Integer> hackobj1 = new HackClass<Integer>(15);
        System.out.println(hackobj1.hackfunc());
        HackClass <String> hackobj2 = new HackClass<String>("Hello HackerEarth");
        System.out.println(hackobj2.hackfunc());
    }
}

package hackerearth.cars24;

import java.util.*;
        import java.lang.*;
class MyHackClassThreads implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println (Thread.currentThread().getId());
        }
        catch (Exception e)
        {
            System.out.println ("Exception");
        }
    }
}
public class Q7
{
    public static void main(String[] args)
    {
        int a = 2;
        int n = a+a*a-a;
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new MyHackClassThreads());
            object.start();
        }
    }
}

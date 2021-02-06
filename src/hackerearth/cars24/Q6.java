package hackerearth.cars24;

import java.util.*;
        import java.lang.*;
class Test<T extends HackClass1>
{
    private T myObj;
    public Test(T obj)
    {
        this.myObj = obj;
    }
    public void hackFunc(){
        this.myObj.hackFunc1();
    }
}
class HackClass1
{
    public void hackFunc1()
    {
        System.out.println("Statement 1");
    }
}
class Hackclass2 extends HackClass1
{
    public void hackFunc1()
    {
        System.out.println("Statement 2");
    }
}
class Hackclass3 extends HackClass1
{
    public void hackFunc1()
    {
        System.out.println("Statement 3");
    }
}
public class Q6
{
    public static void main(String a[])
    {
        Test<Hackclass3> hackobj1 = new Test<Hackclass3>(new Hackclass3());
        hackobj1.hackFunc();
        Test<Hackclass2> hackobj2 = new Test<Hackclass2>(new Hackclass2());
        hackobj2.hackFunc();
        Test<HackClass1> hackobj3 = new Test<HackClass1>(new HackClass1());
        hackobj3.hackFunc();
    }
}

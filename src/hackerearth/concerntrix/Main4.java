package hackerearth.concerntrix;

import java.lang.*;

public class Main4
{
    int a;int b=9;
    public int sum()
    {
        return a+b;
    }
    private int add()
    {
        return a+b;
    }
    int result()
    {
        return new Main4().add();
    }
    public static void main(String []aa)
    {
        Main4 e=new Main4();
        System.out.println(e.sum()+e.result()+e.add());
    }
}

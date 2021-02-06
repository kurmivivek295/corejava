package company.amadeus;

class First
{
    public First() {  System.out.println("a"); }
}

class Second extends First
{
    public Second()  {  System.out.println("b"); }
}

class Third extends Second
{
    public Third()   {  System.out.println("c"); }
}

public class Q5 {
    public static void main(String[] args)
    {
        Third c = new Third();
    }
}

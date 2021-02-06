package company.amadeus;

class Base {
    public void Print()
    {
        System.out.println("Base ");
    }
}

class Derived extends Base {
    public void Print()
    {
        System.out.println("Derived ");
    }
}

public class Q2 {
//    public static void DoPrint(Base o)
//    {
//        System.out.println("doprint(Base)");
//        o.Print();
//    }
    public static void DoPrint(Derived o)
    {
        System.out.println("doprint(Derived)");
        o.Print();
    }
    public static void main(String[] args)
    {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
//        DoPrint((Derived) x);
        DoPrint((Derived)y);
        DoPrint(z);
    }
}

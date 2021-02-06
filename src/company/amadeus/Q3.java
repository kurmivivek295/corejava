package company.amadeus;

class Point {
    protected int x, y;

    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}

public class Q3 {
    public static void main(String args[])
    {
//      Actual question but its compile time error
//        Point p = new Point();

        Point p = new Point(10, 20);
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}

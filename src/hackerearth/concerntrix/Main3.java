package hackerearth.concerntrix;

import java.lang.*;

public class Main3
{
    public static void main(String[] args)
    {
        String regex = ".@.";
        Main3.compare("Hacker@Earth.com", regex);
        Main3.compare("a@N", regex);
        Main3.compare("Java@Program", regex);
    }
    public static void compare(String str, String regex)
    {
        if (str.matches(regex))
        {
            System.out.println(str + " matches");
        }
        else
        {
            System.out.println(str + " does not match");
        }
    }
}

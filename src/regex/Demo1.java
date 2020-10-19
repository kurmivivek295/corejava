package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("/d");
        System.out.println(pattern.matcher("1").find());
        System.out.println(pattern.matcher("123").find());
        System.out.println(pattern.matcher("a").find());


    }

}

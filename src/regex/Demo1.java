package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Demo1 {

    public static void main(String[] args) {

        System.out.println("abcdef".matches(".d."));
        System.out.println("abcdef".matches(".b.d.f"));
        System.out.println(Arrays.asList("23, 25, 26, 27".split(",")));
        System.out.println(Arrays.asList("Hi this is Vivek".split(" ")));

        // Invalid regex string xxx
        System.out.println(Arrays.asList("Hi this is Vivek".split("xxx")));
        // Invalid regex string ""
        System.out.println(Arrays.asList("Hi this is Vivek".split("")));
        // Invalid regex string . will return nothing as . matched with any char
        System.out.println(Arrays.asList("Hi this is Vivek".split(".")));

        // Invalid regex string a will return nothing as a matched with all a
        System.out.println(Arrays.asList("aaaa".split("a")));
        // Consider below cases
        System.out.println(Arrays.asList("11aaaa".split("a")));
        System.out.println(Arrays.asList("aaaa11".split("a")));
        System.out.println(Arrays.asList("aa11aa".split("a")));

        // String replace does not support regex
        System.out.println(Arrays.asList("one + one = 2".replace("on.", "1")));
        // these two works with regex
        System.out.println(Arrays.asList("one + one = 2".replaceAll("on.", "1")));
        System.out.println(Arrays.asList("one + one = 2".replaceFirst("on.", "1")));

        Pattern pattern = Pattern.compile(",");
        String[] split = pattern.split("1,2,3,4,5");
        System.out.println(Arrays.asList(split));

        Pattern pattern1 = Pattern.compile("/");
        Matcher matcher = pattern1.matcher("3/2/2021");
        System.out.println(matcher.replaceAll("-"));

        Pattern pattern2 = Pattern.compile("\\d");
        System.out.println(pattern2.matcher("1").matches());
        System.out.println(pattern2.matcher("123").matches());
        System.out.println(pattern2.matcher("a1").matches());

        Pattern pattern3 = Pattern.compile("\\d\\d");
        System.out.println(pattern3.matcher("12").matches());
        System.out.println(pattern3.matcher("123").matches());
        System.out.println(pattern3.matcher("a1").matches());

        Pattern pattern4 = Pattern.compile("\\w");
        System.out.println(pattern4.matcher("1").matches());
        System.out.println(pattern4.matcher("123").matches());
        System.out.println(pattern4.matcher("a1").matches());

        Pattern pattern5 = Pattern.compile("\\W");
        System.out.println(pattern5.matcher("@").matches());
        System.out.println(pattern5.matcher("1").matches());
        System.out.println(pattern5.matcher("123").matches());
        System.out.println(pattern5.matcher("a1").matches());

        Pattern pattern6 = Pattern.compile("[0-9]");
        System.out.println(pattern6.matcher("1").matches());
        System.out.println(pattern6.matcher("123").find());

        Pattern pattern7 = Pattern.compile("[\\w&&[0-9]]");
        System.out.println(pattern7.matcher("1").find());
        System.out.println(pattern7.matcher("123").find());
        System.out.println(pattern7.matcher("a1").find());
        System.out.println(pattern7.matcher("1a").find());

        Pattern pattern8 = Pattern.compile("[\\w&&[^0-9]]");
        System.out.println(pattern8.matcher("1").find());
        System.out.println(pattern8.matcher("123").find());
        System.out.println(pattern8.matcher("a1").find());
        System.out.println(pattern8.matcher("1a").find());

        Pattern pattern9 = Pattern.compile("abc|de");
        System.out.println(pattern9.matcher("abc def").find());
        pattern9 = Pattern.compile("a(bc|de)");
        System.out.println(pattern9.matcher("abc def").find());

        System.out.println();

        try {
            "some-string".matches("\\w\\d[]");
        } catch (PatternSyntaxException e) {
            System.out.println(e.getIndex());
            System.out.println(e.getDescription());
            System.out.println(e.getMessage());
            System.out.println(e.getPattern());
        }

    }

}

package company.amadeus;

public class Q4 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println( (s1 == s2));

        String s3 = "cde";
        String s4 = new String("cde");
        System.out.println(s3 == s4);

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println( (sb1 == sb2));
    }

}

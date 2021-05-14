package programs.number;

public class IntegerDecimalDiff {

    public static void main(String[] args) {
//        double number = 12345.6789;
        double number = 12345.4; // you have this
        int decimal = (int) number; // you have 12345
        double fractional = number - decimal; // you have 0.6789

        System.out.println(decimal + " : " + fractional);
    }
}

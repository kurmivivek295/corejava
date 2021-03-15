package programs.string;

public class PalindromCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrom("HiH"));
    }

    static boolean isPalindrom(String str) {

        for( int i=0, j=str.length() - 1; i < str.length()/2; i++, j--) {
            if ( str.charAt(i) != str.charAt(j)) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}

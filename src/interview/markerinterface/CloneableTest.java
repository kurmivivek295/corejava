package interview.markerinterface;

public class CloneableTest {

    public static void main(String[] args) {
        WithCloneable wc = new WithCloneable();

        try {
            WithCloneable w2c = (WithCloneable) wc.clone();
            System.out.println(w2c.getClone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        WithoutCloneable w = new WithoutCloneable();

        try {
            WithoutCloneable w2 = (WithoutCloneable) w.clone();
            System.out.println(w2.getClone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

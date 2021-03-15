package objectmethods;

public class CloneDemo {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        CloneDemo demo = new CloneDemo();
        try {
            demo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package basic_threading.demo1;

public class LongWrapper {

    private long n;

    public LongWrapper(long n) {
        this.n = n;
    }

    public long getN() {
        return n;
    }

    public void increament() {
        n = n + 1;
    }
}

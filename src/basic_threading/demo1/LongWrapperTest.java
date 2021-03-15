package basic_threading.demo1;

public class LongWrapperTest {
    public static void main(String[] args) {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {
          longWrapper.increament();
        };

        for (int i = 0; i < 100; i++) {
            Thread th = new Thread(r);
            th.start();
        }

        System.out.println(longWrapper.getN());
    }
}

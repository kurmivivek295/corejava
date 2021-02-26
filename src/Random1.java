public class Random1 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory()/(1024*4));
        System.out.println(Runtime.getRuntime().maxMemory()/(1024*4));
        System.out.println(Runtime.getRuntime().totalMemory()/(1024*4));
    }

}

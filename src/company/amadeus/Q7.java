package company.amadeus;

import java.util.concurrent.TimeUnit;

public class Q7 implements Runnable
{
    public void run()
    {
        System.out.printf("%d",3);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(new Q7());
        thread.start();
//        We added the line due to simulation
//        TimeUnit.SECONDS.sleep(2);
        System.out.printf("%d",1);
        thread.join();
        System.out.printf("%d",2);
    }

}

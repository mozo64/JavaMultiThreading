package StartingThreads_1;

/**
 * Starting Threads with extends
 * <br><br>
 * Codes with minor comments are from
 * <a href="http://www.caveofprogramming.com/youtube/">
 * <em>http://www.caveofprogramming.com/youtube/</em>
 * </a>
 * <br>
 * also freely available at
 * <a href="https://www.udemy.com/java-multithreading/?couponCode=FREE">
 * <em>https://www.udemy.com/java-multithreading/?couponCode=FREE</em>
 * </a>
 *
 * @author Z.B. Celik <celik.berkay@gmail.com>
 */
class Runner extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getClass().getName() + " - Hello: " + i + " Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationExtends {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ApplicationExtends.class.getName());

        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();

        Thread.sleep(200);
        runner1.stop();

    }

}

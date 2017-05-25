package juice.threaddemo.threadsafe;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${TODO}
 */

public class SafeThread extends Thread {
    // 定义200本书   借书
    private static int books = 150;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
//                wait(500);
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (books > 0) {
                    System.out.println(getName() + "=======================正在出借第" + (books--) + "本书");
                }
            }
        }
    }
}

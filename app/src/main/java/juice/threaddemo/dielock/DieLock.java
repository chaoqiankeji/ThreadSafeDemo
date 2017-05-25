package juice.threaddemo.dielock;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${TODO}
 */

public class DieLock extends Thread {
    // 定义200本书   借书
    private static int books = 150;
    private  boolean flag;

    public DieLock(boolean b) {
        flag=b;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized ("lock1") {
                System.out.println("平台1线程的lock1");
                synchronized ("lock2") {
                    System.out.println("平台1线程的lock2");
                }
            }
        } else {
            synchronized ("lock2") {
                System.out.println("平台2线程的lock2");
                synchronized ("lock1") {
                    System.out.println("平台2线程的lock1");
                }
            }
        }
    }
}

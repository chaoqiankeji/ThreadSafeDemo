package jointhread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${TODO}
 */

public class JoinThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int x = 0; x < 100; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}

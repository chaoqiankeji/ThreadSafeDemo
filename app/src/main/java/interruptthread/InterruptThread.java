package interruptthread;

import java.util.Date;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${TODO}
 */

public class InterruptThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("开始执行：" + new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程被终止了"+e.getMessage());
        }

        System.out.println("结束执行：" + new Date());
    }
}

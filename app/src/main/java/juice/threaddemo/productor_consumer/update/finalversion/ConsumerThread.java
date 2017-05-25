package juice.threaddemo.productor_consumer.update.finalversion;

/**
 * @author chengyong
 * @time 2017/5/24 18:15
 * @des ${TODO}
 * 任务一：如何实现   数据不紊乱
 * 任务二：如何实现   有数据就消费，没数据就生产。
 */

public class ConsumerThread extends Thread {
    private Programmer programmer;

    public ConsumerThread(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            synchronized (programmer) {
                if (!programmer.hasData) {
                    try {
                        programmer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费线程==" + programmer.name + "消费数据了---" + programmer.age);
                programmer.name = null;
                programmer.age = 0;
                i++;
                programmer.hasData = false;
                programmer.notify();
            }
        }
    }
}

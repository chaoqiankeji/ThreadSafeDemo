package juice.threaddemo.productor_consumer;

/**
 * @author chengyong
 * @time 2017/5/24 18:15
 * @des ${TODO}
 */

public class ConsumerThread extends Thread {
    private Programmer programmer;

    public ConsumerThread(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        synchronized (""){
            try {
                sleep(500);
                "".wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(programmer.name + "---" + programmer.age);
        }
    }
}

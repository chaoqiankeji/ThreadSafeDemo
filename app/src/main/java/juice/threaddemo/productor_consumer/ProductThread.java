package juice.threaddemo.productor_consumer;

/**
 * @author chengyong
 * @time 2017/5/24 18:15
 * @des ${TODO}
 */

public class ProductThread extends Thread {
    private Programmer programmer;

    public ProductThread(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        synchronized ("") {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            programmer.name = "天天";
            programmer.age = 27;
            System.out.println(programmer.name + "生产数据了---" + programmer.age);
            "".notifyAll();
        }
    }
}

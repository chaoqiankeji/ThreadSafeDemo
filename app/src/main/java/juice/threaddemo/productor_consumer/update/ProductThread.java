package juice.threaddemo.productor_consumer.update;


/**
 * @author chengyong
 * @time 2017/5/24 18:15
 * @des ${TODO}
 */

public class ProductThread extends Thread {
    private Programmer programmer;
    private int x;

    public ProductThread(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        while (x < 100) {
            synchronized (programmer) {
                if (programmer.hasData) {
                    try {
                        programmer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {   //偶数
                    programmer.name = "诸葛亮";
                    programmer.age = 47;
                } else {
                    programmer.name = "司马懿";
                    programmer.age = 52;
                }
                x++;
                System.out.println("生产线程==" + programmer.name + "生产数据了---" + programmer.age);
                programmer.hasData = true;
                programmer.notify();
            }
        }
    }
}

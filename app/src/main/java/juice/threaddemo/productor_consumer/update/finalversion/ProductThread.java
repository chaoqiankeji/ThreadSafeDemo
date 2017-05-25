package juice.threaddemo.productor_consumer.update.finalversion;


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
            if (x % 2 == 0) {   //偶数
                programmer.set("诸葛", 47);
            } else {
                programmer.set("司马", 52);
            }
            x++;
        }
    }
}

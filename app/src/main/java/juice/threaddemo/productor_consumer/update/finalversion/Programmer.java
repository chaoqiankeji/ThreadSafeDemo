package juice.threaddemo.productor_consumer.update.finalversion;

/**
 * @author chengyong
 * @time 2017/5/24 18:16
 * @des ${TODO}
 */

public class Programmer {
    private String name;
    private int age;
    private boolean hasData;

    public synchronized void get() {
// 如果没有数据，就等待
        if (!this.hasData) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("拿数据：" +this.name + "---" + this.age);

        // 修改标记
        this.hasData = false;
        this.notify();
    }

    public synchronized void set(String name,int age) {
        // 如果有数据，就等待
        if (this.hasData) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 设置数据
        this.name = name;
        this.age = age;
        System.out.println("生产数据：" +this.name + "---" + this.age);
        // 修改标记
        this.hasData = true;
        this.notify();
    }

}

package juice.threaddemo.productor_consumer;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${生产者、消费者模式测试}
 */
public class Test {
	public static void main(String[] args) {
//创建资源
		Programmer programmer = new Programmer();

		//设置和获取的类
		ProductThread productThread = new ProductThread(programmer);
		ConsumerThread consumerThread = new ConsumerThread(programmer);

		//线程类
		Thread t1 = new Thread(productThread);
		Thread t2 = new Thread(consumerThread);

		//启动线程
		t2.start();
		t1.start();
	}
}

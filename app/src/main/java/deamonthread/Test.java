package deamonthread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${守护线程测试}
 */
public class Test {
	public static void main(String[] args) {
		DeamonThread td1 = new DeamonThread();
		DeamonThread td2 = new DeamonThread();

		td1.setName("丞相");
		td2.setName("上将军");

		// 设置为守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		Thread.currentThread().setName("皇帝");
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}

package jointhread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${加入线程测试}
 */
public class Test {
	public static void main(String[] args) {
		JoinThread td1 = new JoinThread();
		JoinThread td2 = new JoinThread();
		JoinThread td3 = new JoinThread();

		td1.setName("leader");
		td2.setName("programmer1");
		td3.setName("programmer2");
		td1.start();
		try {
			td1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		td2.start();
		td3.start();
	}
}

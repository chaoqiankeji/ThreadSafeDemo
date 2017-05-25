package juice.threaddemo.threadsafe;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${线程安全测试}
 */
public class Test {
	public static void main(String[] args) {
		SafeThread td1 = new SafeThread();
		SafeThread td2 = new SafeThread();
		SafeThread td3 = new SafeThread();

		td1.setName("A平台");
		td2.setName("B平台");
		td3.setName("C平台");

		td1.start();
		td2.start();
		td3.start();
	}
}

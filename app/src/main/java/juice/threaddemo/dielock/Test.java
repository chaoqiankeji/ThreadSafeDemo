package juice.threaddemo.dielock;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${线程死锁测试}
 */
public class Test {
	public static void main(String[] args) {
		DieLock td1 = new DieLock(true);
		DieLock td2 = new DieLock(false);

		td1.setName("A平台");
		td2.setName("B平台");
//		try {
//			td1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		td1.start();
		td2.start();
	}
}

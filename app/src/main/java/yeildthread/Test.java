package yeildthread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${和谐线程测试}
 */
public class Test {
	public static void main(String[] args) {
		YieldThread td1 = new YieldThread();
		YieldThread td2 = new YieldThread();

		td1.setName("林俊生");
		td2.setName("周天令");

		td1.start();
		td2.start();
	}
}

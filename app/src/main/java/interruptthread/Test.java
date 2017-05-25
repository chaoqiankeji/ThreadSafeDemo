package interruptthread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${停止线程测试}
 */
public class Test {
	public static void main(String[] args) {
		InterruptThread ts = new InterruptThread();
		ts.start();
		try {
			Thread.sleep(3000);
			 ts.stop();
//			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

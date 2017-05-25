package prioritythread;

/**
 * @author chengyong
 * @time 2017/5/23 14:41
 * @des ${优先级线程测试}
 */
public class Test {
	public static void main(String[] args) {
		PriorityThread td1 = new PriorityThread();
		PriorityThread td2 = new PriorityThread();
		PriorityThread td3 = new PriorityThread();

		td1.setName("leader");
		td2.setName("programmer1");
		td3.setName("programmer2"); //1--10
		td1.setPriority(1);
		td2.setPriority(10);
		td3.setPriority(2);
		td1.start();
		td2.start();
		td3.start();
	}
}

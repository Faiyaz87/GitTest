package thread;

public class DeadLock {

	public static void main(String[] args) {
		
		SharedObj sObj = new SharedObj();
		SharedObj sObj1 = new SharedObj();
		
		Thread t1 = new Thread(getRunnableObj(sObj,sObj1,"T1"));
		Thread t2 = new Thread(getRunnableObj(sObj1,sObj,"T2"));
		t1.start();
		t2.start();
	}

	private static Runnable getRunnableObj(SharedObj sObj,SharedObj sObj1,String tName) {
		return () -> {
			for (int i = 0; i < 100; i++) {
				synchronized (sObj) {
					synchronized (sObj1) {
						System.out.println(tName);
					}
					
				}
			}

		};
	}

}

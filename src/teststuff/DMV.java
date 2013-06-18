package teststuff;

public class DMV implements Runnable{

	static int d1calls = 0;
	static int d2calls = 0;
	public DMV()
	{
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		DMV d = new DMV();
		Thread t2 = new Thread(d);
		t2.start();
		Thread t1 = new Thread(d);
		t1.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - currentTime + " d1s " + d1calls + " d2s " + d2calls);
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j=0; j<4;j++)
		{
			do1();
			do2();
		}
	}

	private void do1() {
		try {
			d1calls++;
			System.out.println(Thread.currentThread().getId() + " about to sleep do1 ns " + d1calls);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void do2() {
		try {
			d2calls++;
			System.out.println(Thread.currentThread().getId() + " about to sleep do2 syn " + d2calls);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}



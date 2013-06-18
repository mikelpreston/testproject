package teststuff;

public class ThreadTester implements Runnable{

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadTester());
		
		t.start();
		
		// causes the thread to be joined, ie finsih that first
//		try {
//			t.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		t.setPriority(1);
		Thread.currentThread().setPriority(10);
		for ( int i = 0; i < 100; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main");
		}
	}

	@Override
	public void run() {
		for ( int i = 0; i < 100; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			System.out.println("newthread");
		}		
	}

}

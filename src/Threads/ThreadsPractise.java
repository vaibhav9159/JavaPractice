package Threads;

public class ThreadsPractise implements Runnable{
	static ThreadsPractise tp = new ThreadsPractise();
	static Thread t1;
	public ThreadsPractise()
	{
		System.out.println("constructor run");
		
	}
	

	public static void main(String[] args) {
	
		t1 = new Thread(tp);
		t1.start();
	
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2 = new Thread(tp);
		t2.start();
		Thread t3 = new Thread(tp);
		t3.start();
		t3.setPriority(t3.MAX_PRIORITY);
		System.out.println(t1.getId() + " " + t2.getId() + " " + t3.getId());
		System.out.println(t1.getName() + " " + t2.getName() + " " + t3.getName());
		System.out.println(t3.getPriority());

	}

	@Override
	public void run() {
		System.out.println("thread run test 1");
		
	}

}

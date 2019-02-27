package threads;

class Thread1 extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1");
			 Thread1 thread1 = new Thread1();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		
	for (int i = 0; i < 10; i++) {
		System.out.println("Thread 2");
	
	try {
		Thread1.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}
public class ThreadDemo {
	 	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
        
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
      thread1.start();
      thread2.start();
      
	}

}

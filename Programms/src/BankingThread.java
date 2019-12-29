
public class BankingThread {
	public static int balance = 0;
	
	  public void withdraw(int amount) {
		synchronized(this) {
		System.out.println("Inside withdra");
		
		if( amount < balance) {
			System.out.println("Withdraw success");	
		}
		else {
			try {
				System.out.println("Waiting for Balance");
				wait();
				System.out.println("SUccesse");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	}
	
	public void deposit(int amount) {
		
		balance = balance + amount;
		System.out.println("Blance updated");
		synchronized(this) {
			notify();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankingThread activity  = new BankingThread();
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				activity.withdraw(5000);
				
			}
			
		});
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				activity.deposit(6000);
			}
			
			
		});
		thread2.setName("Thread2");
		thread2.start();

	}

}

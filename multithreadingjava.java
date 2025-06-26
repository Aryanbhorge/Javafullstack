package javaproject;

public class multithreadingjava {

	public static void main(String[] args) {
		Thread t =Thread.currentThread();
		System.out.println("Current Thread Name is "+Thread.currentThread().getName());
		MyThread t1=new MyThread("Thread-1"); 
		System.out.println(t1.getName()+" ID = "+t1.threadId()); 
		t1.setPriority(Thread.MAX_PRIORITY); 
		System.out.println(t1.getName()+" Priority is "+t1.getPriority());
		t1.start(); Thread t2=new Thread(new MyRunnable(),"thread-2"); t2.start(); try { 
		t1.join();
		t2.join(); }catch(InterruptedException e) {
			e.printStackTrace();	
		} 	
		}
}
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	@Override 
	public void run() {
	System.out.println(getName()+"(Running) exceuting task...");
	try {
		System.out.println(getName()+"(sleeeping)...");
		Thread.sleep(3000);
		System.out.println(getName()+" (YIELD) Yielding CPU to another thread..."); 
	    Thread.yield();
		synchronized (this) {
	    System.out.println(getName()+"(WAITING) waiting for notification...");
		wait(3000);
		}
	}catch(InterruptedException e) {
	e.printStackTrace();	
	}
	System.out.println(getName()+"(Interupted)");
	System.out.println(getName()+"(Alive) is alive"+isAlive());
	}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
	Thread currentThread=Thread.currentThread();	
	System.out.println(currentThread.getName()+"(Running) exceuting task...");
	}
	
}
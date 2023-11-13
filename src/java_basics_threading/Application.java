package java_basics_threading;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Starting thread 1");
		Task taskRunner = new Task("thread-a");
		taskRunner.start();

		System.out.println("Starting thread 2");
		Task taskRunner2 = new Task("thread-b");
		taskRunner2.start();

	}

}

class Task extends Thread {

//	public Task(String name) {
//		super(name);
//	}
//
//	public void run() {
//		for (int i = 0; i < 1000; i++) {
//
//			System.out.println("number: " + i + " - " + currentThread().getName());
//			try {
//				sleep(100L);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}

	public void run() {
		
		currentThread().setName(this.name);
		
		for (int i = 0; i < 1000; i++) {

			System.out.println("number: " + i + " - " + currentThread().getName());
			try {
				sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}

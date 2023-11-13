package java_basics_thread_inventorymanager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		 InventoryManager inventoryManger = new InventoryManager();

		 Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inventoryManger.pupulateSoldProducts();
			}
		});
		 
		 
		 Thread displayTask = new Thread(new Runnable() {
				
				@Override
				public void run() {
					inventoryManger.displaySoldProducts();
				}
			});
		 
		inventoryTask.start();
		//inventoryTask.join();
		Thread.sleep(2000L);
		displayTask.start();
		 
		 
	}

}

package java_basics_thread_inventorymanager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldPruductsList = new CopyOnWriteArrayList<>();

	List<Product> purchasePruductsList = new ArrayList<>();

	public void pupulateSoldProducts() {
		for (int i = 0; i < 1000; i++) {
			Product product = new Product(i, "test_product_" + i);
			soldPruductsList.add(product);
			System.out.println("ADDED: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProducts() {
		for (Product product : soldPruductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package java_basics_threading;

public class Sequence {

	private int value = 0;

	public synchronized int getNext() {
		value++;
		return value;
	}

//	public int getNext() {
//		synchronized (this) {
//		value++;
//		return value;
//		}
//	}
}

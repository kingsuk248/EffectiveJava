package concurrency;

public class NextSerialNumber {
	private static volatile int nextSerialNumber;

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			while (nextSerialNumber < Integer.MAX_VALUE) {
				nextSerialNumber++;
				System.out.println(nextSerialNumber);
			}
		});
		t.start();
	}
}

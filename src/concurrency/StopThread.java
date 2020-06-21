package concurrency;

import java.util.concurrent.TimeUnit;

public class StopThread {
	static boolean isStopRequested = false;

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!isStopRequested()) {
				i++;
			}
			System.out.println("i: " + i);
		});
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
	
	private static synchronized void requestStop() {
		isStopRequested = true;
	}
	
	private static synchronized boolean isStopRequested() {
		return isStopRequested;
	}
}

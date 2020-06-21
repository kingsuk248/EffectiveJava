package general.programming;

import java.util.Random;

public class RandomBias {
	private static Random r = new Random();
	
	public static void main(String[] args) {
		int lowCount =  0;
		int n = 2 * (Integer.MAX_VALUE / 3);
		for (int i = 0; i < 1000000; i++) {
			if (random(n) < n/2) {
				lowCount++;
			}
		}
		System.out.println(lowCount);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.abs(Integer.MIN_VALUE));
	}
	
	private static int random(int n) {
		return Math.abs(r.nextInt()) % n;
	}
}

package annotations.and.enums;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class PrimeCounter {
	public static void main(String[] args) {
		System.out.println(piParallel(10000000));
	}
	
	static long pi(long n) {
		return LongStream.rangeClosed(2, n).mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50)).count();
	}
	
	static long piParallel(long n) {
		return LongStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50)).count();
	}
}

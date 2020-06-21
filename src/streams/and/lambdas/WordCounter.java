package streams.and.lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	public static void main(String[] args) {
		String[] randomWords = { "ant", "cat", "bat", "rat", "ant", "bat", "elephant", "rat", "bat", "mat", "hat",
				"tiger", "leopard", "bat", "tiger" };
		Map<String, Integer> strCounter1 = new HashMap<>();
		Map<String, Integer> strCounter2 = new HashMap<>();
		Arrays.stream(randomWords).forEach(word -> strCounter1.merge(word, 1, (str, incr) -> str + incr));
		System.out.println(strCounter1);
		Arrays.stream(randomWords).forEach(word -> strCounter2.merge(word, 1, Integer::sum));
		System.out.println(strCounter2);
	}
}

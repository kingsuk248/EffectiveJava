package streams.and.lambdas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class WordCounterII {
	public static void main(String[] args) {
		WordCounterII wc2 = new WordCounterII();
		wc2.countWordsWithIterativeMasqueradingAsStream();
		wc2.coundWordsWithStreams();
	}

	private void countWordsWithIterativeMasqueradingAsStream() {
		Map<String, Integer> freq = new HashMap<>();
		Path filePath = Paths.get("pictionary");
		try (Stream<String> wordsStream = Files.lines(filePath)) {
			wordsStream.forEach(word -> freq.merge(word, 1, Integer::sum));
		} catch (Exception ex) {

		}
		System.out.println(freq);
	}

	private void coundWordsWithStreams() {
		Map<Object, Long> freq = new HashMap<>();
		Path filePath = Paths.get("pictionary");
		try (Stream<String> wordsStream = Files.lines(filePath)) {
			freq = wordsStream.collect(groupingBy(String::toLowerCase, counting()));
		} catch (Exception ex) {

		}
		System.out.println(freq);

		freq.keySet().stream().sorted(Comparator.comparing(freq::get).reversed()).limit(5)
				.collect(Collectors.toList()).forEach(System.out::println);
	}
	
}

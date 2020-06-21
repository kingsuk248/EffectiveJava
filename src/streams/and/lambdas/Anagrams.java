package streams.and.lambdas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
	public static void main(String[] args) {
		Path dictionaryPath = Paths.get("dictionary");
		int minGrpSize = 2;
		try (Stream<String> wordsStream = Files.lines(dictionaryPath)) {
			wordsStream.collect(Collectors.groupingBy(word -> alphabetize(word)))
			.values()
			.stream()
			.filter(group -> group.size() >= minGrpSize)
			.forEach(g -> System.out.println(g.size() + ": " + g));
			
		} catch(Exception ex) {
			System.out.println(ex);
	}
	}
	
	public static String alphabetize(String word) {
		char[] chArray = word.toCharArray();
		Arrays.sort(chArray);
		return new String(chArray);
	}
}

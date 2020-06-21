package annotations.and.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubList {
	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('b');
		charList.add('c');
		generateSubListUsingStreams(charList);
		System.out.println();
		generateSubListUsingForEach(charList);
	}

	private static void generateSubListUsingForEach(List<Character> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j <= list.size(); j++) {
				System.out.print(list.subList(i, j));
			}
		}
	}

	private static void generateSubListUsingStreams(List<Character> list) {
		of(list).forEach(System.out::print);
	}
	
	private static <E> Stream<List<E>> of(List<E> list) {
		return Stream.concat(Stream.of(Collections.EMPTY_LIST), prefixes(list).flatMap(SubList::suffixes));
	}
	
	private static <E> Stream<List<E>> prefixes(List<E> list) {
		return IntStream.rangeClosed(1, list.size()).mapToObj(end -> list.subList(0, end));
	}
	
	private static <E> Stream<List<E>> suffixes(List<E> list) {
		return IntStream.rangeClosed(0, list.size()).mapToObj(start -> list.subList(start, list.size()));
	}
	
}

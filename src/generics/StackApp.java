package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackApp {
	public static void main(String[] args) {
		Stack<Number> stackN = new Stack<Number>(10);
		List<Integer> ints = Arrays.asList(1, 2, 3);
		stackN.pushAll(ints);
		
		List<Object> objS = new ArrayList<>();
		stackN.popAll(objS);
		System.out.println(objS);
		
	}
	
	static <T> List<T> flatten(List<T>... lists) {
		List<T> result = new ArrayList<T>();
		for (List<? extends T> l : lists) {
			result.addAll(l);
		}
		return result;
	}
}

package generics;

import java.util.function.UnaryOperator;

public class UnarySingleton {
	private static UnaryOperator<Object> IDENTITY = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identity() {
		return (UnaryOperator<T>) IDENTITY;
	}
}

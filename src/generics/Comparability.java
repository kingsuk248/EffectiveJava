package generics;

import java.util.Collection;
import java.util.Objects;

public class Comparability {

	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if (c.isEmpty()) {
			throw new IllegalArgumentException();
		}
		E result = null;
		for (E e : c) {
			if (e.compareTo(result) > 0) {
				result = Objects.requireNonNull(e);
			}
		}
		return result;
	}
}

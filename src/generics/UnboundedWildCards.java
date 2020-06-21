package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnboundedWildCards<S> {
	private static UnaryOperator<Object> IDENTIT_FN = (t) -> t;
	@SuppressWarnings("unused")
	private UnaryOperator<S> IDENTITY_FN = (s) -> s;
	
	@SuppressWarnings("unchecked")
	public static <T> T identityFunction() {
		return (T)IDENTIT_FN;
	}
 	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Hello");
		doSomething(myList);
	}
	
	static void doSomething(Collection<? extends String> myColl) {
		myColl.add(null);
		System.out.println(myColl);
	}
	
	public <T> T[] toArray(T[] a) {
		T[] result = (T[]) Arrays.copyOf(a, 10);
		return result;
	}
}

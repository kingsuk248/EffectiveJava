package generics;

import java.util.ArrayList;
import java.util.List;

public class CovariantAndInvariant {

	static class A {
		int x;
	}

	static class B extends A {

	}
	
	public static void main(String[] args) {
		A[] aS = new B[5];
		A a = new A();
		a.x = 1;
		aS[0] = a;
		List<A> aSList = new ArrayList<A>();
		aSList.add(new A());
		//List<A> aSListCTE = new ArrayList<B>(); Compile Time Error
		Object[] oS = new Integer[1];
		oS[0] = "Runtime Error";
	}
}

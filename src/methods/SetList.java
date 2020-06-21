package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
	public static void main(String[] args) {
		Set<Integer> intSet = new TreeSet<>();
		List<Integer> intList = new ArrayList<>();
		for (int i = -3 ; i < 3; i++) {
			intSet.add(i);
			intList.add(i);
		}
		for (int i = 0 ; i < 3; i++) {
			intSet.remove(i);
			intList.remove(i);
		}
		
		System.out.println(intSet + " " + intList);
		
		Thread t = new Thread(System.out::println);
		System.out.println(t.getName());
	}
}

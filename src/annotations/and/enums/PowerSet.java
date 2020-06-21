package annotations.and.enums;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
	public static final <E> Collection<Set<E>> of(Set<E> s) {
		List<E> srcList = new ArrayList<>(s);
		if (srcList.size() > 30) {
			throw new IllegalArgumentException("Size too big !");
		}
		return new AbstractList<Set<E>>() {
			@Override
			public int size() {
				return 1 << srcList.size();
			}

			@Override
			public boolean contains(Object o) {
				return o instanceof Set && srcList.containsAll((Set)o);
			}
			
			@Override
			public Set<E> get(int index) {
				Set<E> result = new HashSet<>();
				for (int i = 0; index != 0; i++, index >>= 1) {
					if ((index & 1) == 1) {
						result.add(srcList.get(i));
					}
				}
				return result;
			}
		}; 
	}
	
	public static void main(String[] args) {
		Set<Character> charSet = new HashSet<>();
		charSet.add('a');
		charSet.add('b');
		charSet.add('c');
		System.out.println(of(charSet));
	}
}

package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stack<E> {
	private List<E> elements;
	private int size = 0;
	private static final int INITIAL_DEFAULT_CAPACITY = 16;

	public Stack(int c) {
		elements = new ArrayList<>(INITIAL_DEFAULT_CAPACITY);
	}

	public void push(E element) {
		if (!isFull()) {
			elements.add(element);
			++size;
		}
	}

	public E pop() {
		E elem = null;
		if (!isEmpty()) {
			elem = elements.remove(size - 1);
			size--;
		}
		return elem;
	}
	
	public void pushAll(Iterable<? extends E> i) {
		for (E e : i) {
			push(e);
		}
	}
	
	public void popAll(Collection<? super E> dest) {
		while (!isEmpty()) {
			dest.add(pop());
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return false;
	}
}

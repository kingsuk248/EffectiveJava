package annotations.and.enums;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class WeightsTable {
	public static void main(String[] args) {
		double earthWeight = 46.234;
		double mass = earthWeight / Planets.Earth.getSurfaceGravity();
		for (Planets p : Planets.values()) {
			System.out.println("Weight in " + p.toString() + " is " + mass * p.getSurfaceGravity());
		}
	}
	
	public static <E> Iterable<E> iterableOf(Stream<E> stream) {
		return stream::iterator;
	}
	
	public static <E> Stream<E> streamOf(Iterable<E> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}
 }

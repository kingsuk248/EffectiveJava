package general.programming;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class ReflectiveInstantiation {
	public static void main(String[] args) {
		String[] arguments = {"java.util.TreeSet", "Tom", "Dick", "Harry"};
		instantiate(arguments);
	}
	
	private static void instantiate(String[] arguments) {
		Class<? extends Set> setSubClass = null;
		try {
			setSubClass = (Class<? extends Set>) Class.forName(arguments[0]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Constructor<? extends Set> setSubClassConstructor = setSubClass.getDeclaredConstructor();
			Set<String> newSet = setSubClassConstructor.newInstance();
			newSet.addAll(Arrays.asList(arguments).subList(1, arguments.length));
			System.out.println(newSet);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

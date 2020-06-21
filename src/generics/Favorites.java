package generics;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();
	
	<T> void putFavorite(Class<T> type, T instance) {
		favorites.put(type, instance);
	}
	
	<T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}
}

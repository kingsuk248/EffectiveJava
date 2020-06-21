package annotations.and.enums;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Garden {
	public void plantGarden() {
		Map<Plants.Lifecycle, Set<Plants>> gardenMap = new EnumMap<>(Plants.Lifecycle.class);
		
		for (Plants.Lifecycle pl : Plants.Lifecycle.values()) {
			gardenMap.put(pl, new HashSet<Plants>());
		}
	}
}

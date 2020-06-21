package annotations.and.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Phase {
	SOLID, LIQUID, GAS;

	enum Transition {
		MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), SUBLIME(SOLID, GAS), CONDENSE(GAS, LIQUID), BOIL(LIQUID, GAS),
		DEPOSIT(GAS, SOLID);

		private final Phase from;
		private final Phase to;

		Transition(Phase from, Phase to) {
			this.from = from;
			this.to = to;
		}

		private static final Map<Phase, Map<Phase, Transition>> m = Stream.of(values())
				.collect(Collectors.groupingBy(t -> t.from, () -> new EnumMap<>(Phase.class),
						Collectors.toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class))));
	}
}

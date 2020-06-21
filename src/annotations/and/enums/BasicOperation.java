package annotations.and.enums;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum BasicOperation implements Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},

	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},

	MULTIPLY("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},

	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	BasicOperation(String s) {
		this.symbol = s;
	}

	@Override
	public String toString() {
		return this.symbol;
	}

	private static final Map<String, BasicOperation> stringToEnum = Stream.of(values())
			.collect(Collectors.toMap(Object::toString, e -> e));

	public static Optional<BasicOperation> fromString(String symbol) {

		return Optional.ofNullable(stringToEnum.get(symbol));

	}
}

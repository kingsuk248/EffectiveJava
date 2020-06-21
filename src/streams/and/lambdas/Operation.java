package streams.and.lambdas;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
	PLUS("+", (x, y) -> x + y),
	MINUS("+", (x, y) -> x + y),
	MULTIPLE("+", (x, y) -> x + y),
	DIVIDE("+", (x, y) -> x + y);
	
	private final String symbol;
	private final DoubleBinaryOperator dbo;
	
	private Operation(String symbol, DoubleBinaryOperator dbo) {
		this.symbol = symbol;
		this.dbo = dbo;
	}
	
	public double apply(double x, double y) {
		return dbo.applyAsDouble(x, y);
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
}

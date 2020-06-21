package creating.destroying.objects.builder.pizza;

public class CalzonePizza extends Pizza {
	private final boolean hasSauce;
	
	public static class Builder extends Pizza.Builder<Builder> {
		private final boolean hasSauce;
		
		public Builder(boolean hasSauce) {
			this.hasSauce = hasSauce;
		}
		
		@Override
		CalzonePizza build() {
			return new CalzonePizza(this);
		}
		
		@Override
		public Builder self() {
			return this;
		}
	}
	
	private CalzonePizza(Builder builder) {
		super(builder);
		this.hasSauce = builder.hasSauce;
	}
	
	public boolean getHasSauce() {
		return hasSauce;
	}
}

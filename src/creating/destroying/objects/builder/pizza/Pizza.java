package creating.destroying.objects.builder.pizza;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
	public enum Topping {CHEESE, PEPPERONNI, MUSHROOM, ONION, HAM, SAUSAGE};
	private Set<Topping> toppings;
	
	static abstract class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		public T addTopping(Topping topping) {
			toppings.add(topping);
			return self();
		}
		
		abstract Pizza build();
		
		protected abstract T self();
	}
	
	Pizza(Builder<?> builder) {
		this.toppings = builder.toppings.clone();
	}
	
	public Set<Topping> getToppings() {
		return this.toppings;
	}
	
}
package creating.destroying.objects.builder.pizza;

import java.util.Set;

import creating.destroying.objects.builder.pizza.NyPizza.Size;
import creating.destroying.objects.builder.pizza.Pizza.Topping;

public class PizzaApp {
	public static void main(String[] args) {
		Pizza.Builder<NyPizza.Builder> nyPizzaBuilder = new NyPizza.Builder(Size.SMALL);
		nyPizzaBuilder.addTopping(Topping.CHEESE);
		nyPizzaBuilder.addTopping(Topping.MUSHROOM);
		nyPizzaBuilder.addTopping(Topping.ONION);
		Pizza nyPizza = nyPizzaBuilder.build();
		Set<Topping> nyPizzaToppings = nyPizza.getToppings();
		nyPizzaToppings.forEach(System.out::println);
		
		Pizza.Builder<CalzonePizza.Builder> calzonePizzaBuilder = new CalzonePizza.Builder(true);
		calzonePizzaBuilder.addTopping(Topping.HAM);
		calzonePizzaBuilder.addTopping(Topping.PEPPERONNI);
		calzonePizzaBuilder.addTopping(Topping.SAUSAGE);
		Pizza calzonePizza = calzonePizzaBuilder.build();
		Set<Topping> calzonePizzaToppings = calzonePizza.getToppings();
		calzonePizzaToppings.forEach(System.out::println);
		
	}
}

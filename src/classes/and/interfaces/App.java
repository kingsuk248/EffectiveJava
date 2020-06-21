package classes.and.interfaces;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculator.initDigit);
		System.out.println(Calculator.Operation.ADD);
		System.out.println(Calculator.State.ON);
		
		Calculator c = new Calculator();
		Calculator.Model m = c.new Model();
		m.setBrand("Casio");
		m.demo();
		
		System.out.println(Utensil.PAN + Dish.PAN);
	}
}

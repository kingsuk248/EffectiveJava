package classes.and.interfaces;

public class SomeClass implements SomeInterface {
	
	@Override
	public String stringify() {
		return new SomeClass.SomeInnerClass().stringify();
	}

	@Override
	public void doSomething() {
	}
	
	static class SomeInnerClass  implements SomeInterface{
		
		public String stringify() {
			return null;
			
		}
		public void doSomething() {
			
		}
	}
	
	public static void main(String[] args) {
	}
}

package creating.destroying.objects.builder.nutrition;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int sodium;
	private final int carbohydrates;
	private final int fat;
	
	public static class Builder {
		private int servingSize;
		private int servings;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		private int calories = 0;
		private int sodium = 0;
		private int carbohydrates = 0;
		private int fat = 0;
		
		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}
		
		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public Builder carbohydrates(int carbohydrates) {
			this.carbohydrates = carbohydrates;
			return this;
		}
		
		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.sodium = builder.sodium;
		this.carbohydrates = builder.carbohydrates;
		this.fat = builder.fat;
	}
}

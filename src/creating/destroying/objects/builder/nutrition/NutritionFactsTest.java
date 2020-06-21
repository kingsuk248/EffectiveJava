package creating.destroying.objects.builder.nutrition;

public class NutritionFactsTest {
	public static void main(String[] args) {
		NutritionFacts nf = new NutritionFacts.Builder(100, 10).calories(200).build();
		nf.toString();
		System.out.println(System.currentTimeMillis());
	}
}

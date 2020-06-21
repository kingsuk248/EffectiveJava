package creating.destroying.objects.injection.dependency;

import java.util.Objects;

public class SpellChecker {
	private final Lexicon dictionary;
	
	public SpellChecker(Lexicon l) {
		this.dictionary = Objects.requireNonNull(l);
	}
	
	public static void main(String[] args) {
		SpellChecker sc = new SpellChecker(new Lexicon());
	}
}

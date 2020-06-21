package streams.and.lambdas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardDeck {
	public static void main(String[] args) {
		createNewDeck();
	}

	private static List<Card> createNewDeck() {
		return Stream.of(Card.Suit.values()).flatMap(suit -> Stream.of(Card.Rank.values()).map(rank -> new Card(suit, rank))).collect(Collectors.toList());
	}

	private static class Card {
		Suit s;
		Rank r;

		private Card(Suit s, Rank r) {
			this.s = s;
			this.r = r;
		}

		@SuppressWarnings("unused")
		public Suit getS() {
			return s;
		}

		@SuppressWarnings("unused")
		public Rank getR() {
			return r;
		}

		private enum Suit {
			HEARTS, DIAMONDS, CLUBS, SPADES;
		}

		private enum Rank {
			ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, JACK, QUEEN, KING;
		}
	}
}

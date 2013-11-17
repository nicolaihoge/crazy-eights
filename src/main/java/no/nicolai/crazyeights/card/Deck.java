package no.nicolai.crazyeights.card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    public static final Card ACE_OF_SPADES = new Card(Suit.SPADES, Rank.ACE);
    public static final Card TWO_OF_SPADES = new Card(Suit.SPADES, Rank.TWO);
    public static final Card THREE_OF_SPADES = new Card(Suit.SPADES, Rank.THREE);
    public static final Card FOUR_OF_SPADES = new Card(Suit.SPADES, Rank.FOUR);
    public static final Card FIVE_OF_SPADES = new Card(Suit.SPADES, Rank.FIVE);
    public static final Card SIX_OF_SPADES = new Card(Suit.SPADES, Rank.SIX);
    public static final Card SEVEN_OF_SPADES = new Card(Suit.SPADES, Rank.SEVEN);
    public static final Card EIGHT_OF_SPADES = new Card(Suit.SPADES, Rank.EIGHT);
    public static final Card NINE_OF_SPADES = new Card(Suit.SPADES, Rank.NINE);
    public static final Card TEN_OF_SPADES = new Card(Suit.SPADES, Rank.TEN);
    public static final Card JACK_OF_SPADES = new Card(Suit.SPADES, Rank.JACK);
    public static final Card QUEEN_OF_SPADES = new Card(Suit.SPADES, Rank.QUEEN);
    public static final Card KING_OF_SPADES = new Card(Suit.SPADES, Rank.KING);
    public static final Card ACE_OF_CLUBS = new Card(Suit.CLUBS, Rank.ACE);
    public static final Card TWO_OF_CLUBS = new Card(Suit.CLUBS, Rank.TWO);
    public static final Card THREE_OF_CLUBS = new Card(Suit.CLUBS, Rank.THREE);
    public static final Card FOUR_OF_CLUBS = new Card(Suit.CLUBS, Rank.FOUR);
    public static final Card FIVE_OF_CLUBS = new Card(Suit.CLUBS, Rank.FIVE);
    public static final Card SIX_OF_CLUBS = new Card(Suit.CLUBS, Rank.SIX);
    public static final Card SEVEN_OF_CLUBS = new Card(Suit.CLUBS, Rank.SEVEN);
    public static final Card EIGHT_OF_CLUBS = new Card(Suit.CLUBS, Rank.EIGHT);
    public static final Card NINE_OF_CLUBS = new Card(Suit.CLUBS, Rank.NINE);
    public static final Card TEN_OF_CLUBS = new Card(Suit.CLUBS, Rank.TEN);
    public static final Card JACK_OF_CLUBS = new Card(Suit.CLUBS, Rank.JACK);
    public static final Card QUEEN_OF_CLUBS = new Card(Suit.CLUBS, Rank.QUEEN);
    public static final Card KING_OF_CLUBS = new Card(Suit.CLUBS, Rank.KING);
    public static final Card ACE_OF_HEARTS = new Card(Suit.HEARTS, Rank.ACE);
    public static final Card TWO_OF_HEARTS = new Card(Suit.HEARTS, Rank.TWO);
    public static final Card THREE_OF_HEARTS = new Card(Suit.HEARTS, Rank.THREE);
    public static final Card FOUR_OF_HEARTS = new Card(Suit.HEARTS, Rank.FOUR);
    public static final Card FIVE_OF_HEARTS = new Card(Suit.HEARTS, Rank.FIVE);
    public static final Card SIX_OF_HEARTS = new Card(Suit.HEARTS, Rank.SIX);
    public static final Card SEVEN_OF_HEARTS = new Card(Suit.HEARTS, Rank.SEVEN);
    public static final Card EIGHT_OF_HEARTS = new Card(Suit.HEARTS, Rank.EIGHT);
    public static final Card NINE_OF_HEARTS = new Card(Suit.HEARTS, Rank.NINE);
    public static final Card TEN_OF_HEARTS = new Card(Suit.HEARTS, Rank.TEN);
    public static final Card JACK_OF_HEARTS = new Card(Suit.HEARTS, Rank.JACK);
    public static final Card QUEEN_OF_HEARTS = new Card(Suit.HEARTS, Rank.QUEEN);
    public static final Card KING_OF_HEARTS = new Card(Suit.HEARTS, Rank.KING);
    public static final Card ACE_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.ACE);
    public static final Card TWO_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.TWO);
    public static final Card THREE_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.THREE);
    public static final Card FOUR_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.FOUR);
    public static final Card FIVE_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.FIVE);
    public static final Card SIX_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.SIX);
    public static final Card SEVEN_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.SEVEN);
    public static final Card EIGHT_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.EIGHT);
    public static final Card NINE_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.NINE);
    public static final Card TEN_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.TEN);
    public static final Card JACK_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.JACK);
    public static final Card QUEEN_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.QUEEN);
    public static final Card KING_OF_DIAMONDS = new Card(Suit.DIAMONDS, Rank.KING);

    private List<Card> cards = new LinkedList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card nextCard() {
        return cards.remove(cards.size() - 1);
    }
}

package no.nicolai.crazyeights.cards;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 */
public class DeckTest {

    public static final int CARDS_IN_DECK = 52;
    private static final String FRESH_DECK = "♦2♦3♦4♦5♦6♦7♦8♦9♦10♦J♦Q♦K♦A♣2♣3♣4♣5♣6♣7♣8♣9♣10♣J♣Q♣K♣A"
        + "♥2♥3♥4♥5♥6♥7♥8♥9♥10♥J♥Q♥K♥A♠2♠3♠4♠5♠6♠7♠8♠9♠10♠J♠Q♠K♠A";

    @Test
    public void freshDeck() {
        DefaultDeck deck = new DefaultDeck();
        assertThat(deck.cardsLeft(), is(CARDS_IN_DECK));
        assertThat(deck.toString(), is(FRESH_DECK));
    }

    @Test
    public void shuffle() {
        DefaultDeck deck = new DefaultDeck();
        deck.shuffle();
        // Not rock solid, a shuffled deck may have all cards in order,
        // and you may get the same results after two shuffles
        String firstShuffle = deck.toString();
        assertThat(firstShuffle, is(not((FRESH_DECK))));
        deck.shuffle();
        String secondShuffle = deck.toString();
        assertThat(secondShuffle, is(not((FRESH_DECK))));
        assertThat(secondShuffle, is(not((firstShuffle))));
        deck.shuffle();
        String thirdShuffle = deck.toString();
        assertThat(thirdShuffle, is(not((FRESH_DECK))));
        assertThat(thirdShuffle, is(not((firstShuffle))));
        assertThat(thirdShuffle, is(not((secondShuffle))));
    }

}

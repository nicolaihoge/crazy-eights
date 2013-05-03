package no.nicolai.crazyeights.cards;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 */
public class DeckTest {

    public static final int CARDS_IN_DECK = 52;

    @Test
    public void freshDeck() {
        Deck deck = new Deck();
        assertThat(deck.size(), is(CARDS_IN_DECK));
    }
}

package no.nicolai.crazyeights.card;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DeckTest {

    @Test
    public void createDeck() {
        Deck deck = new Deck();
        assertThat(deck.getCards().size(), is(52));
    }

    @Test
    public void shuffle() {
        Deck deck = new Deck();
        List<Card> newDeck = deck.getCards();
        deck.shuffle();
        assertThat(deck.getCards().size(), is(52));
    }


}

package no.nicolai.crazyeights.cards;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 */
public class CardTest {
    @Test
    public void testToString() throws Exception {
        Card twoOfSpades = new Card(Suit.SPADES, Rank.TWO);
        assertThat(twoOfSpades.toString(), is(CardSuits.SPADE.toString() + Rank.TWO.toString()));
    }
}

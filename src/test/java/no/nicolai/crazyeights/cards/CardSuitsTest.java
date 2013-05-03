package no.nicolai.crazyeights.cards;

import no.nicolai.crazyeights.cards.CardSuits;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 */
public class CardSuitsTest {
    @Test
    public void spadeCharacter() {
        char suit = '\u2660';
        assertThat(CardSuits.SPADE, is(suit));
    }

    @Test
    public void clubCharacter() {
            char suit = '\u2663';
        assertThat(CardSuits.CLUB, is(suit));
    }

    @Test
    public void heartsCharacter() {
        char suit = '\u2665';
        assertThat(CardSuits.HEARTS, is(suit));
    }

    @Test
    public void diamondCharacter() {
        char suit = '\u2666';
        assertThat(CardSuits.DIAMOND, is(suit));
    }


}

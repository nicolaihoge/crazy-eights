package no.nicolai.crazyeights.rules;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Rank;
import no.nicolai.crazyeights.cards.Suit;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 */
public class CrazyEightsRulesTest {

    private Rules rules = new CrazyEightsRules();

    @Test
    public void numberOfCardsPrPlayer() throws Exception {
        assertThat(rules.numberOfCardsPrPlayer(), is(5));
    }

    @Test
    public void validFirstCard() throws Exception {
        Card card = new Card(Suit.HEARTS, Rank.FIVE);
        assertTrue(rules.validFirstCard(card));
    }

    @Test
    public void invalidFirstCard() throws Exception {
        Card card = new Card(Suit.HEARTS, Rank.EIGHT);
        assertFalse(rules.validFirstCard(card));
    }
}

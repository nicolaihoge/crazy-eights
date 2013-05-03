package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Rank;
import no.nicolai.crazyeights.cards.Suit;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 */
public class AbstractPlayerTest {
    private static final String NAME = "Player";

    @Test
    public void getName() throws Exception {
        Player player = new AbstractPlayer(NAME);
        assertThat(player.getName(), is(NAME));
    }

    @Test
    public void dealCard() throws Exception {
        Player player = new AbstractPlayer(NAME);
        Card sevenOfClubs = new Card(Suit.CLUBS, Rank.SEVEN);
        player.dealCard(sevenOfClubs);
        assertThat(player.getHand().size(), is(1));
        assertTrue(player.getHand().contains(sevenOfClubs));
    }
}

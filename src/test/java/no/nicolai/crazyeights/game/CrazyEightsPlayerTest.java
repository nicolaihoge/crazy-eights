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
public class CrazyEightsPlayerTest {
    private static final String NAME = "Player";

    @Test
    public void getName() throws Exception {
        Player player = new CrazyEightsPlayer(NAME);
        assertThat(player.getName(), is(NAME));
    }

    @Test
    public void dealCard() throws Exception {
        Player player = new CrazyEightsPlayer(NAME);
        Card sevenOfClubs = new Card(Suit.CLUBS, Rank.SEVEN);
        player.dealCard(sevenOfClubs);
        assertThat(player.getHand().size(), is(1));
        assertTrue(player.getHand().contains(sevenOfClubs));
    }

    @Test
    public void nextMoveLegalMove() {
        Player player = new CrazyEightsPlayer(NAME);
        player.dealCard(new Card(Suit.CLUBS, Rank.SEVEN));
        player.nextMove(new Card(Suit.CLUBS, Rank.TWO), new int[]{2, 4});

    }
}

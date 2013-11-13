package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReversePlayerTest {

    private static final String NAME = "Reverse";
    private static final Card CARD1 = new Card(Suit.DIAMONDS, Rank.EIGHT);
    private static final Card CARD2 = new Card(Suit.SPADES, Rank.FIVE);
    private static final Card CARD3 = new Card(Suit.CLUBS, Rank.TEN);
    private static ReversePlayer reverse = new ReversePlayer(NAME);

    @Test
    public void getName() {
        assertThat(reverse.getName(), is(NAME));
    }

    @Test
    public void playingStrategy() throws Exception {
        reverse.deal(CARD1);
        reverse.deal(CARD2);
        reverse.deal(CARD3);

        assertThat(reverse.nextAction(Suit.CLUBS, Rank.EIGHT).getCard(), is(CARD3));
        assertThat(reverse.nextAction(Suit.CLUBS, Rank.EIGHT).getCard(), is(CARD2));
        assertThat(reverse.nextAction(Suit.CLUBS, Rank.EIGHT).getCard(), is(CARD1));
    }
}

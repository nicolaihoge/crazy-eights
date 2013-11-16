package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RandomPlayerTest {
    @Test
    public void nextAction() throws Exception {
        RandomPlayer random = new RandomPlayer("Random");
        List<Card> cards = new LinkedList<>();
        cards.add(Deck.EIGHT_OF_CLUBS);
        cards.add(Deck.THREE_OF_CLUBS);
        cards.add(Deck.KING_OF_HEARTS);
        cards.add(Deck.ACE_OF_HEARTS);
        cards.add(Deck.FOUR_OF_HEARTS);

        for (Card card : cards) {
            random.deal(card);
        }

        Action action = random.nextAction(Suit.HEARTS, Rank.KING);
        assertThat(action.getType(), is(Action.Type.PLAY_CARD));
        assertThat(action.getCard().getSuit(), is(Suit.HEARTS));
        assertTrue(cards.contains(action.getCard()));
        action = random.nextAction(Suit.HEARTS, Rank.KING);
        assertThat(action.getType(), is(Action.Type.PLAY_CARD));
        assertThat(action.getCard().getSuit(), is(Suit.HEARTS));
        assertTrue(cards.contains(action.getCard()));
        action = random.nextAction(Suit.CLUBS, Rank.KING);
        assertThat(action.getType(), is(Action.Type.PLAY_CARD));
        assertThat(action.getCard().getSuit(), is(Suit.CLUBS));
        assertTrue(cards.contains(action.getCard()));
        action = random.nextAction(Suit.HEARTS, Rank.KING);
        assertThat(action.getType(), is(Action.Type.PLAY_CARD));
        assertThat(action.getCard().getSuit(), is(Suit.HEARTS));
        assertTrue(cards.contains(action.getCard()));
        action = random.nextAction(Suit.CLUBS, Rank.KING);
        assertThat(action.getType(), is(Action.Type.PLAY_CARD));
        assertThat(action.getCard().getSuit(), is(Suit.CLUBS));
        assertTrue(cards.contains(action.getCard()));

    }
}

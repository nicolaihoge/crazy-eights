package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.player.IllegalActionPlayer;
import no.nicolai.crazyeights.player.Player;
import no.nicolai.crazyeights.player.ReversePlayer;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CardControllerTest {
    private static final Card CARD1 = Deck.ACE_OF_HEARTS;
    private static final Card CARD2 = Deck.TWO_OF_CLUBS;
    private static final Card CARD3 = Deck.FIVE_OF_DIAMONDS;
    private static final Card CARD4 = Deck.TEN_OF_CLUBS;
    private static final Card CARD5 = Deck.SEVEN_OF_DIAMONDS;
    private static final Card CARD6 = Deck.SIX_OF_CLUBS;

    @Test
    public void testDeal() throws Exception {
        CardController controller = new CardController();
        ReversePlayer playerA = new ReversePlayer("PlayerA");
        ReversePlayer playerB = new ReversePlayer("PlayerB");
        controller.deal(playerA, CARD1);
        controller.deal(playerB, CARD2);
        controller.deal(playerA, CARD3);
        controller.deal(playerB, CARD4);
        controller.deal(playerA, CARD5);
        controller.deal(playerB, CARD6);

        List<Card> playerACards = playerA.getCards();
        List<Card> playerBCards = playerB.getCards();
        assertThat(playerACards.size(), is(3));
        assertThat(playerBCards.size(), is(3));
        assertTrue(playerACards.contains(CARD1));
        assertTrue(playerACards.contains(CARD3));
        assertTrue(playerACards.contains(CARD5));
        assertTrue(playerBCards.contains(CARD2));
        assertTrue(playerBCards.contains(CARD4));
        assertTrue(playerBCards.contains(CARD6));
    }

    @Test (expected = IllegalActionException.class)
    public void testAskForNextAction() throws Exception {
        IllegalActionPlayer player = new IllegalActionPlayer();
        CardController controller = new CardController();
        controller.deal(player, Deck.ACE_OF_DIAMONDS);
        controller.askForNextAction(player);
    }
}

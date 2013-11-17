package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.game.deal.Dealer;
import no.nicolai.crazyeights.game.play.StandardPlay;
import no.nicolai.crazyeights.game.report.Result;
import no.nicolai.crazyeights.player.IllegalActionPlayer;
import no.nicolai.crazyeights.player.Player;
import no.nicolai.crazyeights.player.RandomPlayer;import no.nicolai.crazyeights.player.ReversePlayer;
import no.nicolai.crazyeights.player.TestPlayer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    public static final int NUM_OF_CARDS = 5;
    private Game game;
    private List<Player> players;

    @Before
    public void before() {
        players = new LinkedList<>();
        Player playerA = new ReversePlayer("Reverse");
        players.add(playerA);
        Player playerB = new RandomPlayer("Random");
        players.add(playerB);
        Player playerC = new IllegalActionPlayer();
        players.add(playerC);
        game = new Game(players);
    }

    @Test
    public void players() {
        List<Player> gamePlayers = game.getPlayers();
        assertTrue(gamePlayers.containsAll(players));
    }

    @Test
    public void deal() throws IOException {
        Set<Card> allDealtCards = new HashSet<>();
        game.deal();
        List<Player> gamePlayers = game.getPlayers();
        for (Player player : gamePlayers) {
            TestPlayer testPlayer = (TestPlayer) player;
            assertThat(testPlayer.getCards().size(), is(NUM_OF_CARDS));
            allDealtCards.addAll(testPlayer.getCards());
        }
        assertThat(allDealtCards.size(), is(NUM_OF_CARDS * gamePlayers.size()));
    }

    @Test
    public void playWithTwoCardsUntilWinner() throws IllegalActionException, IOException {
        Player playerA = new ReversePlayer("PlayerA");
        Player playerB = new ReversePlayer("PlayerB");
        List<Player> players = new LinkedList<>();
        players.add(playerA);
        players.add(playerB);
        Deck deckWithFiveCards = new Deck(
                Deck.ACE_OF_CLUBS,
                Deck.TWO_OF_CLUBS,
                Deck.THREE_OF_CLUBS,
                Deck.FOUR_OF_CLUBS,
                Deck.FIVE_OF_CLUBS);
        Game shortGame = new Game(players, StandardPlay.create(), 2, deckWithFiveCards);
        shortGame.deal();
        Result result = shortGame.play();
        assertThat(result.getWinner(), is(playerA));
    }


}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.card.Card;
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
            assertThat(testPlayer.getCards().size(), is(Game.NUM_OF_CARDS));
            allDealtCards.addAll(testPlayer.getCards());
        }
        assertThat(allDealtCards.size(), is(Game.NUM_OF_CARDS * gamePlayers.size()));
    }


}

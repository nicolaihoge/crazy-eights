package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.player.IllegalActionPlayer;
import no.nicolai.crazyeights.player.Player;
import no.nicolai.crazyeights.player.RandomPlayer;import no.nicolai.crazyeights.player.ReversePlayer;
import no.nicolai.crazyeights.player.TestPlayer;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    private Game game;
    private List<TestPlayer> players;

    @Before
    public void before() {
        players = new LinkedList<>();
        TestPlayer playerA = new ReversePlayer("Reverse");
        players.add(playerA);
        TestPlayer playerB = new RandomPlayer("Random");
        players.add(playerB);
        TestPlayer playerC = new IllegalActionPlayer();
        players.add(playerC);
        game = new Game(players);
    }

    @Test
    public void players() {
        List<Player> gamePlayers = game.getPlayers();
        assertTrue(gamePlayers.containsAll(players));
    }

    @Test
    public void deal() {
        game.deal();
        List<Player> gamePlayers = game.getPlayers();
        for (Player player : gamePlayers) {
            assertThat(player.)
        }
    }


}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.player.IllegalActionPlayer;
import no.nicolai.crazyeights.player.Player;
import no.nicolai.crazyeights.player.RandomPlayer;import no.nicolai.crazyeights.player.ReversePlayer;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class GameTest {

    @Test
    public void players() {

        List<Player> players = new LinkedList<>();
        Player playerA = new ReversePlayer("Reverse");
        players.add(playerA);
        Player playerB = new RandomPlayer("Random");
        players.add(playerB);
        Player playerC = new IllegalActionPlayer();
        players.add(playerC);
        Game game = new Game(players);
    }
}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.player.Player;
import no.nicolai.crazyeights.player.ReversePlayer;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReporterTest {
    private static final String PLAYER_NAME = "Player";

    @Test
    public void dealCard() throws Exception {
        StringWriter writer = new StringWriter();
        Reporter reporter = new Reporter(writer);
        Player player = new ReversePlayer(PLAYER_NAME);
        reporter.dealCard(player, Deck.EIGHT_OF_CLUBS);
        String expectedOutput = PLAYER_NAME + " Deal " + "C8";
        assertThat(writer.toString(), is(expectedOutput));
    }

    @Test
    public void handleNextAction() throws IllegalActionException, IOException {
        StringWriter writer = new StringWriter();
        Reporter reporter = new Reporter(writer);
        Player player = new ReversePlayer(PLAYER_NAME);
        Action action = new PlayCardAction(Deck.EIGHT_OF_CLUBS);
        reporter.handleNextAction(action, player);
        String expectedOutput = PLAYER_NAME + " " + Action.Type.PLAY_CARD.toString() + " C8";
        assertThat(writer.toString(), is(expectedOutput));
    }
}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;
import java.io.Writer;

public class Reporter extends AbstractPlay {

    private Writer writer;

    public Reporter(Writer writer) {
        this.writer = writer;
    }

    @Override
    protected void dealCard(Player player, Card card) throws IOException {
        writer.write(player.getName());
        writer.write(" Deal ");
        writer.write(card.toString());
    }

    @Override
    protected Action handleNextAction(Action nextAction, Player player) throws IllegalActionException, IOException {
        writer.write(player.getName());
        writer.write(" ");
        writer.write(nextAction.toString());
        if (nextAction.getType() == Action.Type.PLAY_CARD) {
            writer.write(" " + nextAction.getCard());
        }
        return nextAction;
    }
}

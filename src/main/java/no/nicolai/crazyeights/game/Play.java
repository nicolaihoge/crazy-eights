package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;

public interface Play {

    void deal(Player player, Card card) throws IOException;

    Action askForNextAction(Player player) throws IllegalActionException, IOException;
}

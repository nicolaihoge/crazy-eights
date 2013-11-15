package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.player.Player;

public interface Play {

    void deal(Player player, Card card);

    Action askForNextAction(Player player) throws IllegalActionException;
}

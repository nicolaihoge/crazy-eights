package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.player.Player;

public abstract class AbstractPlay implements Play {

    private AbstractPlay next;

    public void setNext(AbstractPlay play) {
        next = play;
    }

    @Override
    public void deal(Player player, Card card) {
        dealCard(player, card);
        if (next != null) {
            next.deal(player, card);
        }
    }

    protected abstract void dealCard(Player player, Card card);

    @Override
    public Action askForNextAction(Player player) throws IllegalActionException {
        Action nextAction = null;
        if (next != null) {
            nextAction = next.askForNextAction(player);
        }
        return handleNextAction(nextAction, player);
    }

    protected abstract Action handleNextAction(Action nextAction, Player player) throws IllegalActionException;
}

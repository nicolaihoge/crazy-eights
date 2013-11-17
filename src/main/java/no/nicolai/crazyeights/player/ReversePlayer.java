package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import no.nicolai.crazyeights.game.IllegalActionException;

public class ReversePlayer extends AbstractTestPlayer {

    public ReversePlayer(String name) {
        super(name);
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) throws IllegalActionException {
        return new PlayCardAction(cards.remove(cards.size() - 1));
    }
}

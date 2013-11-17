package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import no.nicolai.crazyeights.game.IllegalActionException;

public class RandomPlayer extends AbstractTestPlayer {

    public RandomPlayer(String name) {
        super(name);
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) throws IllegalActionException {
        int i = 0;
        Card nextCard = cards.get(i);
        while (nextCard.getSuit() != currentSuit) {
            nextCard = cards.get(i++);
        }
        cards.remove(nextCard);
        return new PlayCardAction(nextCard);
    }
}

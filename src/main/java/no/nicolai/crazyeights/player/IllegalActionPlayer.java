package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;

public class IllegalActionPlayer extends TestPlayer {

    public IllegalActionPlayer() {
        super("Illegal");
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) {
        return new PlayCardAction(Deck.ACE_OF_CLUBS);
    }

}

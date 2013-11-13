package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;

public class IllegalActionPlayer implements Player {

    @Override
    public String getName() {
        return "Illegal";
    }

    @Override
    public void deal(Card card) {
        // I don't care, because I cheat
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) {
        return new PlayCardAction(Deck.ACE_OF_CLUBS);
    }

    @Override
    public void actionByOtherPlayer(Player player, Action action) {
        // don't need to handle this
    }
}

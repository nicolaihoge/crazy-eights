package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import no.nicolai.crazyeights.game.IllegalActionException;
import no.nicolai.crazyeights.game.Play;

public interface Player {
    String getName();
    void actionByOtherPlayer(Player player, Action action);
    void deal(Card card);
    Action nextAction(Suit currentSuit, Rank currentRank) throws IllegalActionException ;
}

package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;

public interface Player {
    String getName();
    void deal(Card card);
    Action nextAction(Suit currentSuit, Rank currentRank);
    void actionByOtherPlayer(Player player, Action action);
}

package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;

import java.util.LinkedList;
import java.util.List;

public class ReversePlayer implements Player {

    private String name;
    private List<Card> cards = new LinkedList<>();

    public ReversePlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void deal(Card card) {
        cards.add(card);
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) {
        return new PlayCardAction(cards.remove(cards.size() - 1));
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public void actionByOtherPlayer(Player player, Action action) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractTestPlayer implements TestPlayer {

    protected String name;
    protected List<Card> cards = new LinkedList<>();

    public AbstractTestPlayer(String name) {
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
    public void actionByOtherPlayer(Player player, Action action) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;

import java.util.LinkedList;
import java.util.List;

/**
 */
public abstract class AbstractPlayer implements Player {
    private String name;
    private List<Card> hand = new LinkedList<>();

    public AbstractPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHand() {
        return hand;
    }

    @Override
    public void dealCard(Card card) {
        hand.add(card);
    }
}

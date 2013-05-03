package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class AbstractPlayer implements Player {
    private String name;
    private List<Card> cards = new LinkedList<>();

    public AbstractPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Card> getHand() {
        return cards;
    }

    @Override
    public void dealCard(Card card) {
        cards.add(card);
    }
}

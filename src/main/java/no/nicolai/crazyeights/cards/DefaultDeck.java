package no.nicolai.crazyeights.cards;

import java.util.*;

/**
 * Deck of cards
 */
public class DefaultDeck implements Deck {

    private List<Card> cards;
    private int fullSize;

    public DefaultDeck() {
        cards = new LinkedList<>();
        init();
        fullSize = cards.size();
    }

    @Override
    public int cardsLeft() {
        return cards.size();
    }

    @Override
    public boolean noCardsLeftInStockPile() {
        return cards.isEmpty();
    }

    @Override
    public void cardBackInStockPile(int index, Card element) {
        cards.add(index, element);
    }

    @Override
    public Card nextCardFromStockPile() {
        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    @Override
    public String toString() {
        StringBuilder deckPrint = new StringBuilder();
        for (Card card : cards) {
            deckPrint.append(card);
        }
        return deckPrint.toString();
    }

    public int getFullSize() {
        return fullSize;
    }

    private void init() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }
}

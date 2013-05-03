package no.nicolai.crazyeights.cards;

/**
 */
public interface Deck {
    Card remove(int index);
    void shuffle();
    boolean contains(Object o);
    public Card set(int index, Card element);
}

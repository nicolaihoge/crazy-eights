package no.nicolai.crazyeights.cards;

/**
 */
public interface Deck {
    Card remove(int index);
    void shuffle();
    boolean contains(Object o);
    public void add(int index, Card element);
    public int size();
}

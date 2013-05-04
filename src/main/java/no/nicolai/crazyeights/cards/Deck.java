package no.nicolai.crazyeights.cards;

/**
 * TODO rewrite to use more card friendly terms i.e. nextFromStockPile, returnToStockPile etc.
 */
public interface Deck {
    Card remove(int index);
    void shuffle();
    boolean contains(Object o);
    public void add(int index, Card element);
    public int size();
    public int getFullSize();
}

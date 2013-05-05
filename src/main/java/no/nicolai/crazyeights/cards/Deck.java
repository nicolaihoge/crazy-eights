package no.nicolai.crazyeights.cards;

/**
 * TODO rewrite to use more card friendly terms i.e. nextFromStockPile, returnToStockPile etc.
 */
public interface Deck {
    Card nextCardFromStockPile();
    void shuffle();
    void cardBackInStockPile(int index, Card element);
    boolean noCardsLeftInStockPile();
    public int cardsLeft();
    public int getFullSize();
}

package no.nicolai.crazyeights.cards;

/**
 */
public enum Suit {
    DIAMONDS(CardSuits.DIAMOND),
    CLUBS(CardSuits.CLUB),
    HEARTS(CardSuits.HEARTS),
    SPADES(CardSuits.SPADE);

    private Character representation;

    private Suit(Character representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation.toString();
    }
}

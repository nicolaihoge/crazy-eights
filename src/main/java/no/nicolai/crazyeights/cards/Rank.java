package no.nicolai.crazyeights.cards;

/**
 */
public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private String representation;

    private Rank(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}

package no.nicolai.crazyeights.card;

public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    SPADES("S"),
    HEARTS("H");

    private String name;

    private Suit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

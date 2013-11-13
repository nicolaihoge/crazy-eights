package no.nicolai.crazyeights.action;

import no.nicolai.crazyeights.card.Card;

public abstract class Action {
    public enum Type {
        PLAY_CARD,
        PASS,
        CALL_SUIT
    }

    public abstract Type getType();

    public Card getCard() {
        throw new UnsupportedOperationException("This action has no card.");
    }

}

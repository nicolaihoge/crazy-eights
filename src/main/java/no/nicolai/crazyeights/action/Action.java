package no.nicolai.crazyeights.action;

import no.nicolai.crazyeights.card.Card;

public abstract class Action {
    public enum Type {
        PLAY_CARD("Play"),
        PASS("Pass"),
        CALL_SUIT("Call");

        private String description;
        private Type(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
    }

    public abstract Type getType();

    public String toString() {
        return  getType().toString();
    }

    public Card getCard() {
        throw new UnsupportedOperationException("This action has no card.");
    }

}

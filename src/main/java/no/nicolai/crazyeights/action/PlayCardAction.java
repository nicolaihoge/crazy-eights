package no.nicolai.crazyeights.action;

import no.nicolai.crazyeights.card.Card;

public class PlayCardAction extends Action {

    private Card card;

    public PlayCardAction(Card card) {
        this.card = card;
    }

    @Override
    public Type getType() {
        return Type.PLAY_CARD;
    }

    @Override
    public Card getCard() {
        return card;
    }
}

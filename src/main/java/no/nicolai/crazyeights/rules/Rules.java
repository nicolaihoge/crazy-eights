package no.nicolai.crazyeights.rules;

import no.nicolai.crazyeights.cards.Card;

/**
 */
public interface Rules {

    int numberOfCardsPrPlayer();

    boolean validFirstCard(Card card);
}

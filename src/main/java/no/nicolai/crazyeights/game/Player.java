package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;

import java.util.List;

/**
 * A participant in the game
 */
public interface Player {
    /** Identifies the player */
    String getName();

    /** Return the hand of the player */
    List<Card> getHand();

    /** Add a card to the player's hand */
    void dealCard(Card remove);
}

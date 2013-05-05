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
    void dealCard(Card card);

    /**
     * Get the next valid move from the player.
     *
     * @param topOfDiscardPile the card facing up in the top of the discard pile
     * @param numberOfCardsLeftOtherPlayers array with the number of cards each of the other players have on their hand
     *                                      numberOfCardsLeftOtherPlayers[0] is the next player,
     *                                      numberOfCardsLeftOtherPlayers[numberOfCardsLeftOtherPlayers.size - 1]
     *                                      is the  player before the current player

     * @return a valid next move
     */
    Move nextMove(Card topOfDiscardPile, int[] numberOfCardsLeftOtherPlayers);
}

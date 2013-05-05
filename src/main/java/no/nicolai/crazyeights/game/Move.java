package no.nicolai.crazyeights.game;

/**
 * An action made by the player. The player may play more than one move in their turn, if the rules allow.
 */
public interface Move {
    boolean samePlayerAgain();
}

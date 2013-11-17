package no.nicolai.crazyeights.game.deal;

import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.game.play.Play;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;
import java.util.List;

public class Dealer {

    private final List<Player> players;
    private final Play play;
    private Deck deck = new Deck();
    private int numOfCards;

    public Dealer(List<Player> players, Play play, int numOfCards) {
        this.players = players;
        this.play = play;
        this.numOfCards = numOfCards;
        deck.shuffle();
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void deal() throws IOException {
        for (int i = 0; i < numOfCards; i++) {
            for (Player player : players) {
                play.deal(player, deck.nextCard());
            }
        }
    }
}

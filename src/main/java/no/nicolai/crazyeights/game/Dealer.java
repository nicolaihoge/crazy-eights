package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;
import java.util.List;

public class Dealer {

    private final List<Player> players;
    private final Play play;
    private final Deck deck = new Deck();

    public Dealer(List<Player> players, Play play) {
        this.players = players;
        this.play = play;
        deck.shuffle();
    }

    public void deal() throws IOException {
        for (int i = 0; i < Game.NUM_OF_CARDS; i++) {
            for (Player player : players) {
                play.deal(player, deck.nextCard());
            }
        }
    }
}

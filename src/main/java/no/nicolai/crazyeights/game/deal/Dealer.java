package no.nicolai.crazyeights.game.deal;

import no.nicolai.crazyeights.card.Deck;
import no.nicolai.crazyeights.game.play.AbstractPlay;
import no.nicolai.crazyeights.game.play.CardController;
import no.nicolai.crazyeights.game.play.Play;
import no.nicolai.crazyeights.game.report.StandardOutReporter;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;
import java.util.List;

public class Dealer {

    private final List<Player> players;
    private final Play play;
    private Deck deck;
    private int numOfCards;

    public Dealer(List<Player> players, Play play, int numOfCards) {
        this.players = players;
        this.play = play;
        this.numOfCards = numOfCards;
        this.deck = new Deck();
        deck.shuffle();
    }

    public Dealer(List<Player> players, Play play, int numOfCards, Deck deck) {
        this.players = players;
        this.deck = deck;
        this.play = play;
        this.numOfCards = numOfCards;
    }

    public void deal() throws IOException {
        for (int i = 0; i < numOfCards; i++) {
            for (Player player : players) {
                play.deal(player, deck.nextCard());
            }
        }
    }

    public void shuffle() {
        deck.shuffle();
    }
}

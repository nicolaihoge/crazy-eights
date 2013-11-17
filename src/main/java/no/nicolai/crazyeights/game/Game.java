package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.player.Player;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class Game {

    public static final int NUM_OF_CARDS = 5;
    private final List<Player> players;
    private final Play play;

    public Game(List<Player> players) {
        this.players = players;
        play = new Reporter(new BufferedWriter(new OutputStreamWriter(System.out))).setNext(new CardController());
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void deal() throws IOException {
        Dealer dealer = new Dealer(players, play);
        dealer.deal();
    }
}

package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.game.play.AbstractPlay;
import no.nicolai.crazyeights.game.play.CardController;
import no.nicolai.crazyeights.game.play.Play;
import no.nicolai.crazyeights.game.report.Reporter;
import no.nicolai.crazyeights.game.report.StandardOutReporter;
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
        AbstractPlay firstPlay = new StandardOutReporter();
        AbstractPlay secondPlay = new CardController();
        firstPlay.setNext(secondPlay);
        play = firstPlay;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void deal() throws IOException {
        Dealer dealer = new Dealer(players, play);
        dealer.deal();
    }
}

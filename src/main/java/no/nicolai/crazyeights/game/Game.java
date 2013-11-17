package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.game.deal.Dealer;
import no.nicolai.crazyeights.game.play.Play;
import no.nicolai.crazyeights.game.play.StandardPlay;
import no.nicolai.crazyeights.game.report.Result;
import no.nicolai.crazyeights.player.Player;

import java.io.IOException;
import java.util.List;

public class Game {

    private final List<Player> players;
    private final Play play;
    private final Dealer dealer;

    public Game(List<Player> players, int numOfCards) {
        this.players = players;
        numOfCards = 5;
        play = StandardPlay.create();
        dealer = new Dealer(players, play, numOfCards);
    }

    public Game(List<Player> players, Play play, Dealer dealer) {
        this.players = players;
        this.play = play;
        this.dealer = dealer;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void deal() throws IOException {
        dealer.deal();
    }

    public Result play() {

        return null;
    }
}

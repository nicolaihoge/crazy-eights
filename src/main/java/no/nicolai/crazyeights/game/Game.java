package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.card.Deck;
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

    public Game(List<Player> players) {
        this.players = players;
        this.play = StandardPlay.create();
        this.dealer = new Dealer(players, play, 5);
    }

    public Game(List<Player> players, Play play, int numOfCards, Deck deck) {
        this.players = players;
        this.play = play;
        this.dealer = new Dealer(players, play, numOfCards, deck);
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void deal() throws IOException {
        dealer.deal();
    }

    public Result play() throws IllegalActionException, IOException {
        Player winner = null;
        while (winner == null) {
            for (Player player: players) {
                play.askForNextAction(player);
            }
        }
        return new Result(winner);
    }
}

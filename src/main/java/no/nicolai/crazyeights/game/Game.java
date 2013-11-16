package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.player.Player;

import java.util.List;

public class Game {

    private final List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void deal() {


    }
}

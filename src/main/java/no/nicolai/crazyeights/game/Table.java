package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Deck;import java.util.HashMap;
import java.util.Map;

/**
 */
public class Table {
    private final Deck deck = new Deck();
    private final Map<String, Player> players = new HashMap<String, Player>();

    public Table() {
    }

    public void addPlayer(String name) {
        players.put(name, new Player(name));
    }

    public Map<String, Player> players() {
        return players;
    }

    /**
     * Deal cards to players
     */
    public void deal() {

    }
}

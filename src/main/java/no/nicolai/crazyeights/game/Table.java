package no.nicolai.crazyeights.game;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 */
public class Table {
    private Map<String, Player> players = new HashMap<String, Player>();

    public void addPlayer(String name) {
        players.put(name, new Player(name));
    }

    public Map<String, Player> players() {
        return players;
    }
}

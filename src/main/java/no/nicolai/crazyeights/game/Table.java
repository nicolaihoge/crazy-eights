package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Deck;
import no.nicolai.crazyeights.rules.Rules;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 */
public class Table {
    private final Deck deck = new Deck();
    private final Map<String, Player> players = new TreeMap<>();
    private Rules rules;

    public Table(Rules rules) {
        this.rules = rules;
    }

    public void addPlayer(String name) {
        players.put(name, new AbstractPlayer(name));
    }

    public Map<String, Player> getPlayers() {
        return players;
    }

    /**
     * Deal cards to getPlayers
     */
    public void deal() {
        deck.shuffle();
        for (int i = 0; i < rules.numberOfCardsPrPlayer(); i++) {
            for (Player player : players.values()) {
                player.dealCard(deck.remove(0));
            }
        }
    }
}

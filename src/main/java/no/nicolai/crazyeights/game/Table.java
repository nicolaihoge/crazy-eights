package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Deck;
import no.nicolai.crazyeights.rules.Rules;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 */
public class Table {
    private final Deck deck;
    private final Map<String, Player> players = new TreeMap<>();
    private Rules rules;
    private Card topOfDiscardPile;

    public Table(Rules rules, Deck deck) {
        this.rules = rules;
        this.deck = deck;
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

    /**
     * First card on discard pile
     */
    public void turnOverFirstCard() {
        topOfDiscardPile = deck.remove(0);
        if (!rules.validFirstCard(topOfDiscardPile)) {
            long seed = System.nanoTime();
            int newPosition = new Random(seed).nextInt(deck.size());
            deck.add(0, topOfDiscardPile);
        }

    }
}

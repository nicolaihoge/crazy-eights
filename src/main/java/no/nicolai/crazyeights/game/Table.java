package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Deck;
import no.nicolai.crazyeights.rules.Rules;

import java.util.*;

/**
 */
public class Table {
    private final Deck deck;
    private final Map<String, Player> players = new TreeMap<>();
    private Rules rules;
    private List<Card> discardPile = new LinkedList<>();

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
                player.dealCard(deck.nextCardFromStockPile());
            }
        }
    }

    /**
     * First card on discard pile
     */
    public void turnOverFirstCard() {
        boolean firstCardOk = false;
        while (!firstCardOk) {
            discardPile.add(0, deck.nextCardFromStockPile());
            if (!rules.validFirstCard(discardPile.get(0))) {
                long seed = System.nanoTime();
                int newPosition = new Random(seed).nextInt(deck.cardsLeft());
                deck.cardBackInStockPile(newPosition, discardPile.remove(0));
                firstCardOk = false;
            } else {
                firstCardOk = true;
            }
        }
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }
}

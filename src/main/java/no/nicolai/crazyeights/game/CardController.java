package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import no.nicolai.crazyeights.player.Player;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardController extends AbstractPlay {

    private Map<String, List<Card>> playersCards = new HashMap<>();

    @Override
    protected void dealCard(Player player, Card card) {
        if (!playersCards.containsKey(player.getName())) {
            playersCards.put(player.getName(), new LinkedList<Card>());
        }
        List<Card> playerCards = playersCards.get(player.getName());
        playerCards.add(card);
        player.deal(card);
    }

    @Override
    protected Action handleNextAction(Action nextAction, Player player) throws IllegalActionException {
        Action action = player.nextAction(Suit.SPADES, Rank.FIVE);
        if (action.getType() == Action.Type.PLAY_CARD) {
            Card card = action.getCard();
            if (!playersCards.get(player.getName()).contains(card)) {
                throw new IllegalActionException();
            }
        }
        return action;
    }
}

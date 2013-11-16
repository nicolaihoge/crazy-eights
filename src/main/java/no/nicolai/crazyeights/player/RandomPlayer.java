package no.nicolai.crazyeights.player;

import no.nicolai.crazyeights.action.Action;
import no.nicolai.crazyeights.action.PlayCardAction;
import no.nicolai.crazyeights.card.Card;
import no.nicolai.crazyeights.card.Rank;
import no.nicolai.crazyeights.card.Suit;
import no.nicolai.crazyeights.game.IllegalActionException;

import java.util.LinkedList;
import java.util.List;

public class RandomPlayer implements Player {

    private String name;
    private List<Card> cards = new LinkedList<>();

    public RandomPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void actionByOtherPlayer(Player player, Action action) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deal(Card card) {
        cards.add(card);
    }

    @Override
    public Action nextAction(Suit currentSuit, Rank currentRank) throws IllegalActionException {
        int i = 0;
        Card nextCard = cards.get(i);
        while (nextCard.getSuit() != currentSuit) {
            nextCard = cards.get(i++);
        }
        cards.remove(nextCard);
        return new PlayCardAction(nextCard);
    }
}

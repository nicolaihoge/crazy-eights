package no.nicolai.crazyeights.rules;

import no.nicolai.crazyeights.cards.Card;
import no.nicolai.crazyeights.cards.Rank;

/**
 * Rules for CrazyEights
 */
public class CrazyEightsRules implements Rules {

    private static Rank INVALID_FIRST__AND_LAST_CARD_RANK = Rank.EIGHT;

    @Override
    public int numberOfCardsPrPlayer() {
        return 5;
    }

    @Override
    public boolean validFirstCard(Card card) {
        return card.getRank() != INVALID_FIRST__AND_LAST_CARD_RANK;
    }
}

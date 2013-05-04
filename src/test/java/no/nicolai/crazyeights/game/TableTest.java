package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.cards.*;
import no.nicolai.crazyeights.rules.Rules;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.Mock;

/**
 */
public class TableTest {

    @Mock
    private Rules rules;
    @Mock
    private Deck deck;
    public static final String PLAYER1 = "Player1";
    public static final String PLAYER2 = "Player2";

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void addPlayer() {
        Table table = new Table(rules, new DefaultDeck());
        table.addPlayer(PLAYER1);
        table.addPlayer(PLAYER2);
        assertThat(table.getPlayers().size(), is(2));
        assertThat(table.getPlayers().get(PLAYER1).getName(), is(PLAYER1));
        assertThat(table.getPlayers().get(PLAYER2).getName(), is(PLAYER2));
    }

    @Test
    public void deal() {
        Integer numberOfCards = 5;
        when(rules.numberOfCardsPrPlayer()).thenReturn(numberOfCards);
        Table table = new Table(rules, new DefaultDeck());
        table.addPlayer(PLAYER1);
        table.deal();
        assertThat(table.getPlayers().get(PLAYER1).getHand().size(), is(numberOfCards));
    }

    @Test
    public void validFirstDiscardPileCard() {
        Card sevenOfHearts = new Card(Suit.HEARTS, Rank.SEVEN);
        when(rules.validFirstCard(sevenOfHearts)).thenReturn(true);
        Table table = new Table(rules, deck);
        when(deck.remove(0)).thenReturn(sevenOfHearts);
        table.turnOverFirstCard();
        verify(deck).remove(0);
        verifyNoMoreInteractions(deck);
    }

    @Test
    public void invalidFirstTwoDiscardPileCard() {
        when(rules.validFirstCard(any(Card.class))).thenReturn(false);
        when(rules.validFirstCard(any(Card.class))).thenReturn(false);
        when(rules.validFirstCard(any(Card.class))).thenReturn(true);
        Deck defaultDeck = new DefaultDeck();
        Table table = new Table(rules, defaultDeck);
        table.turnOverFirstCard();
        assertThat(table.getDiscardPile().size(), is(1));
        assertThat(defaultDeck.size(), is(defaultDeck.getFullSize() - 1));
    }

}

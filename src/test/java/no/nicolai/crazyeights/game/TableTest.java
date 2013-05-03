package no.nicolai.crazyeights.game;

import no.nicolai.crazyeights.rules.Rules;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.Mock;

/**
 */
public class TableTest {

    private Table table;
    @Mock
    private Rules rules;
    public static final String PLAYER1 = "Player1";
    public static final String PLAYER2 = "Player2";

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        table = new Table(rules);
        table.addPlayer(PLAYER1);
        table.addPlayer(PLAYER2);
    }


    @Test
    public void addPlayer() {
        assertThat(table.getPlayers().size(), is(2));
        assertThat(table.getPlayers().get(PLAYER1).getName(), is(PLAYER1));
        assertThat(table.getPlayers().get(PLAYER2).getName(), is(PLAYER2));
    }

    @Test
    public void deal() {
        table.deal();
        Integer numberOfCards = 5;
        when(rules.numberOfCardsPrPlayer()).thenReturn(numberOfCards);
        assertThat(table.getPlayers().get(PLAYER1).getHand().size(), is(numberOfCards));
    }
}

package no.nicolai.crazyeights.game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 */
public class TableTest {

    private Table table;
    public static final String PLAYER1 = "Player1";
    public static final String PLAYER2 = "Player2";

    @Before
    public void before() {
        table = new Table();
        table.addPlayer(PLAYER1);
        table.addPlayer(PLAYER2);
    }


    @Test
    public void addPlayer() {
        assertThat(table.players().size(), is(2));
        assertThat(table.players().get(PLAYER1).getName(), is(PLAYER1));
        assertThat(table.players().get(PLAYER2).getName(), is(PLAYER2));
    }

    @Test
    public void deal() {
        table.deal();
    }
}

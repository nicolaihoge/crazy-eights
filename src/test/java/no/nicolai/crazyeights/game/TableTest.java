package no.nicolai.crazyeights.game;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 */
public class TableTest {
    @Test
    public void addPlayer() {
        Table table = new Table();
        String name = "Player1";
        table.addPlayer(name);
        String name2 = "Player2";
        table.addPlayer(name2);
        assertThat(table.players().size(), is(2));
        assertThat(table.players().get(name).getName(), is(name));
        assertThat(table.players().get(name2).getName(), is(name2));
    }
}
